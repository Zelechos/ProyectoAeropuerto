package Contraseña;

import java.util.Scanner;

public class Main {

    static Scanner Entrada = new Scanner(System.in);
    static int CuentaActual = 0;
    static Cuenta Cuentas[] = new Cuenta[10];

    public static void main(String[] args) {
        int Opcion;
        do {

            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::MENU::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println(":::::            1.- Crear una Cuenta Nueva.                                                                     :::::");
            System.out.println(":::::            2.- Verificacion de la Cuenta.                                                                  :::::");
            System.out.println(":::::            3.- Ingresar Mediante una Cuenta.                                                               :::::");
            System.out.println(":::::            4.- Mostrar Todas las Cuentas.                                                                  :::::");
            System.out.println(":::::            5.- Salir .                                                                                     :::::");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Digite una Opcion del Menu : ");
            Opcion = Entrada.nextInt();

            switch (Opcion) {
                case 1:
                    InsertarCuenta();
                    break;
                case 2:
                    String Serial;
                    System.out.print("Digite El Serial de Su Cuenta : ");
                    Serial = Entrada.next();
                    //                   System.out.println(Serial);
                    if (Verificador(Serial) == null) {
                        System.out.println("No existe La cuenta que Acaba de Ingresar");
                    } else {
                        System.out.println("Cuenta Verificada Existe ..");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese a su Cuenta : ");
                    System.out.print("Login : ");
                    String Login = Entrada.next();
                    System.out.print("Pasword : ");
                    String Pasword = Entrada.next();
                    if (Ingresar(Login, Pasword) == null) {
                        System.out.println("Acceso Denegado . . .");
                        System.out.println("Verifique su Cuenta .");
                    } else {
                        System.out.println("Acceso Concedido . . .");
                        System.out.println("Bienvenido ");
                    }
                    break;
                case 4:
                    System.out.println("Las Cuentas almacenadas son : ");
                    MostrarCuentas();
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("ERRO00R DIGITE OTRA OPCION");
                    break;
            }
        } while (Opcion != 5);
    }

    public static void InsertarCuenta() {
        String Login, Pasword, Serial;

        System.out.println("Ingrese Sus datos A continuacion ");
        System.out.println("Al Crear Una Cuenta Se te Creara un Serial Automaticamente de la Cuenta que creaste.\n");
        Serial = GeneradorDeSerial();
        System.out.println("Serial : " + Serial);
        System.out.print("Login : ");
        Login = Entrada.next();
        System.out.print("Pasword : ");
        Pasword = Entrada.next();

        System.out.println("Cuenta creada . . . ");
        Cuentas[CuentaActual] = new Cuenta(Login, Pasword, Serial);
        CuentaActual++;

    }

    public static String GeneradorDeSerial() {
        int Vector[] = new int[3];
        char Minusculas[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char Mayusculas[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        String Mostrador[] = new String[15];
        for (int Mostrar = 0; Mostrar < 15; Mostrar++) {

            if (Mostrar % 2 == 0) {
                int letra = (int) (Math.random() * 25 + 0);
                Mostrador[Mostrar] = String.valueOf(Minusculas[letra]);
            } else if (Mostrar / 3 == 0) {
                int letra = (int) (Math.random() * 25 + 0);
                Mostrador[Mostrar] = String.valueOf(Mayusculas[letra]);
            } else {
                int Numero = 0;
                Numero = (int) (Math.random() * 9 + 0);
                Vector[0] = Numero;

                Mostrador[Mostrar] = String.valueOf(Vector[0]);
            }

        }

        return Mostrador[0] + Mostrador[1] + Mostrador[2] + Mostrador[3] + Mostrador[4] + Mostrador[5] + Mostrador[6]
                + Mostrador[7] + Mostrador[8] + Mostrador[9] + Mostrador[10] + Mostrador[11] + Mostrador[12] + Mostrador[13] + Mostrador[14];

    }

    static public Cuenta Verificador(String Serial) {
        boolean Encontrado = false;
        int CuentaACtual = 0;
        Cuenta CuentaVerificacion = null;

        while ((!Encontrado) && (CuentaACtual < CuentaActual)) {
            if (Serial.equals(Cuentas[CuentaACtual].getSerial())) {
                Encontrado = true;
                CuentaVerificacion = Cuentas[CuentaACtual];
            }
            CuentaACtual++;
        }

        if (!Encontrado) {
            CuentaVerificacion = null;
        }
        return CuentaVerificacion;
    }

    static public Cuenta Ingresar(String Login, String Pasword) {
        boolean Encontrado = false;
        int CuentaACtual = 0;
        Cuenta CuentaVerificacion = null;

        while ((!Encontrado) && (CuentaACtual < CuentaActual)) {
            if (Login.equals(Cuentas[CuentaACtual].getLogin()) && (Pasword.equals(Cuentas[CuentaACtual].getPasword()))) {
                Encontrado = true;
                CuentaVerificacion = Cuentas[CuentaACtual];
            }
            CuentaACtual++;
        }

        if (!Encontrado) {
            CuentaVerificacion = null;
        }
        return CuentaVerificacion;
    }

    static public void MostrarCuentas() {
        for (int CuentaACtual = 0; CuentaACtual < CuentaActual; CuentaACtual++) {
            Cuentas[CuentaACtual].MostrarDatos();
        }
    }

}
