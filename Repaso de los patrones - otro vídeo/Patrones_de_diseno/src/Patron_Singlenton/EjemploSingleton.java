package Patron_Singlenton;

public class EjemploSingleton {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Conexion con = Conexion.getInstance();
            System.out.println("con = " + con);
        }
    }
}
