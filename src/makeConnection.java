import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class makeConnection {
    public static void main(String[] args) {

        // parameters for connection
        String url = "jdbc:mysql://localhost:3306/coffee";
        String user = "root";
        String password = "pass";

        try {
            // register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection with
            Connection connection = DriverManager.getConnection(url, user, password);

            // statement
            Statement statement = connection.createStatement();

            // execute statement
            ResultSet resultSet = statement.executeQuery("select * from student");

            // printing the result
            while (resultSet.next()) {
                System.out.println();
            }
        }

        // exception it unable to connect
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
