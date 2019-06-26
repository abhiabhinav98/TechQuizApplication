package TechQuizApplication.DAO;

import TechQuizApplication.POJO.StudentRegister;
import TechQuizApplication.dbutil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
 public static boolean addStudent(StudentRegister sr) throws SQLException{
        boolean status=true;
        Connection conn = DBConnection.getConnection();
        String qry1 = "Select * from users where userid = ?";
        String qry2 = "insert into users values(?,?,?)";
        PreparedStatement p = conn.prepareStatement(qry1);
        p.setString(1, sr.getUserId());
        ResultSet rs = p.executeQuery();
        if(rs.next())
            status = false;
        else{
            
        
        PreparedStatement ps = conn.prepareStatement(qry2);
        ps.setString(1, sr.getUserId());
        ps.setString(2, sr.getPwd());
        ps.setString(3, sr.getStudent());
        int ans = ps.executeUpdate();
         }
        return status;
}
}
