package Panels;
import Classes.QueryManager;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Datos extends javax.swing.JPanel {
    QueryManager query;
    public String sql;
    String tableName ="", nombre_campo = "", tipo = "", precision = "", values1 = "",values2 = "", valor_campo = "";
    String condiciion = "";
    boolean flag = false;
    String labelArr[];
    
    public Datos() {
        initComponents();
        
        query = new QueryManager();
        this.jRbAddData.setSelected(true);
        this.jTxtTipo.setEnabled(false);
        this.jTextAreaCondicion.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtTableName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtValorCampo = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jBOk = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jRbAddData = new javax.swing.JRadioButton();
        jRbDeleteData = new javax.swing.JRadioButton();
        jBtAceptar = new javax.swing.JButton();
        jCbCampos = new javax.swing.JComboBox();
        jTxtTipo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCondicion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de la tabla:");

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

        jLabel2.setText("Campo:");

        jLabel3.setText("Valor:");

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButtonAgregar.setText("Agregar ");
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseClicked(evt);
            }
        });
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jBOk.setText("Ok");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        jBtCancelar.setText("Cancelar");
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
            }
        });

        jRbAddData.setText("Agregar Datos");
        jRbAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbAddDataActionPerformed(evt);
            }
        });

        jRbDeleteData.setText("Eliminar datos");
        jRbDeleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbDeleteDataActionPerformed(evt);
            }
        });

        jBtAceptar.setText("Aceptar");
        jBtAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAceptarActionPerformed(evt);
            }
        });

        jCbCampos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno" }));
        jCbCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbCamposActionPerformed(evt);
            }
        });

        jTxtTipo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTxtTipo.setText("Tipo");

        jTextAreaCondicion.setColumns(20);
        jTextAreaCondicion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCondicion);

        jLabel4.setText("Condicion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTxtValorCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jTxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jBOk, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtCancelar)
                                .addGap(0, 287, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jRbAddData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRbDeleteData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtAceptar)
                                .addGap(51, 51, 51)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtValorCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jRbAddData)
                    .addComponent(jRbDeleteData)
                    .addComponent(jBtAceptar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOk)
                    .addComponent(jBtCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void limpiar(){
        this.jTxtTableName.setText("");
        this.jTxtValorCampo.setText("");
         this.jTextAreaCondicion.setText("");
        this.flag = false;
        
    }
   
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.tableName = this.jTxtTableName.getText();
        this.sql = "SELECT * FROM "+this.tableName;
        query.seTableData(this.jTable1, this.sql);
        query.setComboBoxDataColumn(this.jCbCampos, this.sql);
        this.labelArr = query.labelArr;
        this.jTxtTipo.setText(this.labelArr[this.jCbCampos.getSelectedIndex()]);
        this.limpiar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseClicked

    }//GEN-LAST:event_jButtonAgregarMouseClicked

    private void jRbAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbAddDataActionPerformed
        this.jTxtValorCampo.setEnabled(true);
        this.jButtonAgregar.setEnabled(true);
        this.jRbDeleteData.setSelected(false);
        this.jTextAreaCondicion.setEnabled(false);
        this.jTextAreaCondicion.setText("");
        limpiar();
    }//GEN-LAST:event_jRbAddDataActionPerformed

    private void jRbDeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbDeleteDataActionPerformed
        this.jRbAddData.setSelected(false);
        this.jTxtValorCampo.setText("");
        this.jTxtValorCampo.setEnabled(false);
        this.jButtonAgregar.setEnabled(false);
        this.jTextAreaCondicion.setEnabled(true);
    }//GEN-LAST:event_jRbDeleteDataActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        this.values1 ="";
        this.values2 = "";
        this.sql = "";
        limpiar();
        this.jTxtTableName.setText("");
        this.jTxtTipo.setText("Tipo");
        this.setVisible(false);
    }//GEN-LAST:event_jBtCancelarActionPerformed
    
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
       this.nombre_campo = this.jCbCampos.getSelectedItem().toString();
       this.valor_campo = this.jTxtValorCampo.getText();
       
      // this.values1
       if(flag){
            this.values1 += "," +this.nombre_campo;
            this.values2 +=","+this.valor_campo;
       }else{
           this.values1 += this.nombre_campo+" ";
           this.values2 +=this.valor_campo+" ";
            flag = true;
       }
        System.out.println("Valores1: "+this.values1);
        System.out.println("valores2: "+this.values2);
        System.out.println("Tablename: "+this.tableName);
        this.jTxtValorCampo.setText("");
    }//GEN-LAST:event_jButtonAgregarActionPerformed
        
    private void jBtAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAceptarActionPerformed
       //this.tableName = this.jTxtTableName.getText();
        if(this.jRbAddData.isSelected()){
           this.sql = "INSERT INTO "+this.tableName+" ("+this.values1+") Values("+this.values2+")";
           if(query.executeMethod(this.sql)){
                JOptionPane.showMessageDialog(this, "Datos insertados exitosamente");
                this.limpiar();
                //this.jTxtTableName.setText("");
                this.values1="";
                this.values2="";
                query.seTableData(this.jTable1, "SELECT * FROM "+this.tableName);
            }else{
                JOptionPane.showMessageDialog(this, "No se pudideron insertar los datos");
                this.limpiar();
                this.values1="";
                this.values2="";
                this.sql="";
            }
       }else if(this.jRbDeleteData.isSelected()){
           this.condiciion = this.jTextAreaCondicion.getText();
           this.sql = "DELETE FROM "+this.tableName+" "+this.condiciion;
           if(query.executeUpdate(this.sql)){
               JOptionPane.showMessageDialog(this, "Datos eliminados exitosamente");
                this.limpiar();
                //this.jTxtTableName.setText("");
                this.values1="";
                this.values2="";
                query.seTableData(this.jTable1, "SELECT * FROM "+this.tableName);
           }else{
               JOptionPane.showMessageDialog(this, "No se pudideron eliminar los datos");
                this.limpiar();
                this.values1="";
                this.values2="";
                this.sql="";
           }
       }
       
        
    }//GEN-LAST:event_jBtAceptarActionPerformed

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        this.values1 ="";
        this.values2 = "";
        this.sql = "";
        limpiar();
        this.jTxtTableName.setText("");
        this.jTxtTipo.setText("Tipo");
        this.setVisible(false);
    }//GEN-LAST:event_jBOkActionPerformed

    private void jCbCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbCamposActionPerformed
        this.jTxtTipo.setText(this.labelArr[this.jCbCampos.getSelectedIndex()]);
    }//GEN-LAST:event_jCbCamposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOk;
    private javax.swing.JButton jBtAceptar;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox jCbCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRbAddData;
    private javax.swing.JRadioButton jRbDeleteData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaCondicion;
    private javax.swing.JTextField jTxtTableName;
    private javax.swing.JTextField jTxtTipo;
    private javax.swing.JTextField jTxtValorCampo;
    // End of variables declaration//GEN-END:variables
}
