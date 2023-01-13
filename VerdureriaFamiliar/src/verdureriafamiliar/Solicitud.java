/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verdureriafamiliar;
import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class Solicitud {
    int numero, dia, mes, anio, total;
    String cliente, productos, producto;

    public Solicitud(int numero, int dia, int mes, int año, int total, String cliente, String productos) {
        this.numero = numero;
        this.dia = dia;
        this.mes = mes;
        this.anio = año;
        this.total = total;
        this.cliente = cliente;
        this.productos = productos;
    }

    
    public String detallePedido() {
        return "Solicitud{" + "numero=" + numero + ", fecha: " + dia + "/"+ mes + "/" + anio + ", total=" + total + ", cliente=" + cliente + ", productos=" + productos + '}';
    }
    public String descuento(int descuento) {
        setTotal((getTotal()*(1-descuento/100)));
        return "El total actual es de: " + total + " Con un descuento de: " + descuento;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "numero=" + numero + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", total=" + total + ", cliente=" + cliente + ", productos=" + productos + ", producto=" + producto + '}';
    }
    
    
    
    public String obtenerNumeroSolicitud(){
        getNumero();
        return "El codigo de solicitud es " + numero;
    }
    public String agregarProductos(String Producto) {
        setProductos(getProductos() + producto );  
        return productos;
    }
    
    public boolean validadFecha(){
        boolean validoFecha=false;

        if (dia<1 || dia>31) {
            validoFecha=true;
        }

        if (mes<1 || mes>12) {
            validoFecha=true;
        }

        if (mes==2 && dia==29 && anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0) ) {
            validoFecha=true;
            }

        return validoFecha;
        }
    
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    
}
