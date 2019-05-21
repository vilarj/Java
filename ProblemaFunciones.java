/*
* Clase para las funciones logicas de una lavadora mediante el metodo de encapsulamiento
*/
package problemasamsung;
public class ProblemaFunciones {
    /**
     * Tipos de variables pedidas por Samsung
     */
    private int kilos = 0;
    private int llenadoCompleto = 0; // Si la lavadora esta llena, el numero cambia a uno
    private int colorRopa = 0; // Si la ropa es blanca, su color es 0. 
    private int lavadoCompleto = 0; // Si esta llena, lavadoCompleto = 1
    private int secadoCompleto = 0; // Si esta seca, secadoCompleto = 1;
    /**
     *
     * @param kilos
     * @param colorRopa
     */     
    public ProblemaFunciones(int kilos, int colorRopa){
        this.kilos = kilos;
        this.colorRopa = colorRopa;
    }
    
    // Tres metodos: Llenado, Lavado, Secado
    
    /**
     * Este metodo se encarga de decirle al usuario si la lavadora se ha llenado a 
     * capacidad. Tambien, chequea si el usuario se ha pasado del limite de ropa 
     * requerido por la lavadora.
     */
    private void Llenado(){
        if(kilos <= 12){
            System.err.println("Llenando..");
            llenadoCompleto = 1;
            System.err.println("Llenado Completo");
        }
        else{System.out.println("La carga de la ropa sobrepasa el limite (12 ropa)");}
    }
    /**
     * Este metodo se encarga de decirle al usurio si su ropa esta siendo lavada
     */
    private void Lavado(){
        Llenado(); // Se lleno la lavadora? Perfecto
        if(llenadoCompleto == 1){
            if(colorRopa == 1){
                System.out.println("Ropa blanca / Lavado suave");
                System.err.println("Lavando...");
                lavadoCompleto = 1;
            }
            else if(colorRopa == 2){
                System.err.println("Ropa de color / Lavado intenso");
                System.err.println("Lavando...");
                lavadoCompleto = 1;
            }
            else{System.out.println("El tipo de ropa no esta disponible"); lavadoCompleto = 1;}
        }
    }
    
    /**
     * Este metodo se encarga de informar al usuario si su ropa ha sido secada
     */
    private void Secado(){
        Lavado(); // Se lavo la ropa? Perfecto
        if(lavadoCompleto == 1){
            System.out.println("Secando...");
            secadoCompleto = 1;
        }
    }
    
    /**
     * Este metodo es pedido por los empleados de Samsung. Este metodo se 
     * encarga de decir si el lavado y secado ha sido completado. 
     * 
     * NOTE: Es el unico metodo que los empleados de Samsung 
     * pueden manipular.
     */
    public void CicloFinalizado(){
        Secado(); // Terminaste de secar? Perfecto
        if(secadoCompleto == 1){System.out.println("Tu ropa esta lista");}
    }
}