package Panels;

import Classes.QueryManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DropTrigger extends javax.swing.JPanel {
    QueryManager query;
    public String sql = "";
    String tableName ="", triggerName = "";
    
   public DropTrigger() {
        initComponents();
        query = new QueryManager();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTxtConstrainName = new javax.swing.JTextField();
        jBtEliminar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jBtBuscar.setText("Ver Triggers");
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(jBtBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jBtBuscar)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtConstrainName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtEliminar)
                    .addComponent(jBtCancelar))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBuscarActionPerformed
         this.sql = "select t.triggername, t.event, t.type, ta.tablename, s.schemaname \n "
        + "from sys.systriggers t inner join \n "
        + "sys.systables ta on t.tableid = ta.tableid inner join \n "
        + "sys.sysschemas s on ta.schemaid = s.schemaid ";
        query.seTableData(this.jTable1, this.sql);
        this.jTable1.setVisible(true);
    }//GEN-LAST:event_jBtBuscarActionPerformed
    private void limpiar(){
        this.jTxtConstrainName.setText("");
    }
    private void jBtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEliminarActionPerformed
        //ALTER TABLE Cities DROP CONSTRAINT COUNTRIES_FK;
        this.triggerName = this.jTxtConstrainName.getText();

        this.sql = "DROP TRIGGER "+this.triggerName;
        if(query.executeMethod(this.sql)){
            JOptionPane.showMessageDialog(this,"Se eliminó el trigger");
            this.limpiar();
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this,"No se eliminó el trigger");
            this.limpiar();
        }
    }//GEN-LAST:event_jBtEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtBuscar;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtConstrainName;
    // End of variables declaration//GEN-END:variables
}
