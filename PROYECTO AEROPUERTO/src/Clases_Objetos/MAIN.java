package Clases_Objetos;

import java.util.Scanner;

public class MAIN {

    static Scanner Entrada = new Scanner(System.in);
    final static int Numero_de_Aeropuerto = 4;//Numero de aeropuerto
    static AEROPUERTOS aeropuertos[] = new AEROPUERTOS[Numero_de_Aeropuerto];

    public static void main(String[] args) {

    }

    public static void InsertarDatosAeropuerto(AEROPUERTOS Aereo[]) {
        Aereo[0] = new AEROPUERTOS_PUBLICOS("PANAM", "BOSTON", "E.E.U.U", 80000000);
        Aereo[0].Insertar_Compañia(new COMPAÑIAS("Aero uss"));
        Aereo[0].Insertar_Compañia(new COMPAÑIAS("DigitalFly"));
        Aereo[0].getCompañias("DigitalFly").Insertar_Vuelo(new VUELOS("QWE231", "TEXAS", "TALAHINA ", 123.23, 100));
        Aereo[0].getCompañias("DigitalFly").Insertar_Vuelo(new VUELOS("S2X3EW", "BUENOS AIRES", "BERLIN", 342.23, 200));
        Aereo[0].getCompañias("Aero uss").Insertar_Vuelo(new VUELOS("34FER43", "PARIS", "UKRANIA", 450.23, 170));
        Aereo[0].getCompañias("DigitalFly").getVuelos_Actuales("QWE231").Insertar_Pasajero(new PASAJEROS("Dembele Peñanieto Volt", "039TER", "Aleman"));
        Aereo[0].getCompañias("DigitalFly").getVuelos_Actuales("QWE231").Insertar_Pasajero(new PASAJEROS("Ortega Miranda ChevsKovsKy", "002UKR", "Ukraniano"));
        Aereo[0].getCompañias("Aero uss").getVuelos_Actuales("34FER43").Insertar_Pasajero(new PASAJEROS("Esteban", "928KWE", "Argentina"));
        Aereo[0].getCompañias("Aero uss").getVuelos_Actuales("34FER43").Insertar_Pasajero(new PASAJEROS("Ramiro Urquieta Chavez", "475LOA", "Francesa"));
        
        Aereo[1]= new AEROPUERTOS_PUBLICOS("ARGENTINA AIR", "BUENOS AIRES","ARGENTINA", 99999999);
        Aereo[1].Insertar_Compañia(new COMPAÑIAS("Aero Messi"));
        Aereo[1].Insertar_Compañia(new COMPAÑIAS("Higuain mata Penales"));
        Aereo[1].getCompañias("Aero Messi").Insertar_Vuelo(new VUELOS("290MSE", "BUENOS AIRES", "PARIS", 555.457 , 150));
        Aereo[1].getCompañias("Aero Messi").Insertar_Vuelo(new VUELOS("034KEJ", "BUENOS AIRES", "AMSTERDAM", 994.145, 300));
        Aereo[1].getCompañias("Higuain mata Penales").Insertar_Vuelo(new VUELOS("847MSD", "CORDOBA", "BERLIN", 1254.457, 350));
        Aereo[1].getCompañias("Higuain mata Penales").Insertar_Vuelo(new VUELOS("834JCU", "LA PLATA", "DUBAI", 4852.254, 100));
        Aereo[1].getCompañias("Aero Messi").getVuelos_Actuales("290MSE").Insertar_Pasajero(new PASAJEROS("Jose Madero Vizcaino", "K3IJ7S", "Mexicana"));
        Aereo[1].getCompañias("Aero Messi").getVuelos_Actuales("290MSE").Insertar_Pasajero(new PASAJEROS("marco antonio solis", "MSEJ34", "Mexicana"));
        Aereo[1].getCompañias("Higuain mata Penales").getVuelos_Actuales("847MSD").Insertar_Pasajero(new PASAJEROS("alex motola puma", "MEKD7S", "Cubana"));
        Aereo[1].getCompañias("Higuain mata Penales").getVuelos_Actuales("847MSD").Insertar_Pasajero(new PASAJEROS("jhazmani puma omar", "KS8472", "Boliviana"));
        Aereo[1].getCompañias("Higuain mata Penales").getVuelos_Actuales("834JCU").Insertar_Pasajero(new PASAJEROS("hector leon oporto", "MXZ86S", "Peruana"));
        Aereo[1].getCompañias("Higuain mata Penales").getVuelos_Actuales("834JCU").Insertar_Pasajero(new PASAJEROS("benito quita copas", "FGH022", "Chilena"));
        Aereo[1].getCompañias("Aero Messi").getVuelos_Actuales("034KEJ").Insertar_Pasajero(new PASAJEROS("abel moreno sandoval", "JDSEU3", "Argentina"));
        Aereo[1].getCompañias("Aero Messi").getVuelos_Actuales("034KEJ").Insertar_Pasajero(new PASAJEROS("sergio palacios duran", "2837NJ", "Colombiana"));
               
               
        
    }

}
