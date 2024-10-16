/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WPOSS
 */
public class Conexion {
    
    // creacion de la variable que se va utilizar para la coneccion
    private static Connection connection;
    
    // creacion de la instacia que se va asignar para la utilización del patron singleton
    private static Conexion instancia;
    
    // creacion de las variables para realizar la conexion a la base de datos 
    private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Polaris_signature2;integratedSecurity=false;applicationName=STISDownloadServer;";
    private static final String USER= "sa";
    private static final String PASSWORD = "12345";
    
    // creacion del constructro privado para solamente acceder desde la clase
    private Conexion(){
        System.out.println("Se incia la clasee Conexion");
    }
    
    
    // Metodo para generar la instacia de la clase
    public static Conexion getInstance(){
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    
    
    // metodo para realizar la conexion  a la base de datos
    public  Connection conexion (){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos");
            return connection;
        }catch(Exception e){
            System.out.println("Error realizando la coneccion a la base de datos");
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
    
    // Metodo para cerrar la conexion que se ha realizado
    public void close(){
        try{
            connection.close();
            System.out.println("Coneccin cerrada");
        }catch(Exception e){
            System.out.println("Error cerrando la conexion");
        }finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
    
}
