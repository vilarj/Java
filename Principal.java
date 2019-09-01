/*
 * # Problema:
 * 	Hacer un programa que simule el polimorfismo. 4 clases (Principal, Vehiculos, Lujos, TodoTerreno)
 * 
 * Principal: Metodo Main
 * Vehiculos: Super Clase - # Matricula, Color, # Puertas
 * Lujos: Clase hija - # Matricula, Color, # Puertas, modelo
 * TodoTerreno: Clase hija- # Matricula, Color, # Puertas, Peso
 * 
 * Desarrollar el programa de modo POO.
 * 
 */
public class Principal {

	public static void main(String[] args){
		Vehiculos v1 = new Vehiculos("L756s", "Negro", 4);
		Vehiculos v2 = new Lujos("BMx785", "Blanco", 2, "Carrera");
		Vehiculos v3 = new TodoTerreno("85Lc", "Rojo", 4, 2570);
		
		v1.printDatos();
		System.out.println("\n^^^^^^^^^^^^^^^^^^^^");
		v2.printDatos();
		System.out.println("^^^^^^^^^^^^^^^^^^^^");
		v3.printDatos();
	}
}
