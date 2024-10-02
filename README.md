
# JDBC

Java applications that need to communicate with the database have to be programmed using JDBC API. JDBC Driver supporting data sources such as Oracle and SQL server has to be added in java application for JDBC support which can be done dynamically at run time. This JDBC driver intelligently communicates the respective data source.


## Steps required to connect to JDBC

- Importing packages

- Loading drivers (optional for java 6.0 and above)

- Register drivers

- Create statement

- Execute statement

- Close


## Process for making connection

Importing packages

```bash
  import java.sql.*;
  import java.sql.Statement;
  import java.sql.DriverManager;

```
Register drivers

```bash
  // register the driver class
  Class.forName("com.mysql.cj.jdbc.Driver");

  // create connection with
  Connection connection = DriverManager.getConnection(url, user, password);
```
Create statement

```bash
    // creating statement
    Statement statement = connection.createStatement();
```
Execute statement

```bash
    // executing statement
    ResultSet resultSet = statement.executeQuery("select * from student");
```
Close connection

```bash
    connection.close();
```
