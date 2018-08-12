package Panels;
import Classes.QueryManager;
import javax.swing.JOptionPane;
import test.Conexion;
/**
 *
 * @author PC
 */
public class CrearConexion extends javax.swing.JPanel {
    
    Conexion cx;
    String username, password, database, protocolo, sqlConnect;
    QueryManager query;
    
    public CrearConexion() {
        initComponents();
        query = new QueryManager();
        cx = new Conexion();
        this.setDisable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTxtNombreBD = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jTxtUser = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jTxtPasword = new javax.swing.JTextField();
        jRbUsuario = new javax.swing.JRadioButton();
        jBtAceptar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Crear conexion");

        jLabel3.setText("Nombre de base de datos: ");

        jLabelUsuario.setText("Usuario: ");

        jLabelPassword.setText("Contraseña:");

        jRbUsuario.setText("Conexion con otro usuario");

        jBtAceptar.setText("Aceptar");
        jBtAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAceptarActionPerformed(evt);
            }
        });

        jBtCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jRbUsuario))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jBtAceptar)
                                .addGap(42, 42, 42)
                                .addComponent(jBtCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtNombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRbUsuario))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jTxtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtAceptar)
                    .addComponent(jBtCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void setDisable(){
        if(!this.jRbUsuario.isSelected()){
            System.out.println("User:"+cx.getAuxUser());
            System.out.println("Password: "+cx.getAuxPassword());
            this.jTxtUser.setText(cx.getAuxUser());
            this.jTxtPasword.setText(cx.getAuxPassword());
            this.jLabelUsuario.setEnabled(false);
            this.jLabelPassword.setEnabled(false);
            this.jTxtUser.setEnabled(false);
            this.jTxtPasword.setEnabled(false);
        }
    }
    
    private void setEnable(){
        this.jLabelUsuario.setEnabled(true);
        this.jLabelPassword.setEnabled(true);
        this.jTxtUser.setEnabled(true);
        this.jTxtPasword.setEnabled(true);
    }
    private void jBtAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAceptarActionPerformed
        this.database = this.jTxtNombreBD.getText();
        this.username = this.jTxtUser.getText();
        this.password = this.jTxtPasword.getText();
        
        this.protocolo = "protocol 'jdbc:derby://localhost:1527/'";
        query.executeMethod(protocolo);
        //connect 'resiste' user 'carlos_admin' password 'derby123' as resiste;
        this.sqlConnect = "connect "+"'"+this.database+"'"+" user "+"'"+this.username+"'"+" password "+"'"+this.password+"'"
                            +"as "+this.database+";";
        if(query.executeMethod(this.sqlConnect)){
            JOptionPane.showMessageDialog(this,"Conexion creada con exito");
        }else{
            if(JOptionPane.showConfirmDialog(this, "La base de datos no existe")==0){
                //0 es si o no?
            }else{
                
            }
        }
        
    }//GEN-LAST:event_jBtAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAceptar;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JRadioButton jRbUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtNombreBD;
    private javax.swing.JTextField jTxtPasword;
    private javax.swing.JTextField jTxtUser;
    // End of variables declaration//GEN-END:variables
}
