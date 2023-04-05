package EjemplosBucles;

public class EjemploSwitchCase {
    public static void main(String[] args) {
        var estacion = "Verano";

        switch(estacion){
            case "Otoño":
            System.out.println("Es Otoño");
            break;

            case "Verano":
            System.out.println("Es Verano");
            break;

            default:
            System.out.println("Es otra estacion");
            break;
        }
    }
}
