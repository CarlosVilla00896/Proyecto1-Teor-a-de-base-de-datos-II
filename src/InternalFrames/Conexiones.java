package InternalFrames;
import Panels.DropTable;
import Panels.CrearConexion;
import Panels.DDL;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Conexiones extends javax.swing.JInternalFrame {
    GridBagLayout layout = new GridBagLayout();
    DropTable dropTable;
    DDL ddl;
    CrearConexion add;
    String flag = "";
    
    
    public Conexiones() {
        initComponents();
        
        ddl = new DDL();
        add = new CrearConexion();
        
        this.jPanel1.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        this.jPanel1.add(add,c);
        
        this.jTabbedPane1.setComponentAt(1, ddl);
        this.jTabbedPane1.setTitleAt(1, "DDL");
       
        ddl.setVisible(true);
        add.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        jBtEliminar = new javax.swing.JButton();
        jBtCrearConex = new javax.swing.JButton();
        jBtChangeConex = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Connections Manager");
        setMinimumSize(new java.awt.Dimension(410, 308));

        jPanelBotones.setBackground(new java.awt.Color(51, 153, 255));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtEliminar.setText("Eliminar Conexion");
        jBtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEliminarActionPerformed(evt);
            }
        });

        jBtCrearConex.setText("Crear Conexion");
        jBtCrearConex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCrearConexActionPerformed(evt);
            }
        });

        jBtChangeConex.setText("Cambiar Conexion");
        jBtChangeConex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtChangeConexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtCrearConex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBotonesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jBtChangeConex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jBtCrearConex)
                .addGap(51, 51, 51)
                .addComponent(jBtEliminar)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelBotonesLayout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(jBtChangeConex)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelBotones, java.awt.BorderLayout.LINE_START);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtCrearConexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCrearConexActionPerformed
        this.jTabbedPane1.setTitleAt(0, "Crear Conexion");
        add.setVisible(true);
        flag = "add";
    }//GEN-LAST:event_jBtCrearConexActionPerformed

    private void jBtChangeConexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtChangeConexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtChangeConexActionPerformed

    private void jBtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtChangeConex;
    private javax.swing.JButton jBtCrearConex;
    private javax.swing.JButton jBtEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
