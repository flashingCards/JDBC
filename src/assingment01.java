import java.sql.*;
import java.sql.Statement;
import java.sql.DriverManager;

public class assingment01 {

    public static void main(String[] args) throws SQLException {

        // Defining connection parameter
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "pass";

        //
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from ");



    }
}
