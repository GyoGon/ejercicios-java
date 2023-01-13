/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verdureriafamiliar;

/**
 *
 * @author Paolo
 */
public class Producto {
    int precio;
    String codigo, subcategoria, descripcion, unidadOGramos;

    public Producto(String codigo, int precio, String subcategoria, String descripcion, String unidadOGramos) {
        this.codigo = codigo;
        this.precio = precio;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
        this.unidadOGramos = unidadOGramos;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", subcategoria=" + subcategoria + ", descripcion=" + descripcion + ", unidadOGramos=" + unidadOGramos + '}';
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.length() >= 4)
            this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio > 0)
            this.precio = precio;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        if("Fruta".equals(subcategoria) || "Verdura".equals(subcategoria))
            this.subcategoria = subcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadOGramos() {
        return unidadOGramos;
    }

    public void setUnidadOGramos(String unidadOGramos) {
        this.unidadOGramos = unidadOGramos;
    }
    
    
}
