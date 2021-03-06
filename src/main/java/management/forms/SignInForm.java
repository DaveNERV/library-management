package management.forms;

import java.awt.Toolkit;
import management.forms.SignUpForm;
import java.sql.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import management.utils.BDConnection;

/**
 *
 * @author David Murasov
 */
public class SignInForm extends javax.swing.JFrame {

    /**
     * Creates new form SignInForm
     */
    public SignInForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/50px-frameIcon.png")));
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
        jPanel2 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        login_img = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        reg_btn = new rojerusan.RSMaterialButtonCircle();
        login_btn = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        loginTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(153, 0, 0));
        loginTitle.setText("Logarea");

        loginField.setBackground(java.awt.SystemColor.controlHighlight);
        loginField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginField.setToolTipText("");
        loginField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        loginField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginFieldFocusLost(evt);
            }
        });
        loginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginFieldActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        loginLabel.setForeground(java.awt.SystemColor.controlHighlight);
        loginLabel.setText("Login:*");

        passLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        passLabel.setForeground(java.awt.SystemColor.controlHighlight);
        passLabel.setText("Password:*");

        login_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-img.png"))); // NOI18N
        login_img.setToolTipText("");

        passField.setBackground(java.awt.SystemColor.controlHighlight);
        passField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        reg_btn.setBackground(new java.awt.Color(0, 102, 255));
        reg_btn.setText("Registrare");
        reg_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        reg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_btnActionPerformed(evt);
            }
        });

        login_btn.setBackground(new java.awt.Color(255, 153, 0));
        login_btn.setText("Sign In");
        login_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Managementul Libr??riei");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(reg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(passLabel)
                                    .addGap(29, 29, 29)
                                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(loginLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(login_img, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(loginTitle))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(login_img, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLabel))
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        loginTitle.getAccessibleContext().setAccessibleName("welcome");
        loginLabel.getAccessibleContext().setAccessibleName("login");
        passLabel.getAccessibleContext().setAccessibleName("password");
        login_img.getAccessibleContext().setAccessibleName("iconLogin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.getAccessibleContext().setAccessibleName("JPanelLogin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        if(isLoginValid() == true){
            if(isSignInSuccessful() == true){
                JOptionPane.showMessageDialog(this, "Ati intrat cu success!");
                MainPage home_page = new MainPage();
                home_page.setVisible(true);
                this.dispose();        
            }else{
                JOptionPane.showMessageDialog(this, "Loginul sau parola incorecta!");
            }
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void reg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_btnActionPerformed
        redirectToSignUpPage();
    }//GEN-LAST:event_reg_btnActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void loginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFieldActionPerformed

    private void loginFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFieldFocusLost
        
    }//GEN-LAST:event_loginFieldFocusLost

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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginTitle;
    private rojerusan.RSMaterialButtonCircle login_btn;
    private javax.swing.JLabel login_img;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private rojerusan.RSMaterialButtonCircle reg_btn;
    // End of variables declaration//GEN-END:variables



    private boolean isLoginValid(){
        if(loginField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Introduceti loginul!");
            return false;
        }else if(passField.getText().equals("") || passField.getText().length() < 5){
            JOptionPane.showMessageDialog(this, "Parola trebuie sa fie minim de 5 caractere!");
            return false;
        }
        return true;
    }
    
    private boolean isSignInSuccessful(){
        String sqlQuery = "SELECT * FROM users WHERE login = ? and password = ?";
        
        try{
            Connection connection = BDConnection.getConnection();
            PreparedStatement prepst = connection.prepareStatement(sqlQuery);
            prepst.setString(1, loginField.getText());
            prepst.setString(2, passField.getText());
            ResultSet rs = prepst.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch(SQLException e) {
             e.printStackTrace();
         } 
        return false;
    }
    
    private void redirectToSignUpPage(){
        SignUpForm signup = new SignUpForm();
        signup.setVisible(true);
        dispose();
    }
}