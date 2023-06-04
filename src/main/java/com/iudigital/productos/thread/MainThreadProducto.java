package com.iudigital.productos.thread;

import com.iudigital.productos.cliente.producto.ClienteProducto;
import com.iudigital.productos.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class MainThreadProducto {
    
    public static void main(String[] args){
        
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 =new ClienteProducto("Peter", productos);
        ClienteProducto cliente2 =new ClienteProducto("Diane", productos);
        
        long initialTime = System.currentTimeMillis();
        CajeraThreadProducto cajera1 = new CajeraThreadProducto("Martha", cliente1, initialTime);
        CajeraThreadProducto cajera2 = new CajeraThreadProducto("Anna", cliente2, initialTime);
        
        cajera1.start();
        cajera2.start();
    }  
    
    private static void setProductos(List<Producto> productos){
        Producto p1 = new Producto("Sandia", 100, 5);
        Producto p2 = new Producto("Melon", 50, 2);
        Producto p3 = new Producto("Uva", 700, 12);
        
        productos.add(p3);
        productos.add(p2);
        productos.add(p1);
    }
}
