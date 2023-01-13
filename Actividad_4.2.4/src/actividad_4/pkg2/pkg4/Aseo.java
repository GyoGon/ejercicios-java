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
public class Aseo extends Producto{
    private String tipo;

    public Aseo() {
    }

    public Aseo(String tipo, String codigo, String descripcion, int precio, boolean oferta) {
        super(codigo, descripcion, precio, oferta);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void listar() {
        System.out.println("código producto: "+getCodigo());
        System.out.println("Descripción: "+getDescripcion());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Tipo de producto de Aseo: "+getTipo());
    }

    @Override
    public void agregarComentario(String comentario)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
