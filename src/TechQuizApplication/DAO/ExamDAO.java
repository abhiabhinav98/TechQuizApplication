package TechQuizApplication.DAO;

import TechQuizApplication.POJO.Exam;
import TechQuizApplication.POJO.StudentRegister;
import TechQuizApplication.dbutil.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import static javax.swing.UIManager.getString;

public class ExamDAO {
    
    public static String getExamId() throws SQLException{
        int rowCount = 0;
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select count(*) as tablerows from exam");
                if(rs.next())
                    rowCount = rs.getInt(1);
                String newId = "Ex-"+(rowCount+1);
                   return newId;
    }
    
    public static void addExam(Exam newExam) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1, newExam.getExamId());
        ps.setString(2, newExam.getLanguage());
        ps.setInt(3, newExam.getTotalQues());
        ps.executeUpdate();
        
    }
    
    
    
    public static boolean changePassword(String userid,String password)throws SQLException{
        String qry="Update users set password=? where userid=?";
        boolean status=true;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,password);
        ps.setString(2,userid);
        int ans=ps.executeUpdate();
        if(ans==0)
               status=false;
     return status;
     } 

    
    public static ArrayList<String> getExamIdBySubject(String lang) throws SQLException{
        
      
       Connection conn = DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement("select examid from exam where language = ?");
       ps.setString(1, lang);
       
       ResultSet rs = ps.executeQuery();
       ArrayList<String> al = new ArrayList<>();
       while(rs.next()){
          al.add(rs.getString(1));  
       }
           return al;
    }
    
    public static int getQuestionCountByExam(String ExamId) throws SQLException{
        int ques=0;
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select totalquestion from exam where examid = ?");
        ps.setString(1, ExamId);
        ResultSet rs = ps.executeQuery();
        rs.next();{
        ques=rs.getInt(1);
    }
        return ques;
 
    }  
    
    
    
}
