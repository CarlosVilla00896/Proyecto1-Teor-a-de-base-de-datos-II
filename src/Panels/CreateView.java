package Panels;
import Classes.QueryManager;
import javax.swing.JOptionPane;
public class CreateView extends javax.swing.JPanel {
    
    QueryManager query;
    public String sql = "";
    String values = "", tableName ="", campo="", viewName;
    boolean flag = false;
    
    public CreateView() {
        query = new QueryManager();
        initComponents();
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
        jTextView = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextCampos = new javax.swing.JTextField();
        jBtagregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jBtAceptar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();

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

        jLabel2.setText("Nombre View:");

        jLabel3.setText("Campos:");

        jBtagregar.setText("Agregar");
        jBtagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtagregarActionPerformed(evt);
            }
        });

        jBtAceptar.setText("Aceptar");
        jBtAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAceptarActionPerformed(evt);
            }
        });

        jBtCancelar.setText("Cancelar");
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
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
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtTablaname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextView, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jBtagregar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jBtAceptar)
                .addGap(49, 49, 49)
                .addComponent(jBtCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTablaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBtBuscar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jBtagregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtAceptar)
                    .addComponent(jBtCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void limpiar(){
        this.jTxtTablaname.setText("");
        this.jTextCampos.setText("");
        this.jTextView.setText("");
    }
    private void jBtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBuscarActionPerformed
        this.tableName = this.jTxtTablaname.getText();
        this.sql = "SELECT * FROM "+this.tableName;
        query.seTableData(this.jTable1, this.sql);
        this.jTable1.setVisible(true);
    }//GEN-LAST:event_jBtBuscarActionPerformed

    private void jBtagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtagregarActionPerformed
        //this.tableName = this.jTxtTablaname.getText();
        this.campo = this.jTextCampos.getText();
        
        if(flag){
            this.values += "," +this.campo;
        }else{
            this.values += this.campo+" ";
            flag = true;
        }
        System.out.println(this.values);
        this.jTextCampos.setText("");
    }//GEN-LAST:event_jBtagregarActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        this.limpiar();
        this.setVisible(false);
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jBtAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAceptarActionPerformed
        this.tableName = this.jTxtTablaname.getText();
        this.viewName = this.jTextView.getText();
        //CREATE VIEW V1 (C1, C2) AS SELECT SIN(C1) FROM T1;
        this.sql = "CREATE VIEW "+this.viewName+" ("+this.values+") "+ "AS SELECT "+this.values+" FROM "+this.tableName;
        if(query.executeMethod(this.sql)){
            JOptionPane.showMessageDialog(this,"View Creado");
            this.limpiar();
        }else{
            JOptionPane.showMessageDialog(this,"View no Creado");
            this.limpiar();
        }
    }//GEN-LAST:event_jBtAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAceptar;
    private javax.swing.JButton jBtBuscar;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtagregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCampos;
    private javax.swing.JTextField jTextView;
    private javax.swing.JTextField jTxtTablaname;
    // End of variables declaration//GEN-END:variables
}
