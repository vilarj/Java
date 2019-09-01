
public class Lujos extends Vehiculos{
	private String modelo;
	
	public Lujos(String matricula, String color, int nPuertas, String modelo){
		super(matricula, color, nPuertas);
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	@Override
	public void printDatos(){
		System.out.println("# de Matricula: " + matricula + "\nColor: " + color + "\n# Puertas: " + nPuertas + "\nModelo: " + modelo);
	}
}
