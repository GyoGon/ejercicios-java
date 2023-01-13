/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_4.pkg2.pkg4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Liquidos extends Producto{
    private int litros;

    public Liquidos() {
    }

    public Liquidos(int litros, String codigo, String descripcion, int precio, boolean oferta) {
        super(codigo, descripcion, precio, oferta);
        setLitros(litros);
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
    
    public void listar() {
        System.out.println("código producto: "+getCodigo());
        System.out.println("Descripción: "+getDescripcion());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Cantidad de Litros: "+getLitros());
    }

    @Override
    public void agregarComentario(String comentario)
    {
        Scanner teclado = new Scanner(System.in);
        
        
        super.setComentario(teclado.next());
    }
}
