package examenfinalparte1;

public class Metodos {
    
//Variables
    
    /**
     *  Variable para igualar la suma
     */
    
    int VariableSuma;
    
//Constructores
    
    /*Sobrecarga de constructores*/
    
    /**
     * Constructor que recibe dos valores diferentes y los suma y lo iguala a la variable establecida
     * 
     * @param primerValor
     * @param segundoValor 
     */
    
    public Metodos(int primerValor, int segundoValor) {
        VariableSuma = Suma(primerValor, segundoValor);
    }
    /**
     * Constructor que recibe un valor único y lo suma por si mismo y lo iguala a la variable establecida
     * 
     * @param valorUnico 
     */
    public Metodos(int valorUnico) {

        VariableSuma = Suma(valorUnico, valorUnico);
    }
    /**
     * Constructor que iguala la variable declarada a un valor
     */
    public Metodos() {
        VariableSuma = -1;

    }
    
//Métodos
    
    /**
     * Metodo que recibe dos números, los suma y los 'retorna'
     * @param numero1
     * @param numero2
     * @return 
     */
    
    public int Suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
