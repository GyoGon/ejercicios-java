/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;


/**
 *
 * @author dapg0
 */
public abstract class Cartas 
{
    private String idTipo,nombre, idCarta, rareza;
    private int manaRequerido;
    private String descripcion;
    boolean dorada;

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()> 0){
        this.nombre = nombre;
        }
    }

    public String getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(String id) {
        this.idCarta = idCarta;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public int getManaRequerido() {
        return manaRequerido;
    }

    public void setManaRequerido(int manaRequerido) {
        this.manaRequerido = manaRequerido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public boolean isDorada() {
        return dorada;
    }

    public void setDorada(boolean dorada) {
        this.dorada = dorada;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    
    public Cartas(String idTipo, String nombre, String idCarta, String rareza, int manaRequerido, String descripcion, boolean dorada) {
        setIdTipo(idTipo);
        setNombre(nombre);
        setIdCarta(idCarta);
        setRareza(rareza);
        setManaRequerido(manaRequerido);
        setDescripcion(descripcion);
        setDorada(dorada);
    }



    public Cartas() {
    }
    
    
    
    
}
