/*
 * Clase manejador de productos
 * Que contiene todos las funciones necesarias para el parcial
 */
package com.udb.sv.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class ManejadorProductos {
    List<Productos> listProd;

    public ManejadorProductos() {
        this.listProd = new ArrayList<>();
    }
    
    /**
     * Funcion que permite guardar un producto en una Lista recibiendo los siguientes parametros
     * @param name
     * @param price
     * @param cant
     * @param miniCant
     * @param fechCadu
     * @return 
     */
    public boolean addProdu(String name, double price, int cant, int miniCant, String fechCadu)
    {
        boolean resp = false;
        try
        {
            this.listProd.add(new Productos(name, price, cant, miniCant, fechCadu));
            resp = true;
        } catch(Exception ex)
        {
            System.err.println("Error al guardar producto: " + ex.getMessage());
        }
        return resp;
    }
    
    /**
     * Retorna toda una lista de los productos que contenga
     * @return 
     */
    public List<Productos> listPro()
    {
        return this.listProd;
    }
    
    /**
     * Metodo que ordenar los productos con precios altos,
     * es decir, de mayor alto su producto al menor producto
     * @return 
     */
    public List<Productos> ordenProdConPreciAltos()
    {
        Collections.sort(listProd, (Productos o1, Productos o2) -> new Double(o2.getPrice()).compareTo(new Double(o1.getPrice())));
        System.out.println("Productos TOP 3 con precios más altos: " + listProd.get(0).getName() + 
                ", " + listProd.get(1).getName() + ", " + listProd.get(2).getName());
        return this.listProd;
    }
    
    /**
     * Metodo para calcular aquellos productos que su stock ha alcanzado su
     * maximo de Existencia Minima
     * @return 
     */
    public List<Productos> calcProduExisMini()
    {
//        Productos cant = new Productos();
//        Productos cantMini = new Productos();
        for (Productos producto : listProd) {
            if (producto.getCant() >= producto.getMiniCant())
            {
                System.out.println("Productos cuya existencia minima " + producto);
            }
        }
        return this.listProd;
    }
    
    /**
     * Metodo par calcular el producto más proximo a vencer
     * @return 
     */
    public List<Productos> calcProdAVencer()
    {
        Collections.sort(listProd, (Productos o1, Productos o2) -> new String(o2.getFechCadu()).compareTo(new String(o1.getFechCadu())));
        System.out.println("Porducto más proximo a vencer: " + listProd.get(0).getName());
        return this.listProd;
    }
}
