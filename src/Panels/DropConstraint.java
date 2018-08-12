package Panels;
import Classes.QueryManager;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class DropConstraint extends javax.swing.JPanel {
    
    QueryManager query;
    public String sql = "";
    String tableName ="", constrainName = "";
    
    public DropConstraint() {
        initComponents();
        query = new QueryManager();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtTablaname = new javax.swing.JTextField();
        jBtBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTxtConstrainName = new javax.swing.JTextField();
        jBtEliminar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("Nombre de la tabla:");

        jBtBuscar.setText("Buscar");
        jBtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Nombre del constraint:");

        jBtEliminar.setText("Eliminar");
        jBtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEliminarActionPerformed(evt);
            }
        });

        jBtCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtConstrainName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jBtEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTxtTablaname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtTablaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtBuscar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtConstrainName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtEliminar)
                    .addComponent(jBtCancelar))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar(){
        this.jTxtTablaname.setText("");
        this.jTxtConstrainName.setText("");
    }
    private void jBtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEliminarActionPerformed
        //ALTER TABLE Cities DROP CONSTRAINT COUNTRIES_FK;
        this.tableName = this.jTxtTablaname.getText();
        this.constrainName = this.jTxtConstrainName.getText();
        
        this.sql = "ALTER TABLE "+this.tableName+" DROP CONSTRAINT "+this.constrainName;
        if(query.executeMethod(this.sql)){
            JOptionPane.showMessageDialog(this,"Se eliminó el constraint");
            this.limpiar();
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this,"No se eliminó el constraint");
            this.limpiar();
        }
    }//GEN-LAST:event_jBtEliminarActionPerformed

    private void jBtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBuscarActionPerformed
        this.tableName = this.jTxtTablaname.getText();
        this.sql = "SELECT * FROM "+this.tableName;
        query.seTableData(this.jTable1, this.sql);
        this.jTable1.setVisible(true);
    }//GEN-LAST:event_jBtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtBuscar;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtConstrainName;
    private javax.swing.JTextField jTxtTablaname;
    // End of variables declaration//GEN-END:variables
}
