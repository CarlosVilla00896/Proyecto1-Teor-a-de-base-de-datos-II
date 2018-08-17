package Frames;
import InternalFrames.Tablas;
import InternalFrames.Conexiones;
import InternalFrames.Constraints;
import InternalFrames.View;
import InternalFrames.Triggers;
import InternalFrames.Procedures;
import InternalFrames.Functions;

/**
 *
 * @author PC
 */
public class AplicationWindow extends javax.swing.JFrame {
  
   public AplicationWindow() {
       
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNewDb = new javax.swing.JMenuItem();
        jMenuItemSetSchema = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemSP = new javax.swing.JMenuItem();
        jMenuItemTRG = new javax.swing.JMenuItem();
        jMenuItemFN = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemTables = new javax.swing.JMenuItem();
        jMenuItemView = new javax.swing.JMenuItem();
        jMenuConstraints = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Conexiones");

        jMenuItemNewDb.setText("Nueva Conexion / Base de datos");
        jMenuItemNewDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewDbActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNewDb);

        jMenuItemSetSchema.setText("Cambiar de Esquema");
        jMenu1.add(jMenuItemSetSchema);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Procedures");

        jMenuItemSP.setText("Procedimientos Almacenados");
        jMenuItemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSPActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemSP);

        jMenuItemTRG.setText("Triggers");
        jMenuItemTRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTRGActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTRG);

        jMenuItemFN.setText("Funciones");
        jMenuItemFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFNActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemFN);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Tables");

        jMenuItemTables.setText("Tablas");
        jMenuItemTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTablesActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemTables);

        jMenuItemView.setText("Vistas");
        jMenuItemView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemView);

        jMenuConstraints.setText("Constraints");
        jMenuConstraints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConstraintsActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuConstraints);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTablesActionPerformed
        Tablas tables  = new Tablas();
        this.jDesktopPane1.add(tables);
        tables.setVisible(true);
    }//GEN-LAST:event_jMenuItemTablesActionPerformed

    private void jMenuItemNewDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewDbActionPerformed
        System.out.println("entro al menuitem");
        Conexiones conn = new Conexiones();
        System.out.println("paso de conn");
        this.jDesktopPane1.add(conn);
        conn.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemNewDbActionPerformed

    private void jMenuConstraintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConstraintsActionPerformed
        Constraints constraint = new Constraints();
        this.jDesktopPane1.add(constraint);
        constraint.setVisible(true);
    }//GEN-LAST:event_jMenuConstraintsActionPerformed

    private void jMenuItemViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewActionPerformed
        View view = new View ();
        this.jDesktopPane1.add(view);
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItemViewActionPerformed

    private void jMenuItemTRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTRGActionPerformed
        Triggers trigger = new Triggers();
        this.jDesktopPane1.add(trigger);
        trigger.setVisible(true);
    }//GEN-LAST:event_jMenuItemTRGActionPerformed

    private void jMenuItemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSPActionPerformed
        Procedures procedures = new Procedures();
        this.jDesktopPane1.add(procedures);
        procedures.setVisible(true);
    }//GEN-LAST:event_jMenuItemSPActionPerformed

    private void jMenuItemFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFNActionPerformed
        Functions functions = new Functions();
        this.jDesktopPane1.add(functions);
        functions.setVisible(true);
    }//GEN-LAST:event_jMenuItemFNActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicationWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConstraints;
    private javax.swing.JMenuItem jMenuItemFN;
    private javax.swing.JMenuItem jMenuItemNewDb;
    private javax.swing.JMenuItem jMenuItemSP;
    private javax.swing.JMenuItem jMenuItemSetSchema;
    private javax.swing.JMenuItem jMenuItemTRG;
    private javax.swing.JMenuItem jMenuItemTables;
    private javax.swing.JMenuItem jMenuItemView;
    // End of variables declaration//GEN-END:variables
}
