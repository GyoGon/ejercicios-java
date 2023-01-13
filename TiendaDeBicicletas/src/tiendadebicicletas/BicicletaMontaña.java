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
public class BicicletaMontaña extends Bicicleta {
    private String talla;

    @Override
    public void listar() {
        System.out.println("Tipo: "+getTipo());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Color: "+getColor());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Talla Aro: "+getTallaAro());
        System.out.println("Talla segun tamaño: "+getTalla());
    }
    @Override
    public void totalPagoProducto(){
        setPrecio((int)((getPrecio()*iva)*descuentoMontaña));
    }
    @Override
    public void totalAPagarIVA() {
        System.out.println(((int)((getPrecio()*iva))));
    }

    @Override
    public void descuento() {
        System.out.println((int)((getPrecio()*descuentoMontaña)));
    }
    
    
    public BicicletaMontaña() {
    }

    public BicicletaMontaña(String talla, String color, String modelo, String tipo, int precio, int tallaAro) {
        super(color, modelo, tipo, precio, tallaAro);
        setTalla(talla);
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
}
