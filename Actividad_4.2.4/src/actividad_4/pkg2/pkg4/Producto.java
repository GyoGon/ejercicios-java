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
public abstract class Producto implements iOperaciones{
    private String codigo, descripcion, comentario;
    private int precio;
    private boolean oferta;

    public Producto() {
    }

    public Producto(String codigo, String descripcion, int precio, boolean oferta) {
        setCodigo(codigo);
        setDescripcion(descripcion);
        setPrecio(precio);
        setOferta(oferta);
    }

    public String getComentario()
    {
        return comentario;
    }

    public void setComentario(String comentario)
    {
        this.comentario = comentario;
    }
    
    

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
