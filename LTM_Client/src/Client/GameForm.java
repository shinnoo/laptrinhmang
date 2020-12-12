/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Interface.inReceiveMessage;
import static Client.LoginForm.user;
import Model.Game;
import Model.KMessage;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class GameForm extends javax.swing.JFrame implements inReceiveMessage {

    static ListenServer listenServer = null;
    DefaultListModel<String> model = new DefaultListModel<>();
//    ArrayList<Question> questions;
    static Game game;
    static Game game2;
    static int dem = 0;

    public GameForm(ListenServer listenServer) {
        initComponents();
        setLocationRelativeTo(null);
        this.listenServer = listenServer;
        this.listenServer.receive = this;
//        questions = new ArrayList<>();
        try {
            listenServer.SendMessage(40, null);
        } catch (IOException ex) {
            Logger.getLogger(GameForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        btnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/chia-bai.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
//        if (cbAns1.getSelectedIndex() == questions.get(0).getCorrectAnswer()) {
//            dem++;
//        }
//        if (cbAns2.getSelectedIndex() == questions.get(1).getCorrectAnswer()) {
//            dem++;
//        }
//        if (cbAns3.getSelectedIndex() == questions.get(2).getCorrectAnswer()) {
//            dem++;
//        }
//        if (cbAns4.getSelectedIndex() == questions.get(3).getCorrectAnswer()) {
//            dem++;
//        }
//        if (cbAns5.getSelectedIndex() == questions.get(4).getCorrectAnswer()) {
//            dem++;
//        }

        LocalTime time = java.time.LocalTime.now();
        result(dem, time);
      
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            System.out.println("CLIENT");
                            //new Main(listenServer).setVisible(true);
                            HomeForm homeForm = new HomeForm(listenServer);
                            homeForm.setVisible(true);
                        }
                    });
                    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameForm(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ReceiveMessage(KMessage msg) throws IOException {
        switch (msg.getType()) {
            // Nhận yêu cầu chơi 
            case 41: {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Sẵn sàng chơi?", "Title on Box", dialogButton);
                if (dialogResult == 0) {
                    listenServer.SendMessage(44, null);// Gửi chấp nhận
                } else {
                    listenServer.SendMessage(45, null);// Gửi từ chối 
                }
                break;
            }
            // Người chơi đồng ý và nhận dự liệu
            case 46: {
//                questions = msg.getQuestions();// Nhận câu hỏi
//                setQuestion();
                break;
            }
            // Người chơi không đồng ý
            case 47: {
                JOptionPane.showMessageDialog(null, "Người chơi không đồng ý!", "Message", 1);
                break;
            }
            case 60: {
                game2 = (Game) msg.getObject();
                String t = "Hòa";
                JOptionPane.showMessageDialog(null, "Hòa!", "Message", 1);
                this.setVisible(false);
                ResultForm resultForm = new ResultForm(listenServer, game2, t);
                resultForm.setVisible(true);
                break;
            }
            // Thông báo thắng
            case 61: {
                game2 = (Game) msg.getObject();
                JOptionPane.showMessageDialog(null, "Thắng!", "Message", 1);
                String t = "Thắng";
                this.setVisible(false);
                ResultForm resultForm = new ResultForm(listenServer, game2, t);
                resultForm.setVisible(true);
                break;
            }
            // Thông báo thua
            case 62: {
                game2 = (Game) msg.getObject();
                String t = "Thua";
                JOptionPane.showMessageDialog(null, "Thua!", "Message", 1);
                this.setVisible(false);
                ResultForm resultForm = new ResultForm(listenServer, game2, t);
                resultForm.setVisible(true);
                break;
            }
            // Thông báo người chơi thoát khỏi phòng và out phòng
            case 71: {
                JOptionPane.showMessageDialog(null, "Nguoi choi da thoat khoi phong!", "Message", 1);
                this.setVisible(false);
                HomeForm homeForm = new HomeForm(listenServer);
                homeForm.setVisible(true);
                break;
            }
            case 100: {
                JOptionPane.showMessageDialog(null, "Đối thủ chưa hoàn thành trận đấu!", "Message", 1);
                break;
            }
        }
    }

//    private void setQuestion() {
//        //lấy câu hỏi
//        lbQues1.setText(questions.get(0).getQuestion());
//        lbQues2.setText(questions.get(1).getQuestion());
//        lbQues3.setText(questions.get(2).getQuestion());
//        lbQues4.setText(questions.get(3).getQuestion());
//        lbQues5.setText(questions.get(4).getQuestion());
//
//         cbAns1.removeAllItems();
//          cbAns2.removeAllItems();
//          cbAns3.removeAllItems();
//          cbAns4.removeAllItems();
//          cbAns5.removeAllItems();
//
//        //lấy đáp án
//        cbAns1.addItem(questions.get(0).getAnswerA());
//        cbAns1.addItem(questions.get(0).getAnswerB());
//        cbAns1.addItem(questions.get(0).getAnswerC());
//        cbAns1.addItem(questions.get(0).getAnswerD());
//
//        cbAns2.addItem(questions.get(1).getAnswerA());
//        cbAns2.addItem(questions.get(1).getAnswerB());
//        cbAns2.addItem(questions.get(1).getAnswerC());
//        cbAns2.addItem(questions.get(1).getAnswerD());
//
//        cbAns3.addItem(questions.get(2).getAnswerA());
//        cbAns3.addItem(questions.get(2).getAnswerB());
//        cbAns3.addItem(questions.get(2).getAnswerC());
//        cbAns3.addItem(questions.get(2).getAnswerD());
//
//        cbAns4.addItem(questions.get(3).getAnswerA());
//        cbAns4.addItem(questions.get(3).getAnswerB());
//        cbAns4.addItem(questions.get(3).getAnswerC());
//        cbAns4.addItem(questions.get(3).getAnswerD());
//
//        cbAns5.addItem(questions.get(4).getAnswerA());
//        cbAns5.addItem(questions.get(4).getAnswerB());
//        cbAns5.addItem(questions.get(4).getAnswerC());
//        cbAns5.addItem(questions.get(4).getAnswerD());
//
//
//    }

    private void result(int dem, LocalTime time) {
        //jLabel1.setText("Số câu đúng: " + dem);
        game = new Game(10, time, user);
        try {
            listenServer.SendMessage(50, game);
        } catch (IOException ex) {
            Logger.getLogger(GameForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
