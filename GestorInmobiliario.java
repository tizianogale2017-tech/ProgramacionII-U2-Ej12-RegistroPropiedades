package Ejercicio12_registroPropiedades;

public class GestorInmobiliario {
    private String nombre;
    private RegistroPropiedad registro;

    public GestorInmobiliario(String nombre, RegistroPropiedad registro) {
        this.nombre = nombre;
        this.registro = registro;
    }

    public void gestionarTraspaso(Propiedad propiedad, Propietario nuevoTitular) {
        System.out.println(nombre + " solicita al Registro transferir \"" + propiedad.getDireccion()
                + "\" a " + nuevoTitular.getNombreCompleto() + "...");
        if (registro.transferirInmueble(propiedad, nuevoTitular)) {
            System.out.println("  -> Transferencia inscripta. Nuevo titular: " + propiedad.getPropietario().getNombreCompleto()
                    + " (DNI " + propiedad.getPropietario().getDni() + ")");
        } else {
            System.out.println("  -> Operación BLOQUEADA: la propiedad tiene embargos. Titular sin cambios: "
                    + propiedad.getPropietario().getNombreCompleto());
        }
    }
}
