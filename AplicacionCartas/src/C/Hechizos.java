/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

/**
 *
 * @author Paolo
 */
public class Hechizos extends Cartas {
    private String descripcionHabilidad;

    public String getDescripcionHabilidad() {
        return descripcionHabilidad;
    }

    public void setDescripcionHabilidad(String descripcionHabilidad) {
        this.descripcionHabilidad = descripcionHabilidad;
    }

    public Hechizos() {
    }

    public Hechizos(String descripcionHabilidad, String idTipo,String nombre, String idCarta, String rareza, int manaRequerido, String descripcion, boolean dorada) {
        super(idTipo,nombre, idCarta, rareza, manaRequerido, descripcion, dorada);
        setDescripcionHabilidad(descripcionHabilidad);
    }
    
}
