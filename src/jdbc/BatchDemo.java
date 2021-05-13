package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");//Registering driver

        Connection connection =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/JavaFullstack3March?characterEncoding=latin1",
                        "root",
                        "password"
                );
        String insert = "insert into employee(id,name,address) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);

        for(int i=1;i<=20;i++){

            preparedStatement.setInt(1,i);
            preparedStatement.setString(2,"name");
            preparedStatement.setString(3,"address");
            preparedStatement.addBatch();
        }

        preparedStatement.executeBatch();
        System.out.println("Execute successfully.....");
    }
}
