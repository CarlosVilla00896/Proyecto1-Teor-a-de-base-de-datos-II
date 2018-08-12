package InternalFrames;
import Panels.CreateView;
import Panels.DropView;
import Panels.ListarViews;
import Panels.DDL;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class View extends javax.swing.JInternalFrame {
    
    CreateView add;
    DropView drop;
    ListarViews list;
    GridBagLayout layout = new GridBagLayout();
    DDL ddl;
    
    String flag = "";
    
    public View() {
        initComponents();
        
        add = new CreateView();
        drop = new DropView();
        list = new ListarViews();
        
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
        
        ddl.setVisible(true);
        add.setVisible(false);
        drop.setVisible(false);
        list.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonDrop = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelPantalla = new javax.swing.JPanel();
        jPanelDDL = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jButtonDrop.setText("Drop View");
        jButtonDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDropActionPerformed(evt);
            }
        });

        jButtonList.setText("List Views");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Create View");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jButtonDrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(119, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanelPantallaLayout = new javax.swing.GroupLayout(jPanelPantalla);
        jPanelPantalla.setLayout(jPanelPantallaLayout);
        jPanelPantallaLayout.setHorizontalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jPanelPantallaLayout.setVerticalGroup(
            jPanelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanelPantalla);

        javax.swing.GroupLayout jPanelDDLLayout = new javax.swing.GroupLayout(jPanelDDL);
        jPanelDDL.setLayout(jPanelDDLLayout);
        jPanelDDLLayout.setHorizontalGroup(
            jPanelDDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jPanelDDLLayout.setVerticalGroup(
            jPanelDDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanelDDL);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDropActionPerformed
        drop.setVisible(true);
        add.setVisible(false);
        list.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "Drop View");
        flag = "drop";
    }//GEN-LAST:event_jButtonDropActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        list.setVisible(true);
        add.setVisible(false);
        drop.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "Listar View");
        flag = "list";
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        add.setVisible(true);
        drop.setVisible(false);
        list.setVisible(false);
        this.jTabbedPane1.setTitleAt(0, "Add View");
        flag = "add";
    }//GEN-LAST:event_jButtonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDrop;
    private javax.swing.JButton jButtonList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDDL;
    private javax.swing.JPanel jPanelPantalla;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
