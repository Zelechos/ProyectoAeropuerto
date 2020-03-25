package Clases_Objetos;

public class COMPAÑIAS {

    private String Nombre_Compañia;
    private int Numero_de_Vuelo = 0;
    private VUELOS Vuelos_Actuales[] = new VUELOS[30];

    //Sobrecarga de Metodos Contructores
    public COMPAÑIAS(String Nombre_Compañia) {
        this.Nombre_Compañia = Nombre_Compañia;
    }

    public COMPAÑIAS(String Nombre_Compañia, VUELOS Vuelos[]) {
        this.Nombre_Compañia = Nombre_Compañia;
        Vuelos_Actuales = Vuelos;
        Numero_de_Vuelo = Vuelos.length;
    }

    public void Insertar_Vuelo(VUELOS vuelo) {
        Vuelos_Actuales[Numero_de_Vuelo] = vuelo;
        Numero_de_Vuelo++;
    }

    public String getNombre_Compañia() {
        return Nombre_Compañia;
    }

    public int getNumero_de_Vuelo() {
        return Numero_de_Vuelo;
    }

    //Sobrecarga de Metodos
    public VUELOS getVuelos_Actuales(int VueloActual) {  
        return Vuelos_Actuales[VueloActual];
    }

    public VUELOS getVuelos_Actuales(String Identificador) {
        boolean Encontrado = false;
        int VueloACtual = 0;
        VUELOS Identificador_Vuelo = null;

        while ((!Encontrado) && (VueloACtual < Vuelos_Actuales.length)) {
            if (Identificador.equals(Vuelos_Actuales[VueloACtual].getIdentificador())) {
                Encontrado = true;
                Identificador_Vuelo = Vuelos_Actuales[VueloACtual];
            }
            VueloACtual++;
        }

        return Identificador_Vuelo;
    }

}
