/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_4.pkg2.pkg4;

/**
 *
 * @author usuario
 */
public class Congelados extends Producto{
    private boolean vegetal;

    public Congelados() {
    }

    public Congelados(boolean vegetal, String codigo, String descripcion, int precio, boolean oferta) {
        super(codigo, descripcion, precio, oferta);
        setVegetal(vegetal);
    }

    public boolean isVegetal() {
        return vegetal;
    }

    public void setVegetal(boolean vegetal) {
        this.vegetal = vegetal;
    }
    
    public void listar() {
        System.out.println("código producto: "+getCodigo());
        System.out.println("Descripción: "+getDescripcion());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Es vegetal?: "+isVegetal());
    }

    @Override
    public void agregarComentario(String comentario)
    {
        super.setComentario(comentario);
    }
}
