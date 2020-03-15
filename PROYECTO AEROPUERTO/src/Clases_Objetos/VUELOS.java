package Clases_Objetos;

public class VUELOS {

    private String Identificador;
    private String Ciudad_de_Origen;
    private String Ciudad_de_Destino;
    private double Precio;
    private int Numero_Maximo_de_Pasajeros;
    private int Numero_Actual_de_Pasajeros;
    PASAJEROS Pasajeros_Actuales[];

    public VUELOS(PASAJEROS[] Pasajeros_Actuales, String Identificador, String Ciudad_de_Origen, String Ciudad_de_Destino, double Precio, int Numero_Maximo_de_Pasajeros, int Numero_Actual_de_Pasajeros) {
        this.Identificador = Identificador;
        this.Ciudad_de_Origen = Ciudad_de_Origen;
        this.Ciudad_de_Destino = Ciudad_de_Destino;
        this.Precio = Precio;
        this.Numero_Maximo_de_Pasajeros = Numero_Maximo_de_Pasajeros;
        this.Numero_Actual_de_Pasajeros = Numero_Actual_de_Pasajeros;
        this.Pasajeros_Actuales = Pasajeros_Actuales;
    }

    public void Insertar_Pasajero(PASAJEROS pasajero) {
        System.out.println("Introduzaca un Pasajero : ");
    }

    //Sobrecarga de Metodos
    public PASAJEROS[] getPasajeros_Actuales(int PasajerosActuales) {
        return Pasajeros_Actuales;
    }

    public PASAJEROS[] getPasajeros_Actuales(String PasaPorte_de_Pasajero) {
        return Pasajeros_Actuales;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public String getCiudad_de_Origen() {
        return Ciudad_de_Origen;
    }

    public String getCiudad_de_Destino() {
        return Ciudad_de_Destino;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getNumero_Maximo_de_Pasajeros() {
        return Numero_Maximo_de_Pasajeros;
    }

    public int getNumero_Actual_de_Pasajeros() {
        return Numero_Actual_de_Pasajeros;
    }

}
