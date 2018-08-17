package Panels;
import Classes.QueryManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class CreateTrigger extends javax.swing.JPanel {
    QueryManager query;
    String tableName = "", triggerName = "", triggerMoment = "", triggerAction = "", statement = "";
    int contTablaAudit = 1;
    public String sql = "";
    String arr[];
            
    public CreateTrigger() {
        initComponents();
        query = new QueryManager();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtTriggerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboMomento = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboAccion1 = new javax.swing.JComboBox();
        jButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtTableName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBtnAceptar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jComboBoxTablas = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTxtTableAudit = new javax.swing.JTextField();

        jLabel1.setText("Nombre del trigger:");

        jLabel2.setText("Momento:");

        jComboMomento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BEFORE", "AFTER" }));

        jLabel3.setText("Accion:");

        jComboAccion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INSERT", "UPDATE", "DELETE" }));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre de la tabla:");

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

        jLabel5.setText("Statement:");

        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jComboBoxTablas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno" }));
        jComboBoxTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTablasActionPerformed(evt);
            }
        });

        jLabel6.setText("INSERT INTO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonBuscar)
                                .addGap(0, 101, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(jBtnAceptar)
                                .addGap(28, 28, 28)
                                .addComponent(jBtnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboAccion1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTxtTriggerName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboMomento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtTableAudit)
                                    .addComponent(jComboBoxTablas, 0, 163, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtTriggerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboMomento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboAccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtTableAudit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAceptar)
                    .addComponent(jBtnCancelar))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void limpiar(){
        this.jTxtTriggerName.setText("");
        this.jComboAccion1.setSelectedIndex(0);
        this.jComboMomento.setSelectedIndex(0);
        this.jComboBoxTablas.setSelectedIndex(0);
    }
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.tableName = this.jTxtTableName.getText();
        this.sql = "SELECT * FROM "+this.tableName;
        query.seTableData(this.jTable1, this.sql);
        query.setComboBoxDataRows(this.jComboBoxTablas, "select t.tablename\n" +
                                "from sys.systables t inner join\n" +
                                "sys.sysschemas s on t.schemaid = s.schemaid\n" +
                                "where s.schemaname = 'TEST'");
        this.jTable1.setVisible(true);
        this.limpiar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        this.triggerName = this.jTxtTriggerName.getText();
        this.triggerMoment = this.jComboMomento.getSelectedItem().toString();
        this.triggerAction = this.jComboAccion1.getSelectedItem().toString();
        
        this.sql = "CREATE TRIGGER "+this.triggerName+" \n"+this.triggerMoment+" "+this.triggerAction+ " ON "+this.tableName
                +"\n FOR EACH ROW \n "+"INSERT INTO "+this.jTxtTableAudit.getText()+" VALUES("+this.contTablaAudit+
                        ",'carlos_admin', CURRENT_DATE,";
        
        if(this.jComboAccion1.getSelectedIndex() == 0){
            this.sql += "'INSERT') ";
        }else if(this.jComboAccion1.getSelectedIndex()==1){
            this.sql+= "'UPDATE'";
        }else if(this.jComboAccion1.getSelectedIndex()==2){
            this.sql+="'DELETE'";
        }
        if(query.executeMethod(this.sql)){
            JOptionPane.showMessageDialog(this, "Trigger insertado");
            this.limpiar();
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Trigger no insertado");
            this.limpiar();
        }
        contTablaAudit++;
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jComboBoxTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTablasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTablasActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        this.limpiar();
        this.jTxtTableName.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox jComboAccion1;
    private javax.swing.JComboBox jComboBoxTablas;
    private javax.swing.JComboBox jComboMomento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtTableAudit;
    private javax.swing.JTextField jTxtTableName;
    private javax.swing.JTextField jTxtTriggerName;
    // End of variables declaration//GEN-END:variables
}
