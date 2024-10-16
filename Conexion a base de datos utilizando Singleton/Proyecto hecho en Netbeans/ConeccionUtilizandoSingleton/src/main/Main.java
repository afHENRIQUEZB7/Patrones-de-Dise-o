/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import paquete.Conexion;

/**
 *
 * @author WPOSS
 */
public class Main {

    public static void main(String[] args) {
        Conexion d = Conexion.getInstance();
        d.conexion();
        d.close();
    }

}
