/* 1 Crear una clase coche.
* 2 Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
*Una función que incremente el número de puertas que tiene el coche.
*Crear un objeto miCoche en el main y añadirle una puerta.
*Mostrar el número de puertas que tiene el objeto.*/

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumaPuertas();
        System.out.println("El coche tiene " + miCoche.puertas + " " + "puertas");

    }
}

class Coche {

    public int puertas = 4;

    public void sumaPuertas() {
        this.puertas++;

    }
}