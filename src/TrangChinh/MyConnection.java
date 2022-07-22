/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrangChinh;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author vomin
 */
public class MyConnection {
    //truyen user, pass, url
   private static String myUrl = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=qltq;";
    private static String user = "sa";
    private static String password= "sa123";

    //Tao ra mot ket ngoi chiu trach nhiem ket noi (khoa chinh vao truoc khoa ngoai vao sau)
    private static MyConnection instance = new MyConnection();
    //Tao ra mot ket ngoi chiu trach nhiem ket noi (khoa chinh vao truoc khoa ngoai vao sau)
    private MyConnection(){}

    public static MyConnection getInstance(){
        //MyConnection.getInstance = lay duoc doi tuong cua MyConnection
        return instance;
    }

    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(myUrl, user, password);
            //ket noi thanh cong
            if(connection != null){
                System.out.println("Connect success!");
            }
        } catch (SQLException throwables) {
            System.out.println("Connect failed!");
            throwables.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
       }
        return connection;
    }
    
    public static void main(String[] args) {     
        System.out.println(MyConnection.getInstance().getConnection());
    }
}
