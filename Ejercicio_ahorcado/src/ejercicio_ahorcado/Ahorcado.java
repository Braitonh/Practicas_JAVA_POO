
package ejercicio_ahorcado;

import java.util.Scanner;

public class Ahorcado {
    
    Scanner read = new Scanner (System.in);
    
    public String [] vector;
    public String [] vectorOculto;
    public int cantidadDeLetrasEncontradas;
    public int jugadasMaximas;
    
    //metodos constructores
    
    public Ahorcado (){
        
    }
    
    //metodos get y set

    public String[] getPalabra() {
        return vector;
    }

    public void setPalabra(String[] palabra) {
        this.vector = palabra;
    }

    public int getCantidadDeLetrasEncontradas() {
        return cantidadDeLetrasEncontradas;
    }

    public void setCantidadDeLetrasEncontradas(int cantidadDeLetrasEncontradas) {
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    public void crearJuego(){
        
        String palabras;
        
        System.out.println("ingrese una palabra");
        palabras = read.nextLine();
        
        vector = new String [palabras.length()];
        int largo = palabras.length();
        vectorOculto = new String[largo];
        int j = 0;
        
        for (int i = 0; i < largo ; i++) {
            vector[i] = palabras.substring(0+j, i+1);
            j++;
        }
        
        for (int i = 0; i < largo; i++) {
            vectorOculto[i] = "_";
        }
        
        System.out.println("ingrese cantidad de jugadas permitida");
        jugadasMaximas = read.nextInt();
        
    }
    
    public void longitud (){
        
        System.out.println("La longitud de la palabra es: " + vector.length);
    }
    
    public void buscar(String letra){
        
        int bandera = 0;
        int posicion = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if (String.valueOf(letra).equals(vector[i])){
                
                bandera = 1;
                posicion = i;
                vectorOculto[posicion]=letra;
            } 
        }
        
        
        
        if (bandera == 1){
            System.out.println("la letra " + letra + " es parte de la palabra");
        }else{
            System.out.println("La letra " + letra + " No es partde de la palabra");
            jugadasMaximas-=1;
        }
        
        
        
        
        
        System.out.println();
        
         for (int i = 0; i < vector.length; i++) {
            System.out.print(vectorOculto[i] + " ");
        }
        
        
        System.out.println();
        
    }
    
    public void intentos(){
        System.out.println("Numero de oportunidades restantes : " + jugadasMaximas);
    }
    
    public boolean jugar (){
        System.out.println("ingrese una letra");
        buscar(read.next());
        
        intentos();
        
        int bandera = 0;
        
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i].equals(vectorOculto[i])){
                bandera++ ;
            }
        }
        
        if (bandera==vector.length || jugadasMaximas==0){
            return(true);   
        }else{
            return(false);
        }
        
        
    }
    
    
    
    
    
    
}
