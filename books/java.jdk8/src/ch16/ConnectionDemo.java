package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");//load driver
        String jdbcUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String passwd = "";

        try(Connection conn =
                    DriverManager.getConnection(jdbcUrl, user, passwd)){
            System.out.printf("已%s 数据库联机%n", conn.isClosed()? "关闭":"开启");
        }
    }
}
