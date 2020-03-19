package Clases_Objetos;

public class AEROPUERTOS_PRIVADOS extends AEROPUERTOS {

    private String Empresas[] = new String[20];
    private int Numero_de_Empresa;

    //Sobre Carga de Metodos Constructores Heredados
    public AEROPUERTOS_PRIVADOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais) {
        super(Nombre_de_Aeropuerto, Ciudad, Pais);
    }

    public AEROPUERTOS_PRIVADOS(String Nombre_de_Aeropuerto, String Ciudad, String Pais, COMPAÑIAS[] comp, String empresas[]) {
        super(Nombre_de_Aeropuerto, Ciudad, Pais, comp);
        this.Empresas = empresas;
        Numero_de_Empresa = empresas.length;
    }

    public void Insertar_Empresas(String empresas[]) {
        this.Empresas = empresas;
        this.Numero_de_Empresa = empresas.length;
    }

    public void Insertar_Empresa(String emp) {
        Empresas[Numero_de_Empresa] = emp;
        Numero_de_Empresa++;
    }

    public String[] getEmpresas() {
        return Empresas;
    }

    public int getNumero_de_Empresa() {
        return Numero_de_Empresa;
    }

}
