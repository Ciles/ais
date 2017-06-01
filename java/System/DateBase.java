
package System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DateBase {
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            Logger.getLogger(DateBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection connect() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1/komp_firma?" + "user=root&password=root";
        return DriverManager.getConnection(url);
    }
}
