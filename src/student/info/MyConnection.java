package student.info;


import java.sql.*;
public class MyConnection {
    public static Connection con=null;
    public static Connection getConnection()
    {
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Registered");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:vijay","vijay","vijay1234");
        System.out.println("connected");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
