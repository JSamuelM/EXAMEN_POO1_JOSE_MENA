/*
 * Clase manejador de factura
 * Que se encarga de agregar productos a una factura
 * y realizar varias funciones
 */
package com.udb.sv.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class ManejadorFactura {
    List<Productos> listProdu;
    List<Factura> listFact;

    public ManejadorFactura() {
        this.listProdu = new ArrayList<>();
    }
    
    /**
     * Metodo para agregar producto a una factura
     * @param fact
     * @param pro
     * @return 
     */
    public boolean addProdAFact(Factura fact, Productos pro)
    {
        boolean resp = false;
        try
        {
            if(fact != null)
            {
                List<Productos> listTemp = fact.getListProdu(); //Obtiene la lista de jugadores
                listTemp.add(pro); //Agrega el jugador
                fact.setListProdu(listTemp); //Devuelve la lista con el jugador agregado
                resp = true;
            }
            //this.listFact.add(new Factura(pro, cant));
        } catch(Exception ex)
        {
            System.err.println("Error al agregar producto: " + ex.getMessage());
        }
        return resp;
    }
}
