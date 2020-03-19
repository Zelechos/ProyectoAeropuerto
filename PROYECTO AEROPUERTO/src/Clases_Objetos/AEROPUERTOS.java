package Clases_Objetos;

public class AEROPUERTOS {

    private String Nombre_de_Aeropuerto;
    private String Ciudad;
    private String Pais;
    private int Numero_de_Compañia;
    private COMPAÑIAS Compañias[] = new COMPAÑIAS[15];

    //Sobre carga de metodos contructores
    public AEROPUERTOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais) {
        this.Nombre_de_Aeropuerto = Nombre_de_Aeropuerto;
        this.Ciudad = Ciudad;
        this.Pais = Pais;
        this.Numero_de_Compañia = 0;
    }

    public AEROPUERTOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais, COMPAÑIAS comp[]) {
        this.Nombre_de_Aeropuerto = Nombre_de_Aeropuerto;
        this.Ciudad = Ciudad;
        this.Pais = Pais;
        Compañias = comp;
        this.Numero_de_Compañia = comp.length;
    }

    public void Insertar_Compañia(COMPAÑIAS Compañia) {
        Compañias[Numero_de_Compañia] = Compañia;
        Numero_de_Compañia++;
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
    public COMPAÑIAS getCompañias(int CompañiaActual) {
        return Compañias[CompañiaActual];
    }

    public COMPAÑIAS getCompañias(String NombreCompañia) {
        boolean Encontrado = false;
        int CompañiaACtual = 0;
        COMPAÑIAS Nombre_Compañia = null;

        while ((!Encontrado) && (CompañiaACtual < Compañias.length)) {
            if (NombreCompañia.equals(Compañias[CompañiaACtual].getNombre_Compañia())) {
                Encontrado = true;
                Nombre_Compañia = Compañias[CompañiaACtual];
            }
            CompañiaACtual++;
        }

        return Nombre_Compañia;
    }

}
