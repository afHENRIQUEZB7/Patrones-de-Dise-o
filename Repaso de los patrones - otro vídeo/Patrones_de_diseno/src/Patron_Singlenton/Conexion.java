package Patron_Singlenton;

public class Conexion {
    private static Conexion conexion;

    private Conexion(){
        System.out.println("Conectado a la base de datos");
    }

    public static Conexion getInstance(){
        if (conexion == null){
            conexion = new Conexion();
        }
        return conexion;
    }
}
