package Ejercicio12_registroPropiedades;

public class Main {
    public static void main(String[] args) {
        RegistroPropiedad registro = new RegistroPropiedad();
        GestorInmobiliario gestor = new GestorInmobiliario("Martillero Suárez", registro);

        Propietario vendedor = new Propietario("20111222", "Elena Ríos");
        Propietario comprador = new Propietario("30333444", "Hugo Peralta");

        Propiedad libre = new Propiedad("Belgrano 450", 85000000.0, "LIBRE", vendedor);
        Propiedad embargada = new Propiedad("San Martín 1200", 120000000.0, "EMBARGADA", vendedor);

        gestor.gestionarTraspaso(libre, comprador);
        gestor.gestionarTraspaso(embargada, comprador);
    }
}
