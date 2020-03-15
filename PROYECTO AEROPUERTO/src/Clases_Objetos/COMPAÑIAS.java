package Clases_Objetos;

public class COMPAÑIAS {

    private String Nombre_Compañia;
    private int Numero_de_Vuelo = 0;
    VUELOS Vuelos_Actuales[];

    //Sobrecarga de Metodos Contructores
    public COMPAÑIAS(String Nombre_Compañia) {
        this.Nombre_Compañia = Nombre_Compañia;
    }

    public COMPAÑIAS(String Nombre_Compañia, VUELOS[] Vuelos_Actuales) {
        this.Nombre_Compañia = Nombre_Compañia;
        this.Vuelos_Actuales = Vuelos_Actuales;
    }

    public void Insertar_Vuelo(VUELOS vuelo) {
        System.out.println("introduzaca un vuelo");
    }

    public String getNombre_Compañia() {
        return Nombre_Compañia;
    }

    public int getNumero_de_Vuelo() {
        return Numero_de_Vuelo;
    }

    //Sobrecarga de Metodos
    public VUELOS[] getVuelos_Actuales(int VueloActual) {
        return Vuelos_Actuales;
    }

    public VUELOS[] getVuelos_Actuales(String Identificador) {
        return Vuelos_Actuales;
    }

}
