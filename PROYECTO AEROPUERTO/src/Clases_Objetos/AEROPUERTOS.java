package Clases_Objetos;

public class AEROPUERTOS {

    private String Nombre_de_Aeropuerto;
    private String Ciudad;
    private String Pais;
    private int Numero_de_Compañia;
    private COMPAÑIAS Compañias[];

    //Sobre carga de metodos contructores
    public AEROPUERTOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais) {
        this.Nombre_de_Aeropuerto = Nombre_de_Aeropuerto;
        this.Ciudad = Ciudad;
        this.Pais = Pais;
    }

    public AEROPUERTOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais, COMPAÑIAS[] Compañias) {
        this.Nombre_de_Aeropuerto = Nombre_de_Aeropuerto;
        this.Ciudad = Ciudad;
        this.Pais = Pais;
        this.Compañias = Compañias;
    }

    public void Insertar_Compañia(COMPAÑIAS Compañia) {

    }

    public String getNombre_de_Aeropuerto() {
        return Nombre_de_Aeropuerto;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public COMPAÑIAS[] Obtener_Compañias() {
        return Compañias;
    }

    public int getNumero_de_Compañia() {
        return Numero_de_Compañia;
    }

    //Sobre carga de Metodos
    public COMPAÑIAS[] getCompañias(int CompañiaActual) {
        return Compañias;
    }

    public COMPAÑIAS[] getCompañias(String NombreCompañia) {
        return Compañias;
    }

}
