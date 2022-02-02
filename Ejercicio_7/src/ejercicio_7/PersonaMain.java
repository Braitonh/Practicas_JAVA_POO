
import ejercicio_7.Persona;


public class PersonaMain {

  
    public static void main(String[] args) {
        
        
        Persona datosPersona = new Persona();
        
        datosPersona.crearPersona();
        System.out.println("Los datos de la persona es:");
        System.out.println(datosPersona.getNombre());
        System.out.println(datosPersona.getEdad());
        System.out.println(datosPersona.getAltura());
        System.out.println(datosPersona.getSexo());
        System.out.println(datosPersona.calcularIMC());
        System.out.println(datosPersona.esMayorDeEdad());
        
    }
    
}
