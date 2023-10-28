/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author JANBLACK
 */
public class conexion {
    String db="sistemaacademico";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;

    public conexion() {
    }
    public Connection Conectar(){
    
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+db,user,password);
            System.out.println("Se conecto correctamente a la base de datos " + db);
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println("No se Conecto a la base de datos" + db);
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    return cx;
    }
    public Connection Desconectar(){
        try {
            cx.close();
            System.out.println("Se desconecto correctamente a la base de datos " + db);
        } catch (SQLException ex) {
             System.out.println("No se pudo desconectar a la base de datos" + db);
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    public static void main(String[] args){
    conexion cn = new conexion();
    cn.Conectar();
    }
}
