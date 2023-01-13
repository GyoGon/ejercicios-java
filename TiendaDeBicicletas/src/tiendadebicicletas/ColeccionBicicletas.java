/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadebicicletas;

import java.util.ArrayList;

/**
 *
 * @author Paolo
 */
public class ColeccionBicicletas {
    private ArrayList<Bicicleta> coleccionBicicleta = new ArrayList();
    
    public ArrayList<Bicicleta> getColeccionBicicleta()
    {
        return coleccionBicicleta;
    }
    
    public boolean agregarBicicleta(Bicicleta bicicleta){
        for (Bicicleta bi : getColeccionBicicleta()) {
            if(bi.getTipo().equalsIgnoreCase(bicicleta.getTipo()) && bi.getModelo().equalsIgnoreCase(bicicleta.getModelo())){
                return false;
            }
        }
        return this.coleccionBicicleta.add(bicicleta);
    }
    public void totalCompra()
    {
        int total = 0;
        
        for(Bicicleta b : getColeccionBicicleta())
        {
            System.out.println("Tipo: "+b.getTipo()+" Modelo: "+b.getModelo()+" Precio: "+b.getPrecio());
            total = total + b.getPrecio();
        }
        
        System.out.println("Total de la Lista de Compras: $"+total);
    }
    public void cantidadMontaña(){
        int totalBicis = 0;
        for (Bicicleta bi : getColeccionBicicleta()) {
            if("Montaña".equals(bi.getTipo())){
                System.out.println("Modelo: "+bi.getModelo());
                System.out.println("Color: "+bi.getColor());
                System.out.println("Precio: "+bi.getPrecio());
                System.out.println("Talla Aro: "+bi.getTallaAro());
                totalBicis = totalBicis+1;
            }
        }
        System.out.println("Cantidad Bicicletas Montaña: " +totalBicis);
    }
    public void cantidadElectrica(){
        int totalBicis = 0;
        for (Bicicleta bi : getColeccionBicicleta()) {
            if("Electrica".equals(bi.getTipo())){
                totalBicis = totalBicis+1;
                System.out.println("Modelo: "+bi.getModelo());
                System.out.println("Color: "+bi.getColor());
                System.out.println("Precio: "+bi.getPrecio());
                System.out.println("Talla Aro: "+bi.getTallaAro());
            } 
        }
        System.out.println("Cantidad Bicicletas electricas: " +totalBicis);
    }
    public void mostrarBicicleta(){
        for(Bicicleta b : getColeccionBicicleta()){
            System.out.println("Tipo: "+b.getTipo());
            System.out.println("Modelo: "+b.getModelo());
            System.out.println("Color: "+b.getColor());
            System.out.println("Precio: "+b.getPrecio());
            System.out.println("Talla Aro: "+b.getTallaAro());
            System.out.println("-----------------------------");
                    
        }
    }
    
}
