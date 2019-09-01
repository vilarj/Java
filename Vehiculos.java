
public class Vehiculos {

	protected String matricula;
	protected String color;
	protected int nPuertas;
	
	public Vehiculos(String matricula, String color, int nPuertas){
		this.matricula = matricula;
		this.color = color;
		this.nPuertas = nPuertas;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getPuertas(){
		return nPuertas;
	}
	
	public void printDatos(){
		 System.out.print("# de Matricula: " + matricula + "\nColor: " + color + "\n# Puertas: " + nPuertas);
	}
}
