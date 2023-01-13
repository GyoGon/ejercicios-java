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
public class Instagram extends RedSocial {
    private int id;
    private String historia;
    private boolean estado;

    public Instagram(int id, String historia, boolean estado, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public Instagram() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
