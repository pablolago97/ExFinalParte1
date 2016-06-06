package examenfinalparte1;

public class Principal {
    
//Variables
    
    int i;
    
//Constructores
    
    /*Sobrecarga de constructores*/
    
    public Principal(int j, int m) {
        i = met(j, m);
    }

    public Principal(int j) {

        i = met(j, j);
    }

    public Principal() {
        i = -1;

    }
    
//Métodos
    
    public int met(int x, int x1) {
        return x + x1;
    }
}
