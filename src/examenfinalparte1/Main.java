package examenfinalparte1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
//Ejecución del primer constructor
        /**
         * Ejecución del primer constructor
         */
        Metodos objConstructor1 = new Metodos(10, 20);
        int sumaVariables = objConstructor1.VariableSuma;
        System.out.println("Resultado: " + sumaVariables);
        
//Ejecución del segundo constructor  
        /**
         * Ejecución del segundo constructor
         */
        Metodos obxConstructor2 = new Metodos(10);
        int sumaVariables2 = obxConstructor2.VariableSuma;
        System.out.println("Resultado: " + sumaVariables2);
        
//Ejecución del tercer constructor   
        /**
         * Ejecucion del tercer constructor
         */
        Metodos objConstructor3 = new Metodos();
        int sumaVariable3 = objConstructor3.VariableSuma;
        System.out.println("Resultado: " + sumaVariable3);
    }
}
