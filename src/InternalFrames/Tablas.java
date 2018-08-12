package InternalFrames;
import Panels.NewTable;
import Panels.DropTable;
import Panels.EditTable;
import Panels.ListarTablas;
import Panels.DDL;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
/**
 *
 * @author PC
 */
public class Tablas extends javax.swing.JInternalFrame {
    GridBagLayout layout = new GridBagLayout();
    
    DDL ddl;
    NewTable newTable;
    DropTable drop;
    EditTable editTable;
    ListarTablas listTable;
    String logMessage = "", sqlShow ="";
    String flag = "";
    
   public Tablas() {
        initComponents();
        ddl = new DDL();
        newTable = new NewTable();
        drop = new DropTable();
        editTable = new EditTable();
        listTable = new ListarTablas();
        this.jPanelPantalla.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(newTable,c);
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(drop,c);
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(editTable,c);
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(listTable,c);
        
        this.jTabbedPane1.setComponentAt(1, ddl);
        this.jTabbedPane1.setTitleAt(1, "DDL");
        
        newTable.setVisible(false);
        drop.setVisible(false);
        editTable.setVisible(false);
        listTable.setVisible(false);
        ddl.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        jBtEliminar = new javax.swing.JButton();
        jBtNew = new javax.swing.JButton();
        jBtListar = new javax.swing.JButton();
        jBtModify = new javax.swing.JButton();
        jBtDDL = new javax.swing.JButton();
        jBtModifiyData = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelPantalla = new javax.swing.JPanel();
        jPanelDDL = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tablas");

        jPanelBotones.setBackground(new java.awt.Color(51, 153, 255));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtEliminar.setText("Eliminar Tabla");
        jBtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtEliminarMouseClicked(evt);
            }
        });

        jBtNew.setText("Nueva Tabla");
        jBtNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtNewMouseClicked(evt);
            }
        });

        jBtListar.setText("Listar Tablas");
        jBtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtListarActionPerformed(evt);
            }
        });

        jBtModify.setText("Modificar Tabla");
        jBtModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtModifyMouseClicked(evt);
            }
        });

        jBtDDL.setText("DDL");
        jBtDDL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtDDLMouseClicked(evt);
            }
        });

        jBtModifiyData.setText("Modificar Datos");
        jBtModifiyData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtModifiyDataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtDDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtModifiyData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jBtNew)
                .addGap(18, 18, 18)
                .addComponent(jBtModify)
                .addGap(18, 18, 18)
                .addComponent(jBtModifiyData)
                .addGap(14, 14, 14)
                .addComponent(jBtListar)
                .addGap(18, 18, 18)
                .addComponent(jBtEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtDDL)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBotones, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanelPantallaLayout = new javax.swing.GroupLayout(jPanelPantalla);
        jPanelPantalla.setLayout(jPanelPantallaLayout);
        jPanelPantallaLayout.setHorizontalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );
        jPanelPantallaLayout.setVerticalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanelPantalla);

        jPanelDDL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanelDDLFocusGained(evt);
            }
        });
        jPanelDDL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDDLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelDDLLayout = new javax.swing.GroupLayout(jPanelDDL);
        jPanelDDL.setLayout(jPanelDDLLayout);
        jPanelDDLLayout.setHorizontalGroup(
            jPanelDDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );
        jPanelDDLLayout.setVerticalGroup(
            jPanelDDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanelDDL);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtNewMouseClicked
        newTable.setVisible(true);
        drop.setVisible(false);
        editTable.setVisible(false);
        listTable.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "New Table");
        flag = "new";
        
        
    }//GEN-LAST:event_jBtNewMouseClicked
    
    public void ddlTab(){
        if(this.jTabbedPane1.getSelectedIndex() == 1){
            String sql = newTable.tableString;
            System.out.println("ddl en new table: "+sql);
            //ddl.setSql(sql);
        }
    }
    private void jBtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEliminarMouseClicked
        newTable.setVisible(false);
        drop.setVisible(true);
        editTable.setVisible(false);
        listTable.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "Drop Table");
        flag = "drop";
    }//GEN-LAST:event_jBtEliminarMouseClicked

    private void jBtModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtModifyMouseClicked
        newTable.setVisible(false);
        drop.setVisible(false);
        editTable.setVisible(true);
        listTable.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "Edit Table");
        flag = "edit";
    }//GEN-LAST:event_jBtModifyMouseClicked

    private void jBtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtListarActionPerformed
        newTable.setVisible(false);
        drop.setVisible(false);
        editTable.setVisible(false);
        listTable.setVisible(true);
        this.jTabbedPane1.setTitleAt(0, "Listar Tables");
        flag = "listar";
        
    }//GEN-LAST:event_jBtListarActionPerformed

    private void jPanelDDLFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanelDDLFocusGained

    }//GEN-LAST:event_jPanelDDLFocusGained

    private void jPanelDDLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDDLMouseClicked
        
    }//GEN-LAST:event_jPanelDDLMouseClicked

    private void jBtDDLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtDDLMouseClicked
        ddl.setSql("");
        System.out.println("Flag = "+this.flag);
//        String sqlNewTable = newTable.tableString;
//        String sqlDroptable = drop.sql;
//        String edit = editTable.sql;
//        String listar = listTable.sql;
        switch(flag){
            case "new":
                this.sqlShow = newTable.tableString;
                System.out.println("Entro a new");
                break;
            case "drop":
                this.sqlShow = drop.sql;
                System.out.println("Entro a drop");
                break;
            case "edit":
                this.sqlShow =  editTable.sql;
                System.out.println("Entro a edit");
                break;
            case"listar":
                this.sqlShow = listTable.sql;
                System.out.println("Entro a listar");
                break;
        }
        //String sql = sqlNewTable+"\n"+sqlDroptable+"\n"+edit+"\n"+listar+"\n";
        this.logMessage += sqlShow+"\n";
        System.out.println("ddl en logmessage: "+logMessage);
        ddl.setSql(logMessage);
    }//GEN-LAST:event_jBtDDLMouseClicked

    private void jBtModifiyDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtModifiyDataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtModifiyDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtDDL;
    private javax.swing.JButton jBtEliminar;
    private javax.swing.JButton jBtListar;
    private javax.swing.JButton jBtModifiyData;
    private javax.swing.JButton jBtModify;
    private javax.swing.JButton jBtNew;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelDDL;
    private javax.swing.JPanel jPanelPantalla;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
