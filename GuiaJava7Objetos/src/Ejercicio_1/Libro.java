
package Ejercicio_1;

import java.util.Scanner;

public class Libro {
    
    Scanner entrada = new Scanner (System.in);
    
    private int ISBN, NumDePag;
    private String autor,Titulo;
    
    public Libro(){ //Constructor vacio
        
    }
    
    public Libro (int ISBN, String Titulo, int NumDePag, String autor ){
        this.ISBN = ISBN;
        this.NumDePag = NumDePag;
        this.Titulo = Titulo;
        this.autor = autor;
    }
    
    public void Carga (){
        System.out.println("Ingrese el titulo del libro");
        this.Titulo = entrada.nextLine();
        
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = entrada.nextInt();
       
        System.out.println("Ingrese la cantidad de paginas del libro");
        this.NumDePag = entrada.nextInt();
        
        System.out.println("Ingrese el autor del libro");
        this.autor = entrada.next();
        
        
    }
    
    public void Muestra (){
        System.out.println("El titulo del libro es: " + Titulo);
        System.out.println("El ISBN del libro es: " + ISBN);
        System.out.println("EL autor del libro es: " + autor );
        System.out.println("La cantidad de paginas es: " + NumDePag);
    }
    
    
    
    
}
