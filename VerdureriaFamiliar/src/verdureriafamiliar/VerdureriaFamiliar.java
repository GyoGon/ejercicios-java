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
public class VerdureriaFamiliar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Producto Zanahoria = new Producto ( "1000", 890, "Verdura", "Zanahoria", "1000 gramos");
    Producto Pepino = new Producto ("1110", 579, "Verdura", "Pepino", "1 unidad");
    Producto Pina = new Producto ("5000", 1789, "Fruta", "Pina", "2 unidades");
    Producto Arandanos = new Producto ("5005", 1490, "Fruta", "Arandano", "125 gramos");
    Cliente cliente1 = new Cliente ("12189443", "5", "Juan Perez", "juanito@gmail.com", "Avenida Francia #550, Valparaiso", "98987678");
    Cliente cliente2 = new Cliente ("18112345", "K", "Paulina Godoy", "pau.godoy@gmail.com", "5 Norte #231, Viña del mar", "87454432");
    Solicitud solicitud1 = new Solicitud (1, 16, 12, 2019, 2627, "Cliente 1", "Zanahoria 890 1kg; Pepino 579 3 unidades");
    Solicitud solicitud2 = new Solicitud (2, 17, 12, 2019, 1789, "Cliente 2", "Piña 1789 1 unidad");
    solicitud1.agregarProductos("tomate");
    solicitud2.agregarProductos("huevo");
    solicitud1.validadFecha();
    solicitud2.validadFecha();
    System.out.println(solicitud1.detallePedido());
    System.out.println(solicitud1);
    solicitud2.descuento(20);
    System.out.println(solicitud2.obtenerNumeroSolicitud());
    System.out.println(solicitud2);
    
    }
    
}
