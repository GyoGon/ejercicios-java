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
public interface iBicicletas {
    public void totalAPagarIVA();
    public void descuento();
    public void listar();
    public double iva = 1.19;
    public double descuentoElectrica = 0.95;
    public double descuentoMontaña = 0.9;
}
