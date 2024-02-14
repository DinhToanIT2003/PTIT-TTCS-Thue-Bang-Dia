/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

public class JdbcConnection {
    public static Connection getJdbcConnection(){
        Connection con = null;
        final String url = "jdbc:sqlserver://localhost:1433; databaseName=DOAN_THUEBD;user=sa;password=123456;"
                + "encrypt=true;trustServerCertificate=true";
        final String user = "sa";
        final String pass = "123456";
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
