package com.Prototype;

import com.Prototype.prototype.ListaPrecio;
import com.Prototype.prototype.Producto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lista de precios incicial
        ListaPrecio listaPrecio =  new ListaPrecio("Lista Normal");
        List<Producto> productoList = List.of(new Producto("Computadora",650000),
                                              new Producto("Mouse",120000),
                                              new Producto("Teclado",80000),
                                              new Producto("Pantalla",13500000),
                                              new Producto("Auriculares",40000));


        listaPrecio.setListaProductos(productoList);

        System.out.println(listaPrecio);

        // lista de precio clonada


        ListaPrecio listaPrecio2 = (ListaPrecio) listaPrecio.clone();
        listaPrecio2.setNombre("Lista Preferencial");

        System.out.println(listaPrecio2);



        // Utilizacion de la clonacion profunda

        System.out.println();
        System.out.println("Clonacion profunda");
        ListaPrecio listaPrecio3 = (ListaPrecio) listaPrecio.deepClone();
        listaPrecio3.setNombre("Lista Clonacion profunda");

        for (Producto producto: listaPrecio3.getListaProductos()){
            producto.setPrice( producto.getPrice() * 0.9);
        }

        System.out.println(listaPrecio3);

    }
}