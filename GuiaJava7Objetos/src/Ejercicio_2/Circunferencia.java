
package Ejercicio_2;

public class Circunferencia {
    
    private double radio;
    
    //metodo constructor
    
    public Circunferencia(){
        
    }
    
    public Circunferencia (double radio){
        this.radio = radio;
    }
    
   //metodo get y set
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public void crearCircunferencia (double radio){
        this.radio = radio;
    }
    
    public void area(){
        double area = 3.14 * (radio*radio);
        System.out.println("El area es: " + area);
    }
    
    public void perimetro (){
        double perimetro = 2 * 3.14 * radio;
        System.out.println("El perimetro es: " + perimetro);
    }
    
    
    
}
