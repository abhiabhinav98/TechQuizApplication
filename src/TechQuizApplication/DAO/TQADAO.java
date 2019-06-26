package TechQuizApplication.DAO;
import TechQuizApplication.POJO.TQA;
import TechQuizApplication.dbutil.DBConnection;
import java.sql.*;

public class TQADAO {
   
    public static int loginUser(TQA obj)throws SQLException{
        int ans=0;
        Connection conn = DBConnection.getConnection();
        PreparedStatement st = conn.prepareStatement("Select * from users where userid = ? AND password = ? AND usertype = ? ");
       
        st.setString(1,obj.getUserId());
        st.setString(2, obj.getPwd());
        st.setString(3, obj.getUserType());
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            if((rs.getString(1)).equalsIgnoreCase(obj.getUserId()) && (rs.getString(2)).equals(obj.getPwd()) && (rs.getString(3)).equalsIgnoreCase(obj.getUserType())){
                ans = 1;
            break;
            }
             else   
                ans=0;
                
            
                         
        }
        return ans;
    }
}