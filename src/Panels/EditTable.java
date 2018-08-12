package Panels;
import Classes.QueryManager;
//import Dialogs.ModificarCampos;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class EditTable extends javax.swing.JPanel {
    public String tableName="", newTableName="", nombre_campo="", tipo="", precision="", not_null="";
    boolean flag = true;
    String values = "", modificarString = "",eliminarString = "";
    public String sql ="";
    QueryManager query;
//    ModificarCampos editColumn;
    
    public EditTable() {
        initComponents();
        query = new QueryManager();
//        editColumn = new ModificarCampos(null, true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTxtTableName = new javax.swing.JTextField();
        jBtBuscarTabla = new javax.swing.JButton();
        jButtonSaveChanges = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombreCampo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox();
        jTxtPrecision = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextNewTableName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtCancel = new javax.swing.JButton();
        jButtonModificarCampo = new javax.swing.JButton();
        jBtEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTNewName = new javax.swing.JTextField();
        jRadioAgregar = new javax.swing.JRadioButton();
        jRadioEliminar = new javax.swing.JRadioButton();
        jRadioModificar = new javax.swing.JRadioButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Editar tabla");

        jLabel1.setText("Nombre de la tabla:");

        jBtBuscarTabla.setText("Buscar tabla");
        jBtBuscarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtBuscarTablaMouseClicked(evt);
            }
        });

        jButtonSaveChanges.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSaveChanges.setText("OK");
        jButtonSaveChanges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveChangesMouseClicked(evt);
            }
        });
        jButtonSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveChangesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jLabel2.setText("Agregar/Eliminar/Modificar Campos");

        jLabel3.setText("Nombre del campo:");

        jLabel4.setText("Tipo:");

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButtonAgregar.setText("Agregar  Campos");
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseClicked(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VARCHAR", "INT", "DOUBLE", "DECIMAL", "FLOAT", "CHAR", "BOOLEAN", "TIME", "TIMESTAMP", "DATE" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jTxtPrecision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPrecisionActionPerformed(evt);
            }
        });

        jLabel7.setText("Precision:");

        jLabel5.setText("Nuevo Nombre del tabla:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "(Vacio)", "(Vacio)", "(Vacio)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBtCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtCancel.setText("Cancelar");

        jButtonModificarCampo.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButtonModificarCampo.setText("Modificar Campo");
        jButtonModificarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModificarCampoMouseClicked(evt);
            }
        });

        jBtEliminar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jBtEliminar.setText("Eliminar Campos");
        jBtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtEliminarMouseClicked(evt);
            }
        });

        jLabel8.setText("Nuevo nombre del campo:");

        jRadioAgregar.setText("Agregar");

        jRadioEliminar.setText("Eliminar");

        jRadioModificar.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioModificar)
                                .addGap(95, 95, 95)
                                .addComponent(jButtonAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonModificarCampo)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtBuscarTabla)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBtCancel)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextNewTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addComponent(jTNombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTNewName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtBuscarTabla))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPrecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextNewTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTNombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModificarCampo)
                        .addComponent(jBtEliminar)
                        .addComponent(jButtonAgregar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioAgregar)
                        .addComponent(jRadioEliminar)
                        .addComponent(jRadioModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveChanges)
                    .addComponent(jBtCancel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void limpiar(){
        this.jTNombreCampo.setText("");
        this.jTxtPrecision.setText("");
        this.jComboBoxTipo.setSelectedIndex(0);
    }
    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseClicked
        this.tableName = this.jTextNewTableName.getText();
        this.nombre_campo = this.jTNombreCampo.getText();
        this.tipo = this.jComboBoxTipo.getSelectedItem().toString();
        this.precision = this.jTxtPrecision.getText();
        
        this.sql = " ALTER TABLE "+this.tableName+" ADD COLUMN "+this.nombre_campo+" "+this.tipo +" "+this.precision; 
        
        if(query.executeMethod(this.sql)){
            JOptionPane.showMessageDialog(this, "Campos agregados con exito");
            this.limpiar();
            this.flag = true;
            query.seTableData(this.jTable1, "SELECT * FROM "+this.tableName);
            //this.sql="";
        }else{
            JOptionPane.showMessageDialog(this, "Campos no fueron agregados, lo siento");
        }
        System.out.println(this.sql);
        this.limpiar();
    }//GEN-LAST:event_jButtonAgregarMouseClicked

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jTxtPrecisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrecisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPrecisionActionPerformed

    private void jButtonSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveChangesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveChangesActionPerformed

    private void jBtBuscarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtBuscarTablaMouseClicked
        this.tableName = this.jTxtTableName.getText();
        this.jTextNewTableName.setText(this.tableName);
        this.sql = "SELECT * FROM "+this.tableName;
        query.seTableData(this.jTable1, this.sql);
       
    }//GEN-LAST:event_jBtBuscarTablaMouseClicked

    private void jButtonModificarCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarCampoMouseClicked
