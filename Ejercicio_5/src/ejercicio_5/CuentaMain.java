
package ejercicio_5;


public class CuentaMain {

    
    public static void main(String[] args) {
       
        Cuenta cuenta = new Cuenta();
        
        cuenta.crearCuenta();
        cuenta.consultarDatos();
        cuenta.Retirar(1100);
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        
    }
    
}
