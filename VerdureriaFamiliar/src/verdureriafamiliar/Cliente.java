/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verdureriafamiliar;

/**
 *
 * @author Paolo
 */
public class Cliente {
    String run, dv, nombre, mail, direccion,telefono;

    public Cliente(String run, String dv, String nombre, String mail, String direccion, String telefono) {
        this.run = run;
        this.dv = dv;
        this.telefono = telefono;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "run=" + run + ", telefono=" + telefono + ", dv=" + dv + ", nombre=" + nombre + ", mail=" + mail + ", direccion=" + direccion + '}';
    }
    
    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        if(run.length() >=7 || run.length() <=8)
            this.run = run;
    }

    public String getTelefono() {
            return telefono;
    }

    public void setTelefono(String telefono) {
        if(telefono.length() >= 8)
            this.telefono = telefono;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        if("1".equals(dv) || "2".equals(dv) || "3".equals(dv) || "4".equals(dv) || "5".equals(dv) || "6".equals(dv) || "7".equals(dv) || "8".equals(dv) || "9".equals(dv) || "0".equals(dv) || "k".equals(dv))
            this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if(mail.length() >= 6)
            this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
