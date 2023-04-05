package EjemplosBucles;

public class EjemploIf {
    public static void main(String[] args) {
        String Estacion = "Verano";
        var Temperatura = 20;

        if (Estacion == "Verano" && Temperatura > 15) {
            System.out.println("Es Verano");
        } else if (Estacion == "Primavera" && Temperatura < 18) {
            System.out.println("Es Primavera");
        } else {
            System.out.println("Es otra estacion...");
        }

    }
}
