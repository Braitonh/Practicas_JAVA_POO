
package EjercicioYoutube;

import java.util.Scanner;

public class sumaMain {
    
    public static void main (String args[]){
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el primer valor");
        int valor1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        int valor2 = entrada.nextInt();
        
        suma valores = new suma (valor1 , valor2);
        valores.imprimir();
    }
}
