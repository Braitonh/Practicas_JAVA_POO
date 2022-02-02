
package EjercicioYoutube;


public class suma {
    private int vUno, vDos, resultado;
    
    public suma(int valorUno , int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    
    public void operacion (){
        resultado = vUno + vDos;
    }
    
    public void imprimir (){
        operacion();
        System.out.println("el resultado de la operacion es: " + resultado);
    }
}
