package Clases_Objetos;

public class AEROPUERTOS_PRIVADOS extends AEROPUERTOS {

    private String Empresas[];
    private int Numero_de_Empresa;

    //Sobre Carga de Metodos Constructores Heredados
    public AEROPUERTOS_PRIVADOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais, String[] Empresas, int Numero_de_Empresas) {
        super(Nombre_de_Aeropuerto, Ciudad, Pais);
        this.Empresas = Empresas;
        this.Numero_de_Empresa = Numero_de_Empresas;
    }

    public AEROPUERTOS_PRIVADOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais, COMPAÑIAS[] Compañias, String[] Empresas, int Numero_de_Empresas) {
        super(Nombre_de_Aeropuerto, Ciudad, Pais, Compañias);
        this.Empresas = Empresas;
        this.Numero_de_Empresa = Numero_de_Empresas;
    }

    public void Insertar_Empresa(String[] Empresas) {

    }

    public void Insertar_Empresa(String Empresa) {

    }

    public String[] getEmpresas() {
        return Empresas;
    }

}
