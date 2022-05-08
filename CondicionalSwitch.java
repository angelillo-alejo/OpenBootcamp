package openbootcamp;

public class CondicionalSwitch {

	public static void main(String[] args) {
		/*Para el Switch, deberás crear la variable estacion, 
		 * y distintos case para las cuatro estaciones del año. 
		 * Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola 
		 * informando de la estación en la que está. También habrá que poner un default para cuando 
		 * el valor de la variable no sea una estación.
		 */
		
		int estacion=4;
		
		
		switch (estacion) {
		
		case 1:
			System.out.println("Estamos en Primavera");
		break;
		case 2: 
			System.out.println("Estamos en Verano");
		break;
		case 3: 
			System.out.println("Estamos en Otoño");
		break;
		case 4: 
			System.out.println("Estamos en Invierno");
		break;
		
		default:
			System.out.println("Introduce u valor correcto");
		
		}
		
		System.out.println(estacion);

 }

}	