package Panels;
import Classes.QueryManager;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class NewTable extends javax.swing.JPanel {
    DDL ddl;
    String tableName = "", nombre_campo = "", tipo = "", precision = ""; 
    public String tableString = "";
    String values = "";
    String primary_key, not_null;
    boolean flag = false;
    QueryManager dao;
    
    public NewTable() {
        initComponents();
        ddl = new DDL();
        dao = new QueryManager();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextTableName = new javax.swing.JTextField();
        jBtAceptar = new javax.swing.JButton();
        jBtReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombreCampo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRbPK = new javax.swing.JRadioButton();
        jButtonAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBoxTipo = new javax.swing.JComboBox();
        jTxtPrecision = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonNull = new javax.swing.JRadioButton();

        jLabel1.setText("Nombre de la tabla:");

        jBtAceptar.setText("Aceptar");
        jBtAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtAceptarMouseClicked(evt);
            }
        });

        jBtReset.setText("Reset");
        jBtReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtResetMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Campos");

        jLabel3.setText("Nombre del campo:");

        jLabel4.setText("Tipo:");

        jRbPK.setText("Llave Primaria");

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButtonAgregar.setText("Agregar ");
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Nueva Tabla");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VARCHAR", "INT", "DOUBLE", "DECIMAL", "FLOAT", "CHAR", "BOOLEAN", "TIME", "TIMESTAMP", "DATE" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jLabel7.setText("Precision:");

        jRadioButtonNull.setText("Not null");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                        .addComponent(jSeparator2)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jBtAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jRadioButtonNull)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgregar)
                            .addComponent(jRbPK))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonNull)
                    .addComponent(jRbPK))
                .addGap(18, 18, 18)
                .addComponent(jButtonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBtReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed
    
    private void limpiar(){
        this.jTNombreCampo.setText("");
        this.jTxtPrecision.setText("");
        this.jComboBoxTipo.setSelectedIndex(0);
        this.jRbPK.setSelected(false);
        this.jRadioButtonNull.setSelected(false);
    }
    
    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseClicked
        this.tableName = this.jTextTableName.getText();
        this.nombre_campo = this.jTNombreCampo.getText();
        this.tipo = this.jComboBoxTipo.getSelectedItem().toString();
        this.precision = this.jTxtPrecision.getText();
        if (this.jRbPK.isSelected()){
            this.primary_key = "PRIMARY KEY";
        }else{
            this.primary_key = "";
        }
        
        
        if(this.jRadioButtonNull.isSelected()){
            this.not_null = "NOT NULL";
        }else{
            this.not_null = "";
        }
        
        if(flag){
            this.values += "," +this.nombre_campo + " " + this.tipo +" "+this.precision+" "+this.not_null+" "+this.primary_key;
        }else{
            this.values += this.nombre_campo + " " + this.tipo +" "+this.precision+" "+this.not_null+" "+this.primary_key;
            flag = true;
        }
        //System.out.println(this.values);
        
        //this.tableString = "CREATE TABLE "+this.tableName+" (" + this.values + ") ";
        //ddl.setSql(tableString);
        //System.out.println(this.tableString);
        this.limpiar();
    }//GEN-LAST:event_jButtonAgregarMouseClicked

    private void jBtAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtAceptarMouseClicked
        this.tableString = "CREATE TABLE "+this.tableName+" (" + this.values + ") ";
        ddl.setSql(tableString);
        if(dao.executeMethod(tableString)){
            JOptionPane.showMessageDialog(this, "Tabla creada con exito");
             this.limpiar();
            this.tableName = "";
            this.jTextTableName.setText("");
            this.values = "";
            //this.tableString = "";
            this.flag = false;
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this,"La tabla no se pudo crear");
        }
        
    }//GEN-LAST:event_jBtAceptarMouseClicked

    private void jBtResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtResetMouseClicked
        this.limpiar();
        this.tableName = "";
        this.jTextTableName.setText("");
        this.values = "";
        this.tableString = "";
        this.flag = false;
    }//GEN-LAST:event_jBtResetMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAceptar;
    private javax.swing.JButton jBtReset;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButtonNull;
    private javax.swing.JRadioButton jRbPK;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTNombreCampo;
    private javax.swing.JTextField jTextTableName;
    private javax.swing.JTextField jTxtPrecision;
    // End of variables declaration//GEN-END:variables
}
