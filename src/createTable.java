import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "pass";

        String tableName = "users";
        String tableStructure = "CREATE TABLE " + tableName + " (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(255), " +
                "email VARCHAR(255))";

        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(tableStructure);

            System.out.println("Table created successfully: " + tableName);

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading JDBC drivers: " + e.getMessage());;
        } catch (SQLException e) {
            System.out.println("Error creating database: " + e.getMessage());
        }

    }
}
