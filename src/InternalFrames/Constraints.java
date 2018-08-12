package InternalFrames;
import Classes.QueryManager;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import Panels.DDL;
import Panels.AddConstraint;
import Panels.DropConstraint;
import Panels.ListarConstraints;

/**
 *
 * @author PC
 */
public class Constraints extends javax.swing.JInternalFrame {
    GridBagLayout layout = new GridBagLayout();
    DDL ddl;
    AddConstraint add;
    DropConstraint drop;
    ListarConstraints list;
    String flag = "";
    String logMessage = "", sqlShow ="";
    
   public Constraints() {
        initComponents();
        ddl = new DDL();
        add = new AddConstraint();
        drop = new DropConstraint();
        list = new ListarConstraints();
        
        this.jPanelPantalla.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(add,c);
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(drop,c);
        c.gridx = 0;
        c.gridy = 0;
        this.jPanelPantalla.add(list,c);
        
        this.jTabbedPane1.setComponentAt(1, ddl);
        this.jTabbedPane1.setTitleAt(1, "DDL");
        
        ddl.setVisible(true);
        add.setVisible(false);
        drop.setVisible(false);
        list.setVisible(false);
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDrop = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jBtDDL = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelPantalla = new javax.swing.JPanel();
        jPanelDDL = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSTRAINTS");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonAdd.setText("Add constraint");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDrop.setText("Drop constraint");
        jButtonDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDropActionPerformed(evt);
            }
        });

        jButtonList.setText("List Constraints");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });

        jBtDDL.setText("DDL");
        jBtDDL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtDDLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonDrop)
                            .addComponent(jButtonList))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jBtDDL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDrop)
                .addGap(18, 18, 18)
                .addComponent(jButtonList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtDDL)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelPantallaLayout = new javax.swing.GroupLayout(jPanelPantalla);
        jPanelPantalla.setLayout(jPanelPantallaLayout);
        jPanelPantallaLayout.setHorizontalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanelPantallaLayout.setVerticalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanelPantalla);

        javax.swing.GroupLayout jPanelDDLLayout = new javax.swing.GroupLayout(jPanelDDL);
        jPanelDDL.setLayout(jPanelDDLLayout);
        jPanelDDLLayout.setHorizontalGroup(
            jPanelDDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanelDDLLayout.setVerticalGroup(
            jPanelDDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanelDDL);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        list.setVisible(true);
        add.setVisible(false);
        drop.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "Listar Constraints");
        flag = "list";
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        add.setVisible(true);
        drop.setVisible(false);
        list.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "Add Constraint");
        flag = "add";
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDropActionPerformed
        drop.setVisible(true);
        add.setVisible(false);
        list.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "Drop Constraint");
        flag = "drop";
    }//GEN-LAST:event_jButtonDropActionPerformed

    private void jBtDDLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtDDLMouseClicked
        ddl.setSql("");
        System.out.println("Flag = "+this.flag);
        //        String sqlNewTable = newTable.tableString;
        //        String sqlDroptable = drop.sql;
        //        String edit = editTable.sql;
        //        String listar = listTable.sql;
        switch(flag){
            case "add":
            this.sqlShow = add.sql;
            System.out.println("Entro a new");
            break;
            case "drop":
            this.sqlShow = drop.sql;
            System.out.println("Entro a drop");
            break;
            case"list":
            this.sqlShow = list.sql;
            System.out.println("Entro a listar");
            break;
        }
        //String sql = sqlNewTable+"\n"+sqlDroptable+"\n"+edit+"\n"+listar+"\n";
        this.logMessage += sqlShow+"\n";
        System.out.println("ddl en logmessage: "+logMessage);
        ddl.setSql(logMessage);
    }//GEN-LAST:event_jBtDDLMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtDDL;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDrop;
    private javax.swing.JButton jButtonList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDDL;
    private javax.swing.JPanel jPanelPantalla;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
