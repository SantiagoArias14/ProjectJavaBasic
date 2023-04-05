package EjemplosBucles;

public class EjemploWhile {
    public static void main(String[] args) {
        int contador = 10;

        while (contador > 0) { // Los parentesis los utilizo para representar el "Entonces"
            System.out.println(contador);
            contador = contador - 1; // La forma mas utilizada es contador--;
        }
    }
}