//        editColumn.setVisible(true);
        String newName = this.jTNewName.getText();
        String newType = this.jComboBoxTipo.getSelectedItem().toString();
        //ALTER TABLE MY_TABLE ADD COLUMN NEW_COLUMN BLOB(2147483647);
//        UPDATE MY_TABLE SET NEW_COLUMN=MY_COLUMN;
//        ALTER TABLE MY_TABLE DROP COLUMN MY_COLUMN;
//        RENAME COLUMN MY_TABLE.NEW_COLUMN TO MY_COLUMN;
        String sql1 = "ALTER TABLE "+this.tableName+" ADD COLUMN "+newName+" "+newType+this.jTxtPrecision.getText();
        boolean d1 = query.executeMethod(sql1);
        String sql2 = "UPDATE "+this.tableName+" SET "+newName+"="+this.jTNombreCampo.getText();
        boolean d2 = query.executeMethod(sql2);
        String sql3 = "ALTER TABLE "+this.tableName+" DROP COLUMN "+this.jTNombreCampo.getText();
        boolean d3= query.executeMethod(sql3);
//        String sql4 = "RENAME COLUMN "+this.tableName+"."+newName+" TO "+this.jTNombreCampo.getText();
//        boolean d4 = query.executeMethod(sql4);
        this.sql = "ALTER TABLE "+this.tableName+" ADD COLUMN "+newName+" "+newType+"\n"
                    +"UPDATE "+this.tableName+" SET "+newName+"="+this.jTNombreCampo.getText()+"\n"
                    +"ALTER TABLE "+this.tableName+" DROP COLUMN "+this.jTNombreCampo.getText()+"\n"
                    + "RENAME COLUMN "+this.tableName+"."+newName+" TO "+this.jTNombreCampo.getText();
        if(d1 && d2 && d3 ){
            JOptionPane.showMessageDialog(this, "Campo modificado exitosamente");
            query.seTableData(this.jTable1, "SELECT * FROM "+this.tableName);
            this.limpiar();
            this.jTNewName.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "El campo no se puede modificar porque no existe o tiene restricion de llava foranea");
        }
    }//GEN-LAST:event_jButtonModificarCampoMouseClicked

    private void jButtonSaveChangesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaveChangesMouseClicked
        this.setVisible(false);
        this.limpiar();
    }//GEN-LAST:event_jButtonSaveChangesMouseClicked

    private void jBtEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtEliminarMouseClicked
        this.tableName = this.jTxtTableName.getText();
        this.nombre_campo = this.jTNombreCampo.getText();
        //ALTER TABLE Cities DROP COLUMN city_id RESTRICT;
        this.sql = "ALTER TABLE "+this.tableName+" DROP COLUMN "+this.nombre_campo+" RESTRICT";
        if(query.executeMethod(this.sql)){
            JOptionPane.showMessageDialog(this, "Campo eliminado exitosamente");
            query.seTableData(this.jTable1, "SELECT * FROM "+this.tableName);
            this.limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "El campo no se puede eliminar porque no existe o tiene restricion de llava foranea");
        }
    }//GEN-LAST:event_jBtEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtBuscarTabla;
    private javax.swing.JButton jBtCancel;
    private javax.swing.JButton jBtEliminar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonModificarCampo;
    private javax.swing.JButton jButtonSaveChanges;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioAgregar;
    private javax.swing.JRadioButton jRadioEliminar;
    private javax.swing.JRadioButton jRadioModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTNewName;
    private javax.swing.JTextField jTNombreCampo;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextNewTableName;
    private javax.swing.JTextField jTxtPrecision;
    private javax.swing.JTextField jTxtTableName;
    // End of variables declaration//GEN-END:variables
}
