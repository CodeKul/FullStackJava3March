package jdbc;

import java.sql.*;
import java.util.Scanner;

public class CallableDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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

//        CallableStatement callableStatement = connection.prepareCall("call getData()");
//        ResultSet rs = callableStatement.executeQuery();
//
//        while (rs.next()) {
//            System.out.println(rs.getString(1));
//        }


        CallableStatement callableStatement = connection.prepareCall("call inertEmp(?,?,?)");
        callableStatement.setInt(1,id);
        callableStatement.setString(2,name);
        callableStatement.setString(3,address);


        callableStatement.executeUpdate();
        System.out.println("Successfully execute....");

    }
}
