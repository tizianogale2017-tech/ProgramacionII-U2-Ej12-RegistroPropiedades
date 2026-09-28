package Ejercicio12_registroPropiedades;

public class RegistroPropiedad {
    public boolean transferirInmueble(Propiedad p, Propietario nuevoTitular) {
        if (p.tieneEmbargo()) {
            return false;
        }
        p.setPropietario(nuevoTitular);
        return true;
    }
}
