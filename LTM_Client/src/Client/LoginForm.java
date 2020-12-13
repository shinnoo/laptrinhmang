/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Interface.HostConstant;
import Interface.inReceiveMessage;
import Model.KMessage;
import Model.User;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class LoginForm extends javax.swing.JFrame implements inReceiveMessage {

    static public User user = null;
    static public String IP;
    static public String Port;
    static public Socket socket = null;
    ListenServer listenServer = null;

    /**
     * Creates new form Main
     */
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
        //setFontForRegister();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tx_username = new javax.swing.JTextField();
        tx_password = new javax.swing.JPasswordField();
        bt_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Tài khoản:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        tx_username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tx_password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tx_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx_passwordKeyPressed(evt);
            }
        });

        bt_login.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bt_login.setText("Đăng nhập");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Game 3 cây");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tx_username, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(tx_password)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tx_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_login)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void setFontForRegister(){
//        Font font = jLabel4.getFont();
//        Map attributes = font.getAttributes();
//        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
//        jLabel4.setFont(font.deriveFont(attributes));
//    }
    void connectServer() {

        try {
            if (socket == null) {
                // tạo socket.
                socket = new Socket(HostConstant.IP, Integer.parseInt(HostConstant.PORT));
                listenServer = new ListenServer(socket);
                listenServer.receive = this;
                listenServer.start();
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Can't connect to Server!", "Error", 1);
            return;
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Can't connect to Server!", "Error", 1);
            return;
        }
    }

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        // TODO add your handling code here:
        String username;
        String password;

        connectServer();
        // lấy username, password        
        username = tx_username.getText();
        password = String.valueOf(tx_password.getPassword());

        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Không được để trống username, password", "Error", 1);
            return;
        }
        if (listenServer != null) {
            try {
                // gửi username, password lên sever
                listenServer.SendMessage(0, new User(username, password));
            } catch (IOException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bt_loginActionPerformed

    private void tx_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_passwordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') {
            bt_loginActionPerformed(null);
        }
    }//GEN-LAST:event_tx_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField tx_password;
    private javax.swing.JTextField tx_username;
    // End of variables declaration//GEN-END:variables

    @Override
    //Hàm kiểm nhận đối tượng kiểm tra từ server
    public void ReceiveMessage(KMessage msg) throws IOException {
        switch (msg.getType()) {
            case 0: {
                // Nhận dữ liệu từ server
                user = (User) msg.getObject();
                if (user != null) {
                    listenServer.user = user;

                    //Nếu có đối tượng thì mở giao diện Danh sách bạn
                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            System.out.println("CLIENT");
                            //new Main(listenServer).setVisible(true);
                            HomeForm homeForm = new HomeForm(listenServer);
                            homeForm.setVisible(true);
                        }
                    });
                    //this.setVisible(false);
                    this.dispose();
                } else {
                    //Nếu không đúng đối tượng thì hiển thị thông báo
                    JOptionPane.showMessageDialog(null, "Người dụng không tồn tại!", "Message", 1);
                }
                break;
            }
            case 1: {
                JOptionPane.showMessageDialog(null, msg.getObject(), "Message", 1);
                break;
            }

        }

    }
}
