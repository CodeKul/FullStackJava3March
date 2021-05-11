package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");//Registering driver

            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JavaFullstack3March?characterEncoding=latin1",
                            "root",
                            "password"
                    );

            Statement statement = connection.createStatement();

//            String insert = "insert into employee(id,name,address) values(4,'Rakesh','Sangli')";
//            String update  = "update employee set name ='rahul' where id =4";
            String delete  = "delete from employee where id =4";

            int i = statement.executeUpdate(delete);//
            System.out.println("Row affected=>"+i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
