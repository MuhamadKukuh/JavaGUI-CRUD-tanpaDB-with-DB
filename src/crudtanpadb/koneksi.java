/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudtanpadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import java.sql.*;
/**
 *
 * @author Muhamad Kukuh
 */
public class koneksi {
    
    public static Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/latihan";
        String user = "root";
        String password = "";
        try{
            conn = DriverManager.getConnection(url,user,password);   
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
        return conn;
    }
    
    public static void main(String args[]){
        Connection c = koneksi.getConnection();
//        Statement st = c.createStatement();
    }
    
//    public static Connection getConnection(){
////        System.out.println("");
//        
//    }
    
    
    
}
