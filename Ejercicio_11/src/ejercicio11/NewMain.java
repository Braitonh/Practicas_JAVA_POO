package ejercicio11;

import java.util.Scanner;
import java.util.Date;

public class NewMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un año");
        int anio = read.nextInt();
        System.out.println("Ingrse un mes");
        int mes = read.nextInt();
        System.out.println("Ingrese un dia");
        int dia = read.nextInt();

        Date fecha = new Date(anio, mes, dia);

        Date fechaActual = new Date();

        System.out.println("La fecha ingresada es: " + fecha.getYear() + "/" + fecha.getMonth() + "/" + fecha.getDate());
        System.out.printf("La feha ingrseada es: %d/%d/%d \n", fecha.getYear(), fecha.getMonth(), fecha.getDate());
        System.out.printf("LA fecha de hoy es: %d/%d/%d \n", fechaActual.getYear() + 1900, fechaActual.getMonth() + 1, fechaActual.getDate());
        System.out.println("La diferencia entre las fechas ingresadas es: " + ((fechaActual.getYear() + 1900) - fecha.getYear()));

    }

}
