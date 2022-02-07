
package ejercicio_10;

import java.util.Arrays;

public class Main10 {

    
    public static void main(String[] args) {
        
        double [] array1 = new double[10];
        double [] array2 ;
        
        //ingreso los elementos del arreglo 1
        
       for (int i = 0; i < array1.length; i++) {
            array1[i] = (double) Math.round(((Math.random() * 20) + 1) * 100) / 100;  //define la cantidad de decimales haciendo un redondeo
        }
         System.out.println(Arrays.toString(array1));  //Muestro los elementos del arreglo
         System.out.println("Ordenando....");
         Arrays.sort(array1);
         System.out.println("Vector ordenado de menor a mayor");
         System.out.println(Arrays.toString(array1));
         
         
         //areglor numero2
         
         array2 = Arrays.copyOfRange(array1, 0, 10);
         System.out.println(Arrays.toString(array2));
         System.out.println("Combinando los arreglos...");
         Arrays.fill(array2, 5, 10, 0.5); 
         System.out.println("El arreglo combinado es:");
         System.out.println(Arrays.toString(array2));
         
        
    }
    
}
