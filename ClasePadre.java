package operaciones;
import java.util.Scanner;

/**
 * Clase "Padre" de donde se heredaran los atributos y metodos
 * @author vilarj
 */
public class ClasePadre {
    
    protected int primerValor, segundoValor, resultado;
    Scanner entrada = new Scanner(System.in);
    
    /**
     * Este metodo pregunta por los dos numeros al usuario
     */
    public void pedirDatos(){
        System.out.print("Entre el primer valor: ");
        primerValor = entrada.nextInt();
        
        System.out.print("Entre el segundo valor: ");
        segundoValor = entrada.nextInt();
    }
    
    /**
     * Este metodo muestra el resultado de la operacion
     */
    public void mostrarDatos(){
        System.out.println(resultado);
    } 
}