package ejercicio_7;

import java.util.Scanner;

public class Persona {

    Scanner entrada = new Scanner(System.in);

    private int edad, peso, altura;
    private String nombre;
    private char sexo;
    

    //metodo Constructor
    public Persona() {

    }

    //Metodos Get y Set
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void crearPersona() {

        System.out.println("Ingrese el nombre de la persona");
        nombre = entrada.next();

        System.out.println("Ingrese el sexo de la persona");
        sexo = entrada.next().charAt(0);
        while (sexo != 'M' && sexo != 'H' && sexo != 'O') {
            System.out.println("Error de opcion, Reingrese");
            sexo = entrada.next().charAt(0);
        }

        System.out.println("Ingrese el peso de la persona");
        peso = entrada.nextInt();

        System.out.println("Ingrese la altura de la persona");
        altura = entrada.nextInt();
    }

    public int calcularIMC() {
        double IMC = (peso / Math.pow(altura, 2));

        if (IMC > 25) {
            System.out.println("Tiene SOBREPESO");
            return (1);
        } else {
            if (IMC < 20) {
                System.out.println("peso por debajo del peso ideal");
                return (-1);
            } else {
                System.out.println("peso ideal");
                return (0);
            }
        }

    }

    public boolean esMayorDeEdad() {

        if (edad >= 18) {
            return (true);
        } else {

            return (false);

        }

    }
}
