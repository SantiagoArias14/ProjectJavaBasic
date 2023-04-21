package Tema9;

public class EjercicioTema9 {
    
    public static void main(String[] args) {

        // Objeto Cliente

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Santiago");
        cliente1.setEdad(21);
        cliente1.setTelefono(312813335);
        cliente1.setCredito(false);

        System.out.println("El cliente se llama: " + cliente1.getNombre());
        System.out.println("Santiago tiene: " + cliente1.getEdad() + " años");
        System.out.println("Su telefono es: " + cliente1.getTelefono());
        System.out.println("¿Santiago tiene algun credito?: " + cliente1.isCredito() + ".");
        
        System.out.println("-------------------------------------------------");

        // Objeto Trabajador

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("David");
        trabajador1.setEdad(27);
        trabajador1.setTelefono(3105098);
        trabajador1.setSalario(2.000);

        System.out.println("El cliente se llama: " + trabajador1.getNombre());
        System.out.println("David tiene: " + trabajador1.getEdad() + " años");
        System.out.println("Su telefono es: " + trabajador1.getTelefono());
        System.out.println("El salario de David es: " + trabajador1.getSalario() + " dolares.");

    }

}

abstract class Persona {
    
    // Variables
    int edad;
    String nombre;
    int telefono;

    //Constructor

    public Persona() {
    }

    // Inicializamos las funciones

    abstract public void setEdad(int edad);
    abstract public int getEdad();

    abstract public void setNombre(String nombre);
    abstract public String getNombre();

    abstract public void setTelefono(int telefono);
    abstract public int getTelefono();

}

// Creamos una clase que herede las propiedades de la Clase principal
class Cliente extends Persona {
    
    // Variables
    boolean credito;

    // Constructor
    public Cliente() {
    }

    // Llamamos las funciones de nuestra clase principal

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public boolean isCredito() {
        return this.credito;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    
    public int getTelefono() {
        return this.telefono;
    }

}

class Trabajador extends Persona {
    
    // Variables
    double salario;

    // Constructor

    public Trabajador() {
    }

    // Llamamos las funciones de nuestra clase principal

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
        
    public int getTelefono() {
        return this.telefono;
    }
}