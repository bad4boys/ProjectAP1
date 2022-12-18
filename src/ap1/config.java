package ap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */
public class config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/db_perpus_ap1";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("koneksi gagal"+e.getMessage());
        }
        return mysqlconfig;
    }
}
