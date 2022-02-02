
package ejercicio_3;


public class OperacionMain {

   
    public static void main(String[] args) {
        
        Operacion Calculadora = new Operacion();
        
        Calculadora.crearOperacion(10, 0);
        System.out.println("La suma de los numeros es: " + Calculadora.Sumar());
        System.out.println("La resta de los numeros es: " + Calculadora.Resta());
        System.out.println("La Multiplicacion de los numeros es: " + Calculadora.Multiplicacion());
        System.out.println("La Divicion de los numeros es: " + Calculadora.Division());
    }
    
}
