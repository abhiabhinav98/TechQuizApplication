package TechQuizApplication.GUI;

import TechQuizApplication.DAO.PerformanceDAO;
import TechQuizApplication.DAO.QuestionsDAO;
import TechQuizApplication.POJO.Answer;
import TechQuizApplication.POJO.AnswerStore;
import TechQuizApplication.POJO.Exam;
import TechQuizApplication.POJO.Performance;
import TechQuizApplication.POJO.QuestionStore;
import TechQuizApplication.POJO.Questions;
import TechQuizApplication.POJO.UserProfile;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StudentTestPanel extends javax.swing.JFrame {
    
    private Exam exam;
    private QuestionStore qstore;
    private AnswerStore astore;
    private int qno,pos=0;
    
    public StudentTestPanel() {
        initComponents();
        super.setLocationRelativeTo(null);
        qstore = new QuestionStore();
        astore = new AnswerStore();
                qno=1;
        jLabel1.setText("Hello " + UserProfile.getUsername());
        jLabel5.setText(jLabel5.getText()+qno);
    }

    StudentTestPanel(Exam exam) {
        this();
        this.exam=exam;
        jLabel3.setText(exam.getLanguage().toUpperCase()+" "+jLabel3.getText());
        loadQuestions();
        showQuestion();   
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("HELLO                                            ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("LOGOUT");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("                              PAPER");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANURAG GUPTA\\Desktop\\project\\good luck2.jpg")); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Question No:  ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 0));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 0));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 204, 0));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(204, 204, 0));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnNext))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnPrevious)
                                    .addGap(59, 59, 59)
                                    .addComponent(btnCancel)
                                    .addGap(22, 22, 22))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton3))
                                    .addGap(207, 207, 207)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton2)
                                        .addComponent(jRadioButton4))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDone)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       LoginFrame loginFrame = new LoginFrame();
loginFrame.setVisible(true);
this.dispose(); // TODO add your handling code here:  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       Font f = new Font("Tahoma",Font.BOLD,15);
        jLabel2.setFont(f);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       Font f = new Font("Tahoma",Font.PLAIN,14);
        jLabel2.setFont(f); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
                StudentPanelFrame spf = new StudentPanelFrame();
                spf.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String chosenAnswer = getSelectedAnswer();
        if(chosenAnswer!=null){
            Questions question = qstore.getQuestion(pos);
        Answer newAnswer = new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,question.getCorrectAnswer());
            System.out.println(newAnswer);
            Answer answer = astore.getAnswerByQno(qno);
            if(answer==null)
                astore.addAnswer(newAnswer);
            else{
              if(newAnswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                  int apos = astore.removeAnswer(answer);
                  astore.setAnswerAt(apos, newAnswer);
              } 
        }
        }
         pos++;
        if(pos>=qstore.getCount()){
            pos=0;
        }            
        qno++;
        if(qno>qstore.getCount())
            qno=1;
        jLabel5.setText("Question no: "+qno);
        showQuestion();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String chosenAnswer = getSelectedAnswer();
        if(chosenAnswer!=null){
            Questions question = qstore.getQuestion(pos);
        Answer newAnswer = new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,question.getCorrectAnswer());
            System.out.println(newAnswer);
            Answer answer = astore.getAnswerByQno(qno);
            if(answer==null)
                astore.addAnswer(newAnswer);
            else{
              if(newAnswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                  int apos = astore.removeAnswer(answer);
                  astore.setAnswerAt(apos, newAnswer);
              } 
        }
        }
         pos--;
        if(pos<0){
                        // JOptionPane.showMessageDialog(null, "Your answer has been successfully recorded.\nPress the DONE button to send it to the database ","Exam Added!",JOptionPane.INFORMATION_MESSAGE);
                         pos = qstore.getCount()-1;
         }       
        qno--;
        if(qno<=0)
            qno=qstore.getCount();
        jLabel5.setText("Question no:"+qno);
        showQuestion();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
String chosenAnswer = getSelectedAnswer();
        if(chosenAnswer!=null){
            Questions question = qstore.getQuestion(pos);
        Answer newAnswer = new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,question.getCorrectAnswer());
            System.out.println(newAnswer);
            Answer answer = astore.getAnswerByQno(qno);
            if(answer==null)
                astore.addAnswer(newAnswer);
            else{
              if(newAnswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                  int apos = astore.removeAnswer(answer);
                  astore.setAnswerAt(apos, newAnswer);
              } 
        }
        }
        int right = 0,wrong = 0;
        for(Questions question : qstore.getAllQuestions()){
            int qno = question.getQno();
            Answer answer = astore.getAnswerByQno(qno);
            if(answer==null)
                continue;
            else{
                String chosenanswer = answer.getChosenAnswer();
                String correctanswer = answer.getCorrectAnswer();
                if(chosenanswer.equals(correctanswer))
                    ++right;
                else
                    ++wrong;
            }
        }
        
        JOptionPane.showMessageDialog(null, "You have chosen " +right+"right answers ,\n"+wrong+"wrong answers and "+(exam.getTotalQues()-(right+wrong)),"report card",JOptionPane.INFORMATION_MESSAGE);
        try{
        Performance obj = new Performance(UserProfile.getUsername(),exam.getExamId(),right,wrong,(exam.getTotalQues()-(right+wrong)),(double)right/qstore.getCount()*100 ,exam.getLanguage());
        PerformanceDAO.addPerformance(obj);
        JOptionPane.showMessageDialog(null,"Your performance has been successfully added to the database","Exam Added!",JOptionPane.INFORMATION_MESSAGE);
        StudentPanelFrame spf = new StudentPanelFrame();
        spf.setVisible(true);
        this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error connecting to Database","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnDoneActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTestPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void loadQuestions()  {
    try{
        ArrayList<Questions> q = QuestionsDAO.getQuestionByExamId(exam.getExamId());
        for(Questions obj : q){
            qstore.addQuestion(obj);
        }
        
    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error while connecting to DB","Exception!",JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    
    }

    private void showQuestion() {
            Questions question = qstore.getQuestion(pos);
            buttonGroup1.clearSelection();
            jTextArea1.setText(question.getQuestion());
            jRadioButton1.setText(question.getAnswer1());
            jRadioButton2.setText(question.getAnswer2());
            jRadioButton3.setText(question.getAnswer3());
            jRadioButton4.setText(question.getAnswer4());           
            Answer answer = astore.getAnswerByQno(qno);
            if(answer==null)
                return;
            String chosenAnswer = answer.getChosenAnswer();
            switch(chosenAnswer){
                case "Answer 1":
                    jRadioButton1.setSelected(true);
                    break;
                           
                case "Answer 2":
                    jRadioButton2.setSelected(true);
                    break;
                case "Answer 3":
                    jRadioButton3.setSelected(true);
                    break;
                case "Answer 4":
                    jRadioButton4.setSelected(true);
                break;
            }
    }
    
    public String getSelectedAnswer(){
        if(jRadioButton1.isSelected())
            return "Answer1";
       else if(jRadioButton2.isSelected())
            return "Answer2";
       else if(jRadioButton3.isSelected())
            return "Answer3";
       else if(jRadioButton4.isSelected())
            return "Answer4";
        else 
            return null;
    }
    
}
