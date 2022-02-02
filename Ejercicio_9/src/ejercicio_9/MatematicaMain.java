package ejercicio_9;



public class MatematicaMain {

    public static void main(String[] args) {

        Matematica operaciones = new Matematica(20, 10);

        operaciones.devolverMayor();
        operaciones.calcularPotencia();
        operaciones.calculaRaiz();
        
        System.out.println(String.format("%.2f", operaciones.devolverRaiz()));
        
    }

}
