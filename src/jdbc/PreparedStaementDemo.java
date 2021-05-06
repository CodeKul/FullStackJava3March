package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStaementDemo {

    public static void main(String[] args) {

        try {
            int id;
            String name;
            String address;

            Scanner scanner =  new Scanner(System.in);
            System.out.println("Enter id");
            id = scanner.nextInt();
            System.out.println("Enter name");
            name = scanner.next();
            System.out.println("Enter Address");
            address = scanner.next();

            Class.forName("com.mysql.jdbc.Driver");//Registering driver

            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JavaFullstack3March?characterEncoding=latin1",
                            "root",
                            "password"
                    );

            String insert = "insert into employee(id,name,address) values (?,?,?)";
//            String update = "update employee set name =? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);

            int i = preparedStatement.executeUpdate();
            System.out.println("row affected =>"+i);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
