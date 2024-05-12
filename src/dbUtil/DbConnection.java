package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {


    private static final String SQCONN = "jdbc:sqlite:varsity.sqlite";

    public static Connection getConnection() throws SQLException{

        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN);

        }

        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        return null;
    }

}

