package TechQuizApplication.DAO;

import TechQuizApplication.POJO.Performance;
import TechQuizApplication.POJO.StudentScore;
import TechQuizApplication.dbutil.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;


public class PerformanceDAO {
      
    public static ArrayList<String> getAllStudentId() throws SQLException{
String qry="select distinct userid from performance";
ArrayList<String> al = new ArrayList<>();
Connection conn = DBConnection.getConnection();
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(qry);
while(rs.next()){
    String id = rs.getString(1);
    al.add(id);
}
return al;

}
    
    public static ArrayList<String> getAllExamId(String userid) throws SQLException{
        String qry="select examid from performance where userid = ?";
        ArrayList<String> al = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, userid);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
    String examid = rs.getString(1);
    al.add(examid);
}
return al;
    }
    
    public static StudentScore getScore(String studentId,String examId)throws SQLException{
         StudentScore scoreObj=new StudentScore();
         
      String qry="Select language,per from Performance where userid=? and examid=?";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,studentId);
        ps.setString(2,examId);
    //  System.out.println("studentid " + studentId+" and " +examId);
        ResultSet rs=ps.executeQuery();
        rs.next();
       
        scoreObj.setLanguage(rs.getString(1));
        scoreObj.setPer(rs.getDouble(2));
        return scoreObj;

        }

    
    
    public static ArrayList<Performance> getAllData() throws SQLException{
     String qry="select * from performance";
     Connection conn = DBConnection.getConnection();
     Statement st = conn.createStatement();
     ResultSet rs = st.executeQuery(qry);
     ArrayList<Performance> al = new ArrayList<>();
     while(rs.next()){
         String userid = rs.getString(1);
         String examid = rs.getString(2);
         int right = rs.getInt(3);
         int wrong = rs.getInt(4);
         int un = rs.getInt(5);
         double per = rs.getDouble(6);
         String lang = rs.getString(7);
         Performance p = new Performance(userid,examid,right,wrong,un,per,lang);
         al.add(p);
     }
    return al;
    }
    
    public static void addPerformance(Performance obj)throws SQLException{
        
      Connection conn = DBConnection.getConnection();
      PreparedStatement ps = conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
      ps.setString(1, obj.getUserid());
      ps.setString(2, obj.getExamid());
      ps.setInt(3, obj.getRight());
      ps.setInt(4, obj.getWrong());
      ps.setInt(5,obj.getUnattempted() );
      ps.setDouble(6, obj.getPer());
      ps.setString(7, obj.getLanguage());
      ps.executeUpdate();
      
    }
    
    
    
}


