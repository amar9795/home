import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBconnection {

    public static Connection createConnection()
    {
        Connection con = null;
        String url="";
        String username="sh";
        String password="sh";
        try
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }

            con = DriverManager.getConnection(url, username, password);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return con;
    }
}