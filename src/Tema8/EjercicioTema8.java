package Tema8;


public class EjercicioTema8 {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setEdad(21);
        persona.setNombre("Santiago");
        persona.setTelefono(321746095);

        System.out.println("Hola, mi nombre es: " + persona.getNombre());
        System.out.println("Y tengo: " + persona.getEdad() + " años");
        System.out.println("Mi numero de telefono es: " + persona.getTelefono());
    
    }


}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre (String nombre) {
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