package TechQuizApplication.DAO;

import TechQuizApplication.POJO.QuestionStore;
import TechQuizApplication.POJO.Questions;
import TechQuizApplication.dbutil.DBConnection;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

public class QuestionsDAO {
    public static void addQuestion(QuestionStore obj)throws SQLException{
     
     Connection conn = DBConnection.getConnection();
     PreparedStatement ps = conn.prepareStatement("Insert into questions values(?,?,?,?,?,?,?,?,?)");
     ArrayList<Questions> questionList = obj.getAllQuestions();
     for(Questions q : questionList){
        ps.setString(1, q.getExamId());
        ps.setInt(2, q.getQno());
        ps.setString(3,q.getQuestion());
        ps.setString(4, q.getAnswer1());
        ps.setString(5, q.getAnswer2());
        ps.setString(6, q.getAnswer3());
        ps.setString(7, q.getAnswer4());
        ps.setString(8, q.getCorrectAnswer());
        ps.setString(9, q.getLanguage());
        ps.executeUpdate();
     }
     
    }
    
    public static ArrayList<Questions> getQuestionByExamId(String examId) throws SQLException{
          
          ArrayList<Questions> questionList= new ArrayList<>();
          Connection conn = DBConnection.getConnection();
          PreparedStatement ps = conn.prepareStatement("Select * from questions where examid = ?");
          ps.setString(1, examId);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              int qno = rs.getInt(2);
              String question = rs.getString(3);
              String option1 = rs.getString(4);
              String option2 = rs.getString(5);
              String option3 = rs.getString(6);
              String option4 = rs.getString(7);
              String correctAnswer = rs.getString(8);
              String language = rs.getString(9);
              Questions ques = new Questions(examId,qno,language,option1,option2,option3,option4,correctAnswer,question);
          questionList.add(ques);
          }
          return questionList;        
    }
    
    public static void editQuestion(QuestionStore obj) throws SQLException{
        
        String qry = "update questions set question = ?, answer = ? , answer2 = ?, answer3 = ?,answer4 = ? , Correct_answer = ? where qno = ? and examid = ?  "; 
        
     Connection conn = DBConnection.getConnection();
     PreparedStatement ps = conn.prepareStatement(qry);
      ArrayList<Questions> questionList = obj.getAllQuestions();
     for(Questions q : questionList){   
     ps.setString(1,q.getQuestion());
        ps.setString(2, q.getAnswer1());
        ps.setString(3, q.getAnswer2());
        ps.setString(4, q.getAnswer3());
        ps.setString(5, q.getAnswer4());
        ps.setString(6, q.getCorrectAnswer());
        ps.setInt(7, q.getQno());  
        ps.setString(8, q.getExamId());
        ps.executeUpdate();    
    }
    }
    
    
    
}