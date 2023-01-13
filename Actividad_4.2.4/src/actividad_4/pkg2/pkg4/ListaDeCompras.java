/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_4.pkg2.pkg4;

import java.util.ArrayList;

/**
 *
 * @author clop2
 */
public class ListaDeCompras
{
    private ArrayList<Producto> listaDeCompras = new ArrayList();

    public ArrayList<Producto> getListaDeCompras()
    {
        return listaDeCompras;
    }
    
    public boolean agregarProducto(Producto producto)
    {
        return this.listaDeCompras.add(producto);
    }
    
    public int calcularProductosEnOferta()
    {
        int totalProductosEnOferta = 0;
        
        for(Producto p : getListaDeCompras())
        {
            if(p.isOferta())
            {
                totalProductosEnOferta = totalProductosEnOferta + p.getPrecio();
            }
        }
        
        return totalProductosEnOferta;
    }
    
    public void verTotalListaDeCompras()
    {
        int total = 0;
        
        for(Producto p : getListaDeCompras())
        {
            System.out.println("Codigo: "+p.getCodigo()+" Producto: "+p.getDescripcion()+" Precio: "+p.getPrecio());
            total = total + p.getPrecio();
        }
        
        System.out.println("Total de la Lista de Compras: $"+total);
        
    }
    
    
}
