/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

public class JdbcConnection {
    public static Connection sConn = null;
    public static void main(String[] args) {
        //Khai báo chuỗi kết nối
        String strDbUrl = "jdbc:sqlserver://localhost:1433; databaseName=DOAN_THUEBD;user=sa;password=123456;"
                + "encrypt=true;trustServerCertificate=true";
        if (sConn == null) {
            try {           
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
                sConn = DriverManager.getConnection(strDbUrl);
                System.out.println("Ket noi thanh cong");
                DatabaseMetaData data = (DatabaseMetaData) sConn.getMetaData();
                // hien thi thong tin sql khi ket noi thanh cong
                System.out.println("Driver Name: " + data.getDriverName());
                System.out.println("Driver Version: " + data.getDriverVersion());
                System.out.println("Product Name: " + data.getDatabaseProductName());
                System.out.println("Version: " + data.getDatabaseProductVersion());
            } 
            catch (Exception ex) {System.out.println("Khong the ket noi den CSDL \n" + ex);
            } 
        }
    }
}
