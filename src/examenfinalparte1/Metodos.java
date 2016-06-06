package examenfinalparte1;

public class Metodos {
    
//Variables
    
    int VariableSuma;
    
//Constructores
    
    /*Sobrecarga de constructores*/
    
    public Metodos(int primerValor, int segundoValor) {
        VariableSuma = Suma(primerValor, segundoValor);
    }

    public Metodos(int valorUnico) {

        VariableSuma = Suma(valorUnico, valorUnico);
    }

    public Metodos() {
        VariableSuma = -1;

    }
    
//Métodos
    
    public int Suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
