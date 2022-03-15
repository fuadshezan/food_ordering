/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Sakib
 */
public class Dhanmondi extends javax.swing.JFrame {

    /**
     * Creates new form Restaurant
     */
    public Dhanmondi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sultan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Takeout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sultan.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        sultan.setText("Sultan's Dine");
        sultan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sultanActionPerformed(evt);
            }
        });
        getContentPane().add(sultan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, 90));

        jLabel1.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jLabel1.setText("   Choose a Restaurant");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 590, 70));

        Takeout.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        Takeout.setText("Takeout ");
        Takeout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeoutActionPerformed(evt);
            }
        });
        getContentPane().add(Takeout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 90));

        jLabel3.setFont(new java.awt.Font("Ravie", 3, 13)); // NOI18N
        jLabel3.setText("  * Recommended For Rich-Food");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 410, -1));

        back.setFont(new java.awt.Font("Ravie", 3, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 60));

        jLabel2.setFont(new java.awt.Font("Ravie", 3, 13)); // NOI18N
        jLabel2.setText("  * Recommended For Fast-Food");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 410, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/Dhanmondi.jpg"))); // NOI18N
        background.setText("jLabel4");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 1730, 850));

        setSize(new java.awt.Dimension(1215, 695));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sultanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sultanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sultanActionPerformed

    private void TakeoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeoutActionPerformed
    

    new Takeout().setVisible(true);
    this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_TakeoutActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new AreaChoice().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dhanmondi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dhanmondi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dhanmondi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dhanmondi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dhanmondi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Takeout;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton sultan;
    // End of variables declaration//GEN-END:variables
}
