import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createDatabase {
    public static void main(String[] args) {

        // sql connection parameters
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "pass";

        // name of the database we want to create
        String dbName = "mydatabase";

        // mySQL JDBC driver
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            // load JDBC driver
            Class.forName(driver);

            // establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // create statement query
            Statement stmt = conn.createStatement();

            // create database query
            String createDBQuery = "CREATE DATABASE " + dbName;

            // execute query
            stmt.executeUpdate(createDBQuery);

            System.out.println("Database created successfully: " + dbName);

            // close resources
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Error loading JDBC drivers: " + e.getMessage());;
        } catch (SQLException e) {
            System.out.println("Error creating database: " + e.getMessage());
        }
    }
}
