import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
