package examenfinalparte1;

import java.io.IOException;

public class Main {
    
/*El 'Segundo Commit' se "extravió" y no lo he puesto, ningún cambio significativo no explicado, simplemente puse 'Tercer Commit' en vez de 'Segundo Commit'*/
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
