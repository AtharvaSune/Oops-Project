/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;
import java.sql.*;
import Login.LoginPage;

/**
 *
 * @author Atharva
 */

 public class Oops {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LoginPage();
        //        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hoteldb", "root", "");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM hotels");
//            while(rs.next())
//                System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("address") + " " + rs.getString("rooms"));
//        }
//        catch (Exception e) {
//            System.out.println("Caught: " + e);
//        }
    }
    
}
