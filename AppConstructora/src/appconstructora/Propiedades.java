/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconstructora;

/**
 *
 * @author Giovanni Gonzalez
 */
public class Propiedades {
    private String direccion, comuna, descripcion= "";
    private Clientes cliente;

    public Clientes getCategoria() {
        return cliente;
    }

    public void setCategoria(Clientes categoria) {
        this.cliente = categoria;
    }

    private int metrosCuadrados;
    private double valor;
    public Propiedades() {
    }

    public Propiedades(String direccion, String comuna, String descripcion, double valor, int metrosCuadrados, Clientes cliente) {
        this.direccion = direccion;
        this.comuna = comuna;
        this.descripcion = descripcion;
        this.valor = valor;
        this.metrosCuadrados = metrosCuadrados;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Propiedades{" + "direccion=" + direccion + ", comuna=" + comuna + ", descripcion=" + descripcion + ", valor=" + valor + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    public void mostrarDatos()
    {
        System.out.println("-------------- DATOS DE LA PROPIEDAD -------------- ");
        System.out.println("DIRECCION : " + this.direccion);
        System.out.println("COMUNA : " + this.comuna);
        System.out.println("DESCRIPCION : " + this.descripcion);
        System.out.println("VALOR : " + this.valor);
        System.out.println("METROS CUADRADOS : " + this.metrosCuadrados);
 
    }
    public boolean validarDescripcion(String descripcion){
        boolean valido = true;
        if(descripcion.equals(""))
            valido = false;
        return valido;
    }
    public void descuento(double descuento){
        if (this.cliente.getCategoria().equals("N") & getValor()>=2000)
            setValor((getValor()*(1-descuento/100)));
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor>800)
            this.valor = valor;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        if(metrosCuadrados>30)
            this.metrosCuadrados = metrosCuadrados;
    }
    
}
