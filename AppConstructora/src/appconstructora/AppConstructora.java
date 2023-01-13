/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconstructora;

import java.util.Scanner;

/**
 *
 * @author Giovanni Gonzalez
 */
public class AppConstructora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clientes cliente = new Clientes ("Juan", "Perez", "15.776.128-2", "juanitoxbnloco@gmail.com", 36, "A");
        Clientes cliente2 = new Clientes ("Raquel", "Ramirez", "18.445.774-5", "raquelitabkn@gmail.com", 43, "N");
        Propiedades propiedad = new Propiedades("Avenida Santelices", "Santiago", "Bonita y grande", 2000, 1000, cliente2);
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 4) {
            System.out.println("Menú");
            System.out.println("-----------------");
            System.out.println("1) Crear propiedad");
            System.out.println("2) Mostrar informacion de la propiedad");
            System.out.println("3) Realizar descuento");
            System.out.println("4) Salir");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has Elegido crear una nueva propiedad");
                    System.out.print("Ingrese la direccion de la propiedad: ");
                    String direccion = teclado.next();
                    System.out.print("Ingrese la comuna de la propiedad: ");
                    String comuna = teclado.next();
                    System.out.print("Ingrese la descripcion de la propiedad: ");
                    String descripcion = teclado.next();
                    System.out.print("Ingrese el valor de la propiedad: ");
                    double valor = teclado.nextDouble();
                    System.out.print("Ingrese los metros cuadrados de la propiedad: ");
                    int metrosCuadrados = teclado.nextInt();
                    Propiedades propiedad2 = new Propiedades(direccion, comuna, descripcion, valor, metrosCuadrados,cliente);
                    System.out.println("Se ha ingresado correctamente");
                    propiedad2.mostrarDatos();
                    break;
                case 2:
                    propiedad.mostrarDatos();
                    break;
                case 3:
                    System.out.println("Ingrese un porcentaje a descontar: ");
                    propiedad.descuento(teclado.nextInt());
                    System.out.println("valor actual de la propiedad: " +propiedad.getValor());
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("El valor ingresado no es válido. Intente nuevamente");
    }
    }
}
}
