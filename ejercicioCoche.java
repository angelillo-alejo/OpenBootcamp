public class EjercicioCoche {
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

