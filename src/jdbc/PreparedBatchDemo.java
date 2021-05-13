package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedBatchDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//Registering driver

        Connection connection =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/JavaFullstack3March?characterEncoding=latin1",
                        "root",
                        "password"
                );

        for(int i=1;i<=20;i++){
            String insert = "insert into employee(id,name,address) values("+i+",'name"+i+"','address"+i+"')";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.executeUpdate();
        }
    }
}
