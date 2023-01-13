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
public class Abarrotes extends Producto{
    private int peso;

    public Abarrotes() {
    }

    public Abarrotes(int peso, String codigo, String descripcion, int precio, boolean oferta) {
        super(codigo, descripcion, precio, oferta);
        setPeso(peso);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void listar() {
        System.out.println("código producto: "+getCodigo());
        System.out.println("Descripción: "+getDescripcion());
        System.out.println("Precio: "+getPrecio());
        System.out.println("EPeso: "+getPeso());
    }

    @Override
    public void agregarComentario(String comentario)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
