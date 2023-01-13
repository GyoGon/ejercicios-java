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
public class Clientes {
    private String nombre="", apellido="", rut, mail, categoria = "";
    private int edad;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, String rut, String mail, int edad, String categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.mail = mail;
        this.edad = edad;
        this.categoria = categoria;
    }
    
    public void enviarCorreo(){
        System.out.println("Para :" + this.mail);
        System.out.println("Estimado " + this.nombre + this.apellido);
        System.out.println("Le recordamos que el dia de mañana se realizará el evento para su compra, esperamos se encuentre preparado.");
        System.out.println("Saludos Cordiales.");
    }
    public boolean validarNombre(String nombre, String apellido){
        boolean valido = true;
        if(nombre.equals("") || apellido.equals(""))
            valido = false;
        return valido;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria.toUpperCase().equals("N") || categoria.toUpperCase().equals("A"))
            this.categoria = categoria;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
