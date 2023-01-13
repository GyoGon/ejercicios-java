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
public class Arma extends Cartas{
    private int durabilidad, ataqueHeroe;

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getAtaqueHeroe() {
        return ataqueHeroe;
    }

    public void setAtaqueHeroe(int ataqueHeroe) {
        this.ataqueHeroe = ataqueHeroe;
    }

    public Arma() {
    }

    public Arma(int durabilidad, int ataqueHeroe, String idTipo,String nombre, String idCarta, String rareza, int manaRequerido, String descripcion, boolean dorada) {
        super(idTipo,nombre, idCarta, rareza, manaRequerido, descripcion, dorada);
        setDurabilidad(durabilidad);
        setAtaqueHeroe(ataqueHeroe);
    }
    
}
