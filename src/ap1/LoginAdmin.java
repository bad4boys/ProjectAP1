/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap1;

import javax.swing.JOptionPane;

/**
 *
 * @author Microsoft USer's
 */
public class LoginAdmin extends javax.swing.JFrame {
            String Username = "admin";
            String Password = "ap1";
    /**
     * Creates new form Login
     */
    public LoginAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        showpass = new javax.swing.JCheckBox();
        btnloginanggota = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Admin");

        jPanel1.setBackground(new java.awt.Color(255, 101, 203));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 370));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Login Admin");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(134, 39, 111, 22);

        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(95, 82, 49, 14);
        jPanel1.add(username);
        username.setBounds(162, 79, 241, 20);

        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(95, 120, 49, 14);
        jPanel1.add(password);
        password.setBounds(162, 117, 241, 20);

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin);
        btnlogin.setBounds(162, 194, 241, 23);

        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        jPanel1.add(showpass);
        showpass.setBounds(162, 144, 241, 23);

        btnloginanggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/iconProfile.png"))); // NOI18N
        btnloginanggota.setText("Anggota");
        btnloginanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginanggotaActionPerformed(evt);
            }
        });
        jPanel1.add(btnloginanggota);
        btnloginanggota.setBounds(441, 11, 89, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bgLogin.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 410, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
    if (username.getText().equals(Username)&& 
                password.getText().equals(Password)) {
        new ProfilAdmin().setVisible(true);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Ada yang salah");
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
    if (showpass.isSelected()) {
            password.setEchoChar((char)0);
         }else{
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void btnloginanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginanggotaActionPerformed
    new LoginAnggota().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnloginanggotaActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnloginanggota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
