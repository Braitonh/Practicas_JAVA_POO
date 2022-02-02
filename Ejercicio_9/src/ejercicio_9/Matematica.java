
package ejercicio_9;

import java.lang.Number;

public class Matematica {
    
    public Integer num1,num2;
    
    //metodos contructor
    public Matematica(){
        
    }
    
    public Matematica(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //metodos get y set

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
    
    
    
    public void devolverMayor(){
        
        int bandera = num1.compareTo(num2);
        
        if (bandera == 1){
            System.out.println("El numero mas grande es: " + num1);
        }else{
            if (bandera == -1){
                System.out.println("El numero mas grande es: " + num2);
            }
        }
        
    }
    
    public void calcularPotencia(){
        int bandera = num1.compareTo(num2);
        
        if (bandera ==1){
            System.out.println("La potencia es: " + Math.pow(num1, num2));
        }else{
            if(bandera == -1){
                System.out.println("La potencia es: " + Math.pow(num2, num1));
            }
        }
    }
    
    public void calculaRaiz(){
        int bandera = num1.compareTo(num2);
        
        if (bandera == 1){
            System.out.println("La raiz cuadrada de " + num2 + " es: " + Math.sqrt(Math.abs(num2)));
        }else{
            if (bandera ==-1){
                System.out.println("La raiz cuadrada de " + num1 + " es: " + Math.sqrt(Math.abs(num1)));
            }
        }
        
    }
    
    public double devolverRaiz(){
        
        double raiz = Math.sqrt(Math.abs(num2));
        return (raiz);
    }

    
    
    
    
}
