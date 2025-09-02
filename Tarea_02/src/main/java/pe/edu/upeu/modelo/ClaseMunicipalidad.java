package pe.edu.upeu.modelo;

public class ClaseMunicipalidad {
    private String nombre;
    private String direccion;
    private String distrito;
    private String provincia;
    private int telefono;
    private String ruc;
    private int cantidadEmpleados;

    public ClaseMunicipalidad() {}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    public String getRuc() {
        return ruc;
    }
    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }
    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

}


