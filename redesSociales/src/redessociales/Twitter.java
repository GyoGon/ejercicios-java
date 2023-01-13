/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redessociales;

/**
 *
 * @author Paolo
 */
public class Twitter extends RedSocial{
    private int id;
    private String noticia;
    private int fecha;

    public Twitter(int id, String noticia, int fecha, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
}
