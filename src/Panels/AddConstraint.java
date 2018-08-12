package Panels;
import Classes.QueryManager;
import javax.swing.JOptionPane;
public class AddConstraint extends javax.swing.JPanel {
    QueryManager query;
    public String sql = "";
    String values = "", tableName ="", campo="", referenced = "", constraintName ="", constraintFuction = "";
    boolean flag = false;
    
   public AddConstraint() {
        initComponents();
        query = new QueryManager();
        
        this.jTxtReferenced.setEnabled(false);
        //this.jTxtConstraintName.setEnabled(false);
        this.jTxtCheckfunction.setEnabled(false);
        this.jRadioPK.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioFK = new javax.swing.JRadioButton();
        jRadioPK = new javax.swing.JRadioButton();
        jRadioCheck = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtTableName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTxtNombrecampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtReferenced = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtConstraintName = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtCheckfunction = new javax.swing.JTextField();

        jRadioFK.setText("Llave foranea");
        jRadioFK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFKActionPerformed(evt);
            }
        });

        jRadioPK.setText("Llave Primaria");
        jRadioPK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPKActionPerformed(evt);
            }
        });

        jRadioCheck.setText("Check");
        jRadioCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCheckActionPerformed(evt);
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

        jLabel2.setText("Nombre de Campo:");

        jTxtNombrecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombrecampoActionPerformed(evt);
            }
        });

        jLabel3.setText("Tabla Referenciada:");

        jTxtReferenced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtReferencedActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre del constraint:");

        jTxtConstraintName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtConstraintNameActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptarr");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jBtCancelar.setText("Cancelar");
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
            }
        });

        jButtonAgregar.setText("agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Check:");

        jTxtCheckfunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCheckfunctionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioFK)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioPK)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioCheck))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(310, 310, 310)
                                        .addComponent(jButtonAgregar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTxtReferenced, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTxtNombrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTxtConstraintName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTxtCheckfunction, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtCancelar)
                .addGap(239, 239, 239))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTxtConstraintName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTxtNombrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTxtCheckfunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTxtReferenced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioFK)
                    .addComponent(jRadioPK)
                    .addComponent(jRadioCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButtonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jBtCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNombrecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombrecampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombrecampoActionPerformed

    private void jTxtReferencedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtReferencedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtReferencedActionPerformed

    private void jTxtConstraintNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtConstraintNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtConstraintNameActionPerformed

    private void jRadioFKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFKActionPerformed
        this.jTxtReferenced.setEnabled(true);
        this.jTxtConstraintName.setEnabled(true);
        this.jRadioPK.setSelected(false);
        this.jRadioCheck.setSelected(false);
        this.jButtonAgregar.setEnabled(false);
        this.jTxtCheckfunction.setEnabled(false);
        
        this.jTxtCheckfunction.setText("");
        
    }//GEN-LAST:event_jRadioFKActionPerformed

    private void jRadioPKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPKActionPerformed
        this.jTxtReferenced.setEnabled(false);
        //this.jTxtConstraintName.setEnabled(false);
        this.jRadioFK.setSelected(false);
        this.jRadioCheck.setSelected(false);
        this.jRadioPK.setSelected(true);
        this.jTxtCheckfunction.setEnabled(false);
        this.jButtonAgregar.setEnabled(true);
        
        this.jTxtCheckfunction.setText("");
        this.jTxtConstraintName.setText("");
        this.jTxtReferenced.setText("");
    }//GEN-LAST:event_jRadioPKActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.tableName = this.jTxtTableName.getText();
        this.sql = "SELECT * FROM "+this.tableName;
        query.seTableData(this.jTable1, this.sql);
        this.jTable1.setVisible(true);
        this.limpiar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    private void limpiar(){
        this.jTxtNombrecampo.setText("");
        this.jTxtReferenced.setText("");
        this.jTxtConstraintName.setText("");
        this.jTxtCheckfunction.setText("");
        this.values = "";
        this.jRadioCheck.setSelected(false);
        this.jRadioFK.setSelected(false);
        this.jRadioPK.setSelected(true);
        
    }
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        //ALTER TABLE Activities ADD PRIMARY KEY (city_id, activity);
        this.tableName = this.jTxtTableName.getText();
        this.campo = this.jTxtNombrecampo.getText();
        
        if(flag){
            this.values += "," +this.campo;
        }else{
            this.values += this.campo+" ";
            flag = true;
        }
        System.out.println(this.values);
        this.jTxtNombrecampo.setText("");
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        //ALTER TABLE Activities ADD PRIMARY KEY (city_id, activity);
        if(this.jRadioPK.isSelected()){
            String conName = this.jTxtConstraintName.getText();
            this.sql = "ALTER TABLE "+this.tableName+" ADD CONSTRAINT "+conName+" PRIMARY KEY"+
                    " (" + this.values + ") ";
            //ddl.setSql(tableString);
            if(query.executeMethod(this.sql)){
                JOptionPane.showMessageDialog(this, "constraint creado con exito");
                this.tableName = "";
                this.jTxtTableName.setText("");
                this.values = "";
                //this.tableString = "";
                this.flag = false;
                this.limpiar();
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this,"El constraint no se pudo crear");
                this.limpiar();
                
            }
        }else if (this.jRadioFK.isSelected()){
//            ALTER TABLE CITIES ADD CONSTRAINT COUNTRY_FK FOREING KEY (COUNTRY) REFERENCES COUNTRIES (COUNTRY);
            String conName = this.jTxtConstraintName.getText();
            
            this.campo = this.jTxtNombrecampo.getText();
            this.referenced = this.jTxtReferenced.getText();
            
           this.sql = "ALTER TABLE "+this.tableName+" ADD CONSTRAINT "+conName+
                        " Foreign Key ("+this.campo+") "+"REFERENCES "+this.referenced+" ("+this.campo+")";
            //ddl.setSql(tableString);
            if(query.executeMethod(this.sql)){
                JOptionPane.showMessageDialog(this, "constraint creado con exito");
                this.tableName = "";
                this.jTxtTableName.setText("");
                this.flag = false;
                this.limpiar();
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this,"El constraint no se pudo crear");
                this.limpiar();
            }
        }else if (this.jRadioCheck.isSelected()){
//            ALTER TABLE CITIES ADD COONSTRAINT NEW_CONSTRAINT CHECK (REGION IS NOT NULL)
            String conName = this.jTxtConstraintName.getText();
            
            this.campo = this.jTxtNombrecampo.getText();
            this.referenced = this.jTxtReferenced.getText();
            this.constraintFuction = this.jTxtCheckfunction.getText();
         
            this.sql = "ALTER TABLE "+this.tableName+" ADD CONSTRAINT "+conName 
                    + " CHECK ("+this.campo+" "+this.constraintFuction+ ")";
            //ddl.setSql(tableString);
            if(query.executeMethod(this.sql)){
                JOptionPane.showMessageDialog(this, "constraint creado con exito");
                this.tableName = "";
                this.jTxtTableName.setText("");
                this.flag = false;
                this.limpiar();
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this,"El constraint no se pudo crear");
                this.limpiar();
                
            }
        }
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTxtCheckfunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCheckfunctionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCheckfunctionActionPerformed

    private void jRadioCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCheckActionPerformed
        this.jTxtReferenced.setEnabled(false);
        this.jTxtReferenced.setText("");
        this.jTxtConstraintName.setEnabled(true);
        this.jTxtConstraintName.setText("");
        this.jRadioFK.setSelected(false);
        this.jRadioPK.setSelected(false);
        this.jTxtCheckfunction.setEnabled(true);
        this.jButtonAgregar.setEnabled(false);
    }//GEN-LAST:event_jRadioCheckActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        this.limpiar();
        this.jTxtTableName.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jBtCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioCheck;
    private javax.swing.JRadioButton jRadioFK;
    private javax.swing.JRadioButton jRadioPK;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCheckfunction;
    private javax.swing.JTextField jTxtConstraintName;
    private javax.swing.JTextField jTxtNombrecampo;
    private javax.swing.JTextField jTxtReferenced;
    private javax.swing.JTextField jTxtTableName;
    // End of variables declaration//GEN-END:variables
}
