package Tema9;

public class EjemploHerenciaSimpleYHerenciaMultiNivel {
    
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.setSonido("brrr");
        System.out.println(coche.getSonido());


    }

}

abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo(){
        System.out.println("Constructor de Vehiculo");
    }

    abstract public String getSonido();
    abstract public void setSonido(String sonido);

}

class Coche extends Vehiculo {

    public String getSonido(){
        return "Soy un sonido de mofle de carro: " + this.sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

class Moto extends Vehiculo {

    public String getSonido(){
        return "Soy un sonido de mofle: " + this.sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }  
}