package Ejercicio12_registroPropiedades;

public class Propiedad {
    private String direccion;
    private double tasacion;
    private String estadoLegal;
    private Propietario propietario;

    public Propiedad(String direccion, double tasacion, String estadoLegal, Propietario propietario) {
        this.direccion = direccion;
        this.tasacion = tasacion;
        this.estadoLegal = estadoLegal;
        this.propietario = propietario;
    }

    public boolean tieneEmbargo() {
        return estadoLegal.equals("EMBARGADA");
    }

    public String getDireccion() {
        return direccion;
    }

    public double getTasacion() {
        return tasacion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
