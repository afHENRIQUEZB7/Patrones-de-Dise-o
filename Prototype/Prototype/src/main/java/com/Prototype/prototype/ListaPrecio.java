package com.Prototype.prototype;

import java.util.ArrayList;
import java.util.List;

public class ListaPrecio implements IPrototype{

    private String nombre;
    private List<Producto> listaProductos = new ArrayList<>();

    //Constructor
    public ListaPrecio(String nombre){
        this.nombre = nombre;
    }

    @Override
    public IPrototype clone() {
        ListaPrecio clonar = new ListaPrecio(nombre);
        clonar.setListaProductos(listaProductos);
        return clonar;
    }

    @Override
    public IPrototype deepClone() {
        ListaPrecio clone = new ListaPrecio(nombre);
        List<Producto> cloneProductos = new ArrayList<>();
        for (Producto producto: listaProductos){
            Producto cloneProducto = (Producto) producto.clone();
            cloneProductos.add(cloneProducto);
        }
        clone.setListaProductos(cloneProductos);
        return clone;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + " - ListaPrecio{" +
                "nombre='" + nombre + '\'' +
                ", listaProductos=" + listaProductos +
                '}';
    }
}
