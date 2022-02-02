
package ejercicio_6;

import java.util.Scanner;
public class Cafetera {
    
    Scanner entrada = new Scanner (System.in);
    
    public int tamañotaza,capacidadActual=5,capacidadMaxima = 5;
    
    public Cafetera(){
        
    }

    
    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void llenarCafetera (){
        capacidadActual = capacidadMaxima;
    }
    
    public void servirTaza (int tamañoTaza){
        this.tamañotaza = tamañoTaza;
        
        if (tamañotaza>capacidadActual){
            
            System.out.println("LLenando taza...");
            System.out.println("La taza NO se lleno completamente falto " + (tamañotaza-capacidadActual) + " litros");
            capacidadActual = 0;
        }else{
            capacidadActual = tamañotaza - capacidadActual;
            System.out.println("LLenando taza...");
            System.out.println("Taza llena");
        }
    }
    
    public void vaciarCafetera (){
        capacidadActual = 0;
    }
    
    public void agregarCafetera(int litros){
        while (litros>(capacidadMaxima-capacidadActual)){
            System.out.println("se soprepaso del limete maximo de la cafetera, Reingrese");
            litros = entrada.nextInt();
        }
        capacidadActual =+ litros; 
    }


}
