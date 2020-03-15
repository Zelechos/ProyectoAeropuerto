package Clases_Objetos;

public class PASAJEROS {

    private String Nombre;
    private String PasaPorte;
    private String Nacionalidad;

    public PASAJEROS(String Nombre, String PasaPorte, String Nacionalidad) {
        this.Nombre = Nombre;
        this.PasaPorte = PasaPorte;
        this.Nacionalidad = Nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPasaPorte() {
        return PasaPorte;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }
    
    

}
