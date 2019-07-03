/*
 * Pedir dos palabras por teclado, indicar si son iguales.
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra1, palabra2;
		
		System.out.print("Entre la primera palabra: ");
		palabra1 = entrada.next();
		
		System.out.print("Entre la segunda palabra: ");
		palabra2 = entrada.next();
		
		if(palabra1.equals(palabra2)) {System.out.print("Ambas palabras son iguales");}
		else {System.out.print("Las palabras no son iguales");}
		
		// Cerrando la clase Scanner
		entrada.close();
	}
}
