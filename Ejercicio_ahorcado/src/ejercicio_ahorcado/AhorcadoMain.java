
package ejercicio_ahorcado;

    import java.util.Scanner;

public class AhorcadoMain {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        Ahorcado juego = new Ahorcado();
        boolean bandera = false;
        
        juego.crearJuego();
        juego.longitud();
        
        do {
            bandera = juego.jugar();
            
        } while (bandera==false);
        System.out.println("Juego terminado");
        
        
        
    }
    
}
