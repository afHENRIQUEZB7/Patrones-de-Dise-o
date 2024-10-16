package com.Singleton;

/**
 * Rules:
 * 1) Debemos tener un constructor privado
 * 2) Debemos tener un atributo privado estatico
 * 3) Debemos tener un metdo estatico que devuelva la instacia

 */

public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    private DatabaseConnector(){
        System.out.println("Objeto creado");
    }

    public static synchronized DatabaseConnector getInstance(){
        if (databaseConnector == null){
            databaseConnector = new DatabaseConnector();
        }
       return databaseConnector ;
    }

    public void connectDatabase(){
        System.out.println("Connecting database = " + databaseConnector);
    }

    public void disconnectDatabase(){
        System.out.println("Disconecting database = " + databaseConnector);
    }
}
