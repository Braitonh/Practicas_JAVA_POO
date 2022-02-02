
package ejercicio_5;

import java.util.Scanner;

public class Cuenta {
    
    Scanner entrada = new Scanner(System.in);
    
    private int numeroCuenta,Dni;
    private double Saldo;
    
    //metodo constructor
    
    public Cuenta (){ //Constructor Vacio
        
    }
    
    public Cuenta (int numeroCuenta, int Dni, int Saldo){
        this.numeroCuenta = numeroCuenta;
        this.Dni = Dni;
        this.Saldo = Saldo;
    }
    
    //Metodo set y get

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    
    //metodos 
    
    public void crearCuenta (){
        System.out.println("Ingrese el numero de cuenta:");
        numeroCuenta = entrada.nextInt();
        
        System.out.println("Ingrese el numero de DNI:");
        Dni = entrada.nextInt();
        
        System.out.println("Ingrese el Saldo");
        Saldo = entrada.nextDouble();
        
    }
    
    public void Ingresar (double ingreso){
        Saldo =+ ingreso;
    }
    
    public void Retirar (double retiro){
        if (retiro>Saldo){
            Saldo = 0;
        }else{
            Saldo = Saldo - retiro;
        }
        System.out.println("Extraccion de: -" + retiro);
        
    }
    
    public void extraccionRapida (){
        Retirar(Saldo*0.2);
    }
    
    public void consultarSaldo (){
        System.out.println("El saldo disponible es: " + Saldo);
    }
    
    public void consultarDatos(){
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Numero de Dni: " + Dni);
        System.out.println("EL saldo es: " + Saldo);
    }
    
}
