package Contraseña;

public class Cuenta {

    private String Login;
    private String Pasword;
    private String Serial;

    public Cuenta(String Login, String Pasword, String Serial) {
        this.Login = Login;
        this.Pasword = Pasword;
        this.Serial = Serial;
    }

    public String getLogin() {
        return Login;
    }

    public String getPasword() {
        return Pasword;
    }

    public String getSerial() {
        return Serial;
    }

    public void MostrarDatos() {
        System.out.println("╔══════════════════════╗");
        System.out.println("║Login : " + Login);
        System.out.println("║Pasword : " + Pasword);
        System.out.println("║Serial : "+Serial);
        System.out.println("╚══════════════════════╝");

    }

}
