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
public class Esbirros extends Cartas {
    private int vida, ataque;
    private String mecanica;

    public Esbirros() {
    }

    public Esbirros(int vida, int ataque, String mecanica, String idTipo,String nombre, String idCarta, String rareza, int manaRequerido, String descripcion, boolean dorada) {
        super(idTipo,nombre, idCarta, rareza, manaRequerido, descripcion, dorada);
        setVida(vida);
        setAtaque(ataque);
        setMecanica(mecanica);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getMecanica() {
        return mecanica;
    }

    public void setMecanica(String mecanica) {
        this.mecanica = mecanica;
    }
    
}
