
package ejercicio_6;


public class CafeteraMain {

   
    public static void main(String[] args) {
        
        Cafetera cafetera = new Cafetera();
        
        
        
        System.out.println("La capacidad maxima de la cafetera es: " + cafetera.getCapacidadMaxima() + " litros" );
        System.out.println("La capacidad actual de la cafetera es: " + cafetera.getCapacidadActual() + " litros");
        cafetera.servirTaza(6);
        cafetera.agregarCafetera(6);
        
               
        
    }
    
}
