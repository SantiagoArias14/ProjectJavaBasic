package EjercicioCoche; 

public class Coche { // Creamos una clase llamada Coche
    int numP = 0; // Creamos una variable para guardar las puertas que tiene el coche.


    Coche (){ // Constructor de la clase Coche.

    }

    public void agregarP() { // Funcion que incremente el numero de puertas.
        numP++;

    }

    public void mostrarP() { 
        System.out.println("El coche tiene: " + numP + " puertas.");
    }
    
}


