/*
 *  Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase;
		int opcion;
		
		System.out.print("Entre una frase: ");
		frase = entreada.nextLine();
		
		System.out.print("Entre una opcion:"
				+ "\n1: Mayuscula\n"
				+ "2: Minuscula\n"
        + "Opcion: ");
		opcion = entada.nextInt();
		
		if(opcion == 1) {System.out.print("Frase en Mayuscula: " + frase.toUpperCase());}
		else if(opcion == 2) {System.out.print("Frase en Minuscula: " + frase.toLowerCase());}
		else {System.out.print("Esta opcion no existe. Intentelo de nuevo.");}
		
		// Closing the Scanner class
		entrada.close();
	}
}
