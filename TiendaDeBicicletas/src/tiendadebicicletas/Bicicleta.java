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
public abstract class Bicicleta implements iBicicletas {
    private String color, modelo, tipo;
    private int precio, tallaAro;

    
    public abstract void totalPagoProducto();
    public Bicicleta() {
    }

    public Bicicleta(String color, String modelo, String tipo, int precio, int tallaAro) {
        setColor(color);
        setModelo(modelo);
        setTipo(tipo);
        setPrecio(precio);
        setTallaAro(tallaAro);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTallaAro() {
        return tallaAro;
    }

    public void setTallaAro(int tallaAro) {
        this.tallaAro = tallaAro;
    }
    
}
