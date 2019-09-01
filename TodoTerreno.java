
public class TodoTerreno extends Vehiculos{
	private float peso;
	
	public TodoTerreno(String matricula, String color, int nPuertas, float peso){
		super(matricula, color, nPuertas);
		this.peso = peso;
	}
	
	public float getPeso(){
		return peso;
	}
	
	@Override
	public void printDatos(){
		System.out.print("# de Matricula: " + matricula + "\nColor: " + color + "\n# Puertas: " + nPuertas + "\nPeso: " + peso);
	}
	
}
