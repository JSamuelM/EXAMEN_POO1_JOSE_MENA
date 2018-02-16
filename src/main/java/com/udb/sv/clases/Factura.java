/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udb.sv.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Factura {
    private List<Productos> listProdu;
    private String name;
    private int cant;
    private int total;
    
    
    public Factura() {
        this.listProdu = new ArrayList<>();
    }

    public Factura(Productos listProdu) {
        this.name = name;
    }

    public List<Productos> getListProdu() {
        return listProdu;
    }

    public void setListProdu(List<Productos> listProdu) {
        this.listProdu = listProdu;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
