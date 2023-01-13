/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_4.pkg2.pkg4;

import java.util.Scanner;

/**
 *
 * @author Jonatán Vásquez
 */
public class Actividad_424 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        
        Liquidos producto1 = new Liquidos(2, "123", "Gaseosa Retornable", 1600, false);
        Liquidos producto2 = new Liquidos(3, "124", "Gaseosa Retornable", 1800, true);
        
        Congelados producto3 = new Congelados(true, "125", "Choclo Congelado 200 Grs", 1000, true);
        
        //System.out.println("Ingrese su comentario:");
        //producto1.agregarComentario(teclado.next());
        
        listaDeCompras.agregarProducto(producto1);
        listaDeCompras.agregarProducto(producto2);
        listaDeCompras.agregarProducto(producto3);
        
        //System.out.println("Total de Productos en Oferta: "+listaDeCompras.calcularProductosEnOferta());
        
        listaDeCompras.verTotalListaDeCompras();
        
        
    }
    
}
