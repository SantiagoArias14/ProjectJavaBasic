package Tema8;


public class Ejemplo{

    public static void main(String[] args) {

        
        TipoVehiculo Coche = new TipoVehiculo(); // Instanciamos y creamos un objeto de tipo Vehiculo
        Coche.setTipo("Sport"); // FIjamos un valor al objeto en la propiedad.
        Coche.setVelocidadMaxima(300);
        Coche.setRapido(true);
        System.out.println("El tipo de Coche es: " + Coche.getTipo());
        System.out.println("La velocidad maxima es: " + Coche.getVelocidadMaxima());
        System.out.println(Coche.isRapido());

        TipoVehiculo Moto = new TipoVehiculo();
        Moto.setTipo("Turing");
        Moto.setVelocidadMaxima(250);
        Moto.setRapido(true);
        System.out.println("El tipo de Moto es: " + Moto.getTipo());
        System.out.println("La velocidad maxima es: " + Moto.getVelocidadMaxima());
        System.out.println(Moto.isRapido());
        
    }

}

class TipoVehiculo { 
    private String tipo; // El objeto puede acceder a las propiedades ya que es publica, si es privada no.
    private int velocidadMaxima;
    private boolean rapido;

    public void setRapido (boolean rapido) {
        this.rapido = rapido;
    }

    public boolean isRapido(){
        return this.rapido;
    }

    public void setVelocidadMaxima (int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public int getVelocidadMaxima () {
        return this.velocidadMaxima;
    }
    
    public void setTipo (String valor) {
        this.tipo = valor; // Se le agrega el this para que haga referencia a la propiedad de la clase.

    }

    public String getTipo() {
        return this.tipo;
    }
}