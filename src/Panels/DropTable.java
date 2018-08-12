package Panels;
import Classes.QueryManager;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class DropTable extends javax.swing.JPanel {
    
    String tableName;
    public String sql = "";
    QueryManager dao;
    
    public DropTable() {
        dao = new QueryManager();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextTableName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jBtVerTabla = new javax.swing.JButton();
        jBtEliminarTabla = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Eliminar Tabla");

        jLabel1.setText("Nombre de la tabla: ");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "(Vacío)"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jBtVerTabla.setText("Ver Tabla");
        jBtVerTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtVerTablaMouseClicked(evt);
            }
        });
        jBtVerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtVerTablaActionPerformed(evt);
            }
        });

        jBtEliminarTabla.setText("Eliminar");
        jBtEliminarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtEliminarTablaMouseClicked(evt);
            }
        });
        jBtEliminarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEliminarTablaActionPerformed(evt);
            }
        });

        jBtCancelar.setText("Cancelar");
        jBtCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtEliminarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtCancelar)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtVerTabla)))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtVerTabla))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtEliminarTabla)
                    .addComponent(jBtCancelar))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtEliminarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEliminarTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtEliminarTablaActionPerformed

    private void jBtVerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtVerTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtVerTablaActionPerformed

    private void jBtEliminarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEliminarTablaMouseClicked
        this.tableName = this.jTextTableName.getText();
        this.sql = "DROP TABLE "+ this.tableName;
        if(dao.executeMethod(sql)){
            JOptionPane.showMessageDialog(this, "La tabla ha sido eliminada");
            this.jTextTableName.setText("");
            this.jTable.setVisible(false);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this,"La tabla no se pudo eliminar");
        }
    }//GEN-LAST:event_jBtEliminarTablaMouseClicked

    private void jBtVerTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtVerTablaMouseClicked
       this.tableName = this.jTextTableName.getText();
        this.sql = "SELECT * FROM "+this.tableName;
        dao.seTableData(this.jTable, this.sql);
        this.jTable.setVisible(true);
        
    }//GEN-LAST:event_jBtVerTablaMouseClicked

    private void jBtCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtCancelarMouseClicked
        this.jTextTableName.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jBtCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtEliminarTabla;
    private javax.swing.JButton jBtVerTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextTableName;
    // End of variables declaration//GEN-END:variables
}
