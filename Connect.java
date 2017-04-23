/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Connect {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;
public static Connection ConnectDB(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbms_project","root","2705");
        //JOptionPane.showMessageDialog(null, "Connection Established");
        return con;

    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}
}