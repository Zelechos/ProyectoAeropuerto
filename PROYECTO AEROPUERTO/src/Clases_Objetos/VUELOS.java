
package Clases_Objetos;

public class VUELOS {

    private String Identificador;
    private String Ciudad_de_Origen;
    private String Ciudad_de_Destino;
    private double Precio;
    private int Numero_Maximo_de_Pasajeros;
    private int Numero_Actual_de_Pasajeros;
    private PASAJEROS Pasajeros_Actuales[];

    public VUELOS(String Identificador, String Ciudad_de_Origen, String Ciudad_de_Destino, double Precio, int Numero_Maximo_de_Pasajeros) {
        this.Identificador = Identificador;
        this.Ciudad_de_Origen = Ciudad_de_Origen;
        this.Ciudad_de_Destino = Ciudad_de_Destino;
        this.Precio = Precio;
        this.Numero_Maximo_de_Pasajeros = Numero_Maximo_de_Pasajeros;
        this.Numero_Actual_de_Pasajeros = 0;
        this.Pasajeros_Actuales = new PASAJEROS[Numero_Maximo_de_Pasajeros];
    }

    public void Insertar_Pasajero(PASAJEROS pasajero) {
        Pasajeros_Actuales[Numero_Actual_de_Pasajeros] = pasajero;
        Numero_Actual_de_Pasajeros++;
    }

    //Sobrecarga de Metodos
    public PASAJEROS getPasajeros_Actuales(int PasajeroActual) {
        return Pasajeros_Actuales[PasajeroActual];
    }

    public PASAJEROS getPasajeros_Actuales(String PasaPorte_de_Pasajero) {
        //Busqueda Secuencial
        boolean Encontrado = false;
        int Posicion = 0;
        PASAJEROS pasporte = null;

        //(Encontrado == false) es igual a (!Encontrado)
        while ((!Encontrado) && (Posicion < Pasajeros_Actuales.length)) {
            /* 
             (PasaPorte_de_Pasajero.equals(Pasajeros_Actuales[Posicion].getPasaPorte())
              esto es igual a esto 
             (PasaPorte_de_Pasajero == Pasajeros_Actuales[Posicion].getPasaPorte())
             */
            if (PasaPorte_de_Pasajero.equals(Pasajeros_Actuales[Posicion].getPasaPorte())) {
                Encontrado = true;
                pasporte = Pasajeros_Actuales[Posicion];
            }
            Posicion++;
        }

        return pasporte;
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
