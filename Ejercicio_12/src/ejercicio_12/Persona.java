
package ejercicio_12;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    
    Scanner read = new Scanner (System.in);
    
    public String nombre;
    Date fechaDeNacimiento = new Date();
    int resta;
    
    //metodos constructor
    
    public Persona (){
        
    }
    
    public Persona (String nombre){
        this.nombre = nombre;
    }

    //metodos Get y Set
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void crearPersona(){
        
        Date fecha = new Date();
        
        System.out.println("Ingrese Nombre:");
        this.nombre = read.next();
        
        System.out.println("Ingrese año de nacimiento:");
        int anio = read.nextInt();
        
        System.out.println("Ingrese mes de nacimiento");
        int mes = read.nextInt();
        
        System.out.println("Ingrese dia de nacimiento");
        int dia = read.nextInt();
        
        fecha.setYear(anio);
        fecha.setMonth(mes);
        fecha.setDate(dia);
        
        this.fechaDeNacimiento = fecha;
       
    }
    
    public void calcularEdad(){
        
        Date fechaActual = new Date();
        
        resta = ((fechaActual.getYear()+1900) - fechaDeNacimiento.getYear());   //me da la resta entre la fecha actual y la fecha de nacimiento
        
        if ((fechaActual.getMonth()+1)<=fechaDeNacimiento.getMonth()){
            if (fechaActual.getDate()<fechaDeNacimiento.getDay()){
                resta--;
            }
        }
        
        System.out.println("La edad de la persona es: " + resta);
        
    }
    
    public boolean menorQue(int edad ){
        
        if (edad>resta){ //Comparo la edad ingresada con la edad calculada en el metodo anterior
            return (true);
        }else{
            return(false);
        }
        
    }
    
    public void mostrarPersona(){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento.getYear() +"/"+ fechaDeNacimiento.getMonth() +"/"+ fechaDeNacimiento.getDate());
        System.out.println("Edad " + resta + " años");
        
    }
    
    
    
}
