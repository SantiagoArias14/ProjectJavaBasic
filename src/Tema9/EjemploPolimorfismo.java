package Tema9;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        
        Carro Bmw = new Carro();
        Bmw.diHola();

    }    
}

class Vehiculo {

    public void diHola() {
        System.out.println("hola");
    }
}

class Carro extends Vehiculo {

    public void diHola() { 
        System.out.println("Soy un coche");
    }
}