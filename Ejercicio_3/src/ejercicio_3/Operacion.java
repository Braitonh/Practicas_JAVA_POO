
package ejercicio_3;


public class Operacion {
    
    private int num1,num2;
    
    //Metodos constructor
    public Operacion(){
        
    }
    
    public Operacion (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Metodos get y set

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    //Metodos
    
    public void crearOperacion(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int Sumar(){
        crearOperacion(num1, num2);
        
        int suma = num1 + num2;
        
        return (suma);
       
    }
    
    public int Resta(){
        crearOperacion(num1, num2);
        
        int resta = num1 - num2;
        
        return (resta);
    }
    
    public int Multiplicacion(){
        crearOperacion(num1, num2);
        int resultado = num1 * num2;
        if (num1 == 0 || num2==0){
            System.out.println("Error, multiplicacion x 0");
        }
        return(resultado);
    }
    
    public int Division(){
        crearOperacion(num1, num2);
        int resultado;
        
        if (num2==0){
            resultado = 0;
            System.out.println("Error,division x 0");
        }else{
            resultado = num1 / num2;
        }
        return (resultado);
    }
    
    
    
    
    
    
    
}
