package Panels;

public class DDL extends javax.swing.JPanel {
    
    public volatile String sql = "";
    
    public DDL() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDDL = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.BorderLayout());

        jTextAreaDDL.setColumns(65);
        jTextAreaDDL.setFont(new java.awt.Font("Monospaced", 2, 13)); // NOI18N
        jTextAreaDDL.setRows(20);
        jTextAreaDDL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextAreaDDL.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextAreaDDL);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    public void setSql(String sql){
        this.sql = sql;
        //System.out.println("ddl: "+this.sql);
        this.jTextAreaDDL.setText(this.sql);
    }
    
    public String getSql(){
        return this.sql;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDDL;
    // End of variables declaration//GEN-END:variables
}
