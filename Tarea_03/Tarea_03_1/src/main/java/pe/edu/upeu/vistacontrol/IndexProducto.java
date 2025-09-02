package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.Producto;
import pe.edu.upeu.utils.Lectura;

public class IndexProducto {
    public static void main(String[] args) {
        Lectura leer = new Lectura();
        Producto prod = new Producto();

        System.out.print("> Código: ");
        prod.setCodigo(leer.cadena());
        System.out.print("> Nombre: ");
        prod.setNombre(leer.cadena());
        System.out.print("> Categoría: ");
        prod.setCategoria(leer.cadena());
        System.out.print("> Precio: ");
        prod.setPrecio(leer.decimal());
        System.out.print("> Stock: ");
        prod.setStock(leer.entero());

        System.out.println("DATOS INGRESADOS");
        System.out.println("* Código: " + prod.getCodigo());
        System.out.println("* Nombre: " + prod.getNombre());
        System.out.println("* Categoría: " + prod.getCategoria());
        System.out.println("* Precio: " + prod.getPrecio());
        System.out.println("* Stock: " + prod.getStock());
    }
}