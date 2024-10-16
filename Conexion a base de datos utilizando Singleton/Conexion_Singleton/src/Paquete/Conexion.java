package Paquete;

import java.sql.*;
public class Conexion {

    // Se crea la variable para hacer dicha conexion
    private static Connection con ;

    // Se crea la instacia que se va a retornar de la clase Conexion
    private static Conexion conexion;

    // Se crea las variables que se van a utilizar para conectar a la base de datos en este caso a "sql Server".
    private static final String URL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=bd_registros;integratedSecurity=false;trustServerCertificate=true;encrypt=true;applicationName=STISDownloadServer";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "12345";


    // Constructor privado solo para que se pueda crear un solo objeto de esta clase, para poder utilizar el patron de diseño singlenton
    private Conexion(){
        System.out.println("Ingresamos a la clase conexión");
    }

    // Metodo que me va revisar si ya se creo una instancia de la clase y me retorne dicha instancia
    public  static Conexion getInstance(){
        if (conexion == null){
            conexion = new Conexion();
        }
        return conexion;
    }


    // Creamos el método para conectarnos a la base de datos
    public  Connection connection(){
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion exitosa");
            return con;
        }catch (Exception e){
            System.out.println("Error en la conexion a la base de datos");
            e.printStackTrace(System.out);
            return con;
        }
    }

    // Metodo para cerrar la conexion
    public void close(){
        try {
            con.close();
            System.out.println("Se cerro la conexion");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }



}
