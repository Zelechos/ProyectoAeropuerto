package Clases_Objetos;

public class AEROPUERTOS_PUBLICOS extends AEROPUERTOS {

    private double Subvencion;

    //sobre carga de metodos constructores heredados
    public AEROPUERTOS_PUBLICOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais) {
        super(Nombre_de_Aeropuerto, Ciudad, Pais);
    }

    public AEROPUERTOS_PUBLICOS(double Subvencion, String Nombre_de_Aeropuerto, String Ciudad, String Pais, COMPAÑIAS[] comp) {
        super(Nombre_de_Aeropuerto, Ciudad, Pais, comp);
        this.Subvencion = Subvencion;
    }

    public AEROPUERTOS_PUBLICOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais, double Subvencion) {
        super(Nombre_de_Aeropuerto, Ciudad, Pais);
        this.Subvencion = Subvencion;
    }

    public double getSubvencion() {
        return Subvencion;
    }

}
