package EjemplosBucles;

public class EjercicioSwitchCase {
    public static void main(String[] args) {
        String Estacion = "Primavera";

        switch (Estacion) {

            case "Otoño":
            System.out.println("Es Otoño");
            break;

            case "Verano":
            System.out.println("Es Verano");
            break;

            case "Invierno":
            System.out.println("Es invierno");
            break;

            case "Primavera":
            System.out.println("Es Primavera");
            break;

            default:
            System.out.println("No es una estacion");
            break;
        }
    }
}
