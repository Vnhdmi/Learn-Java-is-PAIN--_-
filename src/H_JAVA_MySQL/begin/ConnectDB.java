package H_JAVA_MySQL.begin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/basic ";
    private static final String USER = "root";
    private static final String PASS = "hdmi1171";

    public static Connection openConnect() {
        Connection conn;
        //chon driver
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public static void closeConnect(Connection conn) {
        if (conn != null) {
            try {
                //dong ket noi
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

