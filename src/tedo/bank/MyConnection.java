package tedo.bank;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {

    private static Connection con;
    public static Connection getConnection()
    {
        Connection Con=null;
        try
        {
            Class.forName("com.mysql.jbc.Driver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tedo_bank [Zython on ZYTHON]","Doraemon","Miichan");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
