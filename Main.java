/*Crear una función con tres parámetros que sean números que se suman entre sí.
*Llamar a la función en el main y darle valores.*/

public class Main {

    public static void main(String[] args) {
        int result;
        result = sumaTresNumeros(10, 100, 50);
        System.out.println(result);

    }

    public static int sumaTresNumeros(int x, int y, int z) {
        return x + y + z;
    }

}
