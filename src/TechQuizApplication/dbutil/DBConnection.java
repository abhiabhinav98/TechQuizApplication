package TechQuizApplication.dbutil;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBConnection {

    private static Connection conn;
    static{
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-7OJKGVAD:1521/xe","project","java");
            JOptionPane.showMessageDialog(null,"Connected to DB successfully","Success",JOptionPane.INFORMATION_MESSAGE);   
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Error loading Driver Class "+e,"Error",JOptionPane.ERROR_MESSAGE); 
        }
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"SQL Error: " +ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        
         
    }
}
         public static void closeConnection(){
             if(conn!=null)
             {
            try {
                conn.close();
            }
            catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error closing connection "+ex,"Error",JOptionPane.ERROR_MESSAGE);   
            }
             }
}
    
    public static Connection getConnection(){
        return conn;
    }

   

}