/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadebicicletas;

/**
 *
 * @author Paolo
 */
public class TiendaDeBicicletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColeccionBicicletas coleccionBicicleta = new ColeccionBicicletas();
        BicicletaMontaña bici1 = new BicicletaMontaña("S", "Verde", "E-Mtb Specialized Turbo Levo", "Montaña", 3000000, 26);
        BicicletaElectrica bici2 = new BicicletaElectrica("M", "Roja", "Haibike Nduro 3.0 2019", "Electrica", 5000000, 28);
        BicicletaElectrica bici3 = new BicicletaElectrica("M", "Roja", "Haibike Nduro 3.0 2019", "Electrica", 5000000, 28);
        bici1.totalPagoProducto();
        bici2.totalPagoProducto();
        
        coleccionBicicleta.agregarBicicleta(bici1);
        coleccionBicicleta.agregarBicicleta(bici2);
        
        //PRUEBA DE QUE NO SE PUEDE REPETIR EL OBJETO
        coleccionBicicleta.agregarBicicleta(bici3);
        
        System.out.println("TOTAL DE LA COMPRA");
        coleccionBicicleta.totalCompra();
        System.out.println("");
        System.out.println("MOSTRAR TODAS LAS BICICLETAS");
        coleccionBicicleta.mostrarBicicleta();
        System.out.println("");
        System.out.println("");
        System.out.println("CANTIDAD DE BICICLETAS ELECTRICAS");
        coleccionBicicleta.cantidadElectrica();
        System.out.println("");
        System.out.println("CANTIDAD DE BICICLETAS DE MONTAÑA");
        coleccionBicicleta.cantidadMontaña();
    }
    
}
