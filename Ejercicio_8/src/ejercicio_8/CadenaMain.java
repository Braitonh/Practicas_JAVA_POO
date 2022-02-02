
package ejercicio_8;

import java.util.Scanner;

public class CadenaMain {

    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        Cadena cadena = new Cadena();
        
        
        
        System.out.println("Ingrese una frase");
        
        cadena.setFrase(leer.next());
        cadena.setLongitud(cadena.getFrase().length());
        
        System.out.println("La frase es: " + cadena.getFrase() + " y su longuitud es: " + cadena.getLongitud());
        
        cadena.mostrarVocales();
        cadena.invertirFrase();
        System.out.println("Ingrese una letra");
        cadena.vecesRepetido(leer.next());
        System.out.println("Ingrese una frase");
        cadena.compararLongitud(leer.next());
        System.out.println("Ingrese una frase");
        cadena.unirFrases(leer.next());
        System.out.println("Ingrese una letra");
        cadena.reemplazar(leer.next().charAt(0));
        System.out.println("Ingrese una letra");
        if(cadena.contiene(leer.next())){
            System.out.println("La frase contiene la letra deseada");
        }else{
            System.out.println("La frase NO contiene la letra deseada");
        }
        
        
        
        
        
        
        
    }
    
}
