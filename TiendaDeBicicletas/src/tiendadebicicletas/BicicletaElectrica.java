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
public class BicicletaElectrica extends Bicicleta{
    private int cargaMaxima_mA, cantidadVelocidades;

    @Override
    public void listar() {
        System.out.println("Tipo: "+getTipo());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Color: "+getColor());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Talla Aro: "+getTallaAro());
        System.out.println("Carga Maxima en miliAmperios: "+getCargaMaxima_mA());
        System.out.println("Cantidad de velocidades: "+getCantidadVelocidades());
    }
    @Override
    public void totalAPagarIVA() {
        System.out.println((int)((getPrecio()*iva)));
    }

    @Override
    public void descuento() {
        System.out.println((int)((getPrecio()*descuentoElectrica)));
    }
    @Override
    public void totalPagoProducto(){
        setPrecio((int)((getPrecio()*iva)*descuentoElectrica));
    }
    
    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String talla, String color, String modelo, String tipo, int precio, int tallaAro) {
        super(color, modelo, tipo, precio, tallaAro);
        setCargaMaxima_mA(cargaMaxima_mA);
        setCantidadVelocidades(cantidadVelocidades);
    }

    public int getCargaMaxima_mA() {
        return cargaMaxima_mA;
    }

    public void setCargaMaxima_mA(int cargaMaxima_mA) {
        this.cargaMaxima_mA = cargaMaxima_mA;
    }

    public int getCantidadVelocidades() {
        return cantidadVelocidades;
    }

    public void setCantidadVelocidades(int cantidadVelocidades) {
        this.cantidadVelocidades = cantidadVelocidades;
    }


    
}
