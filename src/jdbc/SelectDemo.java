package jdbc;

import java.sql.*;

public class SelectDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");//Registering driver
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/JavaFullstack3March?characterEncoding=latin1",
                            "root",
                            "password"
                    );

            String select = "select * from employee";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(select);
            ResultSetMetaData rsm= rs.getMetaData();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                System.out.println(rsm.getColumnName(1)+" "+id+rsm.getColumnName(2)+" "+name+" "+rsm.getColumnName(3)+address);
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
