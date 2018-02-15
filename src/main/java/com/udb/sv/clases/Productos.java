/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udb.sv.clases;

/**
 *
 * @author Estudiante
 */
public class Productos {
    private String name;
    private double price;
    private int cant;
    private int miniCant;
    private String fechCadu;

    public Productos(String name, double price, int cant, int miniCant, String fechCadu) {
        this.name = name;
        this.price = price;
        this.cant = cant;
        this.miniCant = miniCant;
        this.fechCadu = fechCadu;
    }
    
    public Productos() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getMiniCant() {
        return miniCant;
    }

    public void setMiniCant(int miniCant) {
        this.miniCant = miniCant;
    }

    public String getFechCadu() {
        return fechCadu;
    }

    public void setFechCadu(String fechCadu) {
        this.fechCadu = fechCadu;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}
