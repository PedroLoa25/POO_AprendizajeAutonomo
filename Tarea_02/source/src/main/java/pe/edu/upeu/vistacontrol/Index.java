package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.ClaseMunicipalidad;
import pe.edu.upeu.utils.Lectura;

public class Index {
    public static void inicio(){
        Lectura leer = new Lectura();
        ClaseMunicipalidad municipalidad = new ClaseMunicipalidad();

        System.out.print("> Nombre: ");
        municipalidad.setNombre(leer.cadena());
        System.out.print("> Direccion: ");
        municipalidad.setDireccion(leer.cadena());
        System.out.print("> Distrito: ");
        municipalidad.setDistrito(leer.cadena());
        System.out.print("> Provincia: ");
        municipalidad.setProvincia(leer.cadena());
        System.out.print("> Telefono: ");
        municipalidad.setTelefono(leer.entero());
        System.out.print("> RUC: ");
        municipalidad.setRuc(leer.entero());
        System.out.print("> Cantidad Empleados: ");
        municipalidad.setCantidadEmpleados(leer.entero());

        System.out.println("DATOS INGRESADOS");
        System.out.println("* Nombre: " + municipalidad.getNombre());
        System.out.println("* Direccion: " + municipalidad.getDireccion());
        System.out.println("* Distrito: " + municipalidad.getDistrito());
        System.out.println("* Provincia: " + municipalidad.getProvincia());
        System.out.println("* Telefono: " + municipalidad.getTelefono());
        System.out.println("* RUC: " + municipalidad.getRuc());
        System.out.println("* Cantidad Empleados: " + municipalidad.getCantidadEmpleados());
    }

    public static void main(String[] args) {
        inicio();
    }
}
