package EjercicioCoche;

public class CocheNuevo {

    public static void main(String[] args) {
    
        Coche miCoche = new Coche(); // Creamos un nuevo objeto llamado miCoche.
    
        // Agregamos nuevas puertas a nuestro objeto.
        miCoche.agregarP();
        miCoche.agregarP();
        miCoche.agregarP();
        miCoche.agregarP();
    
        miCoche.mostrarP(); //Mostrar el numero de puertas que tiene el objeto
    }
    
}
