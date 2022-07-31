/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enrollmentsystem;
import java.sql.*;
/**
 *
 * @author mercy
 */
public class DBConnect {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrollmentsystem?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "kurt");
            st = con.createStatement();
            System.out.println("Connected");
        }catch(Exception ex){
            System.out.println("Failed to insert");
            System.out.println(ex);
        }
    }
    
}
