package ap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class koneksi {
    
    private static Connection mysqlconfig;
    public static Connection config()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/db_perpus_ap1";
            String user="root";
            String pass=""; 
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        }catch(Exception e){
            System.err.println("Koneksi bermasalah "+e.getMessage());
        }
        return mysqlconfig;
    }
}
