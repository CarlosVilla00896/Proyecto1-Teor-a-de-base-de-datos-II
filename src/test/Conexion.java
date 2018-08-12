/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import java.sql.*;
/**
 *
 * @author PC
 */
public final class Conexion {
    Connection c,conect;
    static String bd = "";
    static String url = "jdbc:derby://localhost:1527/";
    String driver ="org.apache.derby.jdbc.EmbeddedDriver";
    static String user = "";
    static String password = "";
    
    public String auxUser = ""; public String auxPassword = ""; public String auxDB = "";
  
    public Conexion(){
       
    }

   
    public Conexion(String bdd, String username, String pass) {
        bd = bdd;
        url += bd;
        user = username;
        password = pass;
        
        this.auxUser = user;
        this.auxPassword = password;
        this.auxDB = bd;
    }

    public String getAuxUser() {
        return auxUser;
    }

    public String getAuxPassword() {
        return auxPassword;
    }

    public String getAuxDB() {
        return auxDB;
    }

    public void setAuxUser(String auxUser) {
        this.auxUser = auxUser;
    }

    public void setAuxPassword(String auxPassword) {
        this.auxPassword = auxPassword;
    }

    public void setAuxDB(String auxDB) {
        this.auxDB = auxDB;
    }
    
    
    public Connection conectar(){
        System.out.println(url);
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            c= DriverManager.getConnection(url,user,password);
            System.out.println("Se conecto bien");
        }catch(Exception e){
            System.out.println(e);
        }
        return c;
    }
    public void desconectar(){
        try {
            c.close();
            System.out.println("Se desconecto bien");
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrar conexion");
        }
    }
}
