package ejercicio_8;

public class Cadena {

    private String frase;
    private int longitud;

    //metodo Constructor
    public Cadena() {

    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    //metodos get y set
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {
        int cont = 0;

        for (int i = 0; i < longitud; i++) {
            if (frase.toLowerCase().charAt(i) == 'a' || frase.toLowerCase().charAt(i) == 'e' || frase.toLowerCase().charAt(i) == 'i' || frase.toLowerCase().charAt(i) == 'o' || frase.toLowerCase().charAt(i) == 'u') {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cont);

    }
    
    public void invertirFrase(){
        String invertir = "";
        
        for (int i = 0; i < longitud; i++) {
            invertir += frase.charAt(longitud - 1 - i);
        }
        System.out.println("La frase invertida es: " + invertir);
        
    }
    
    public void vecesRepetido(String letra){
        int cont = 0;
        
        for (int i = 0; i < longitud; i++) {
            
            if (frase.toLowerCase().substring(i, i+1).equals(letra)){
                cont++;
            }
            
        }
        System.out.println("La cantidad de veces que se repite la letra: " + letra + " es: " + cont );
        
    }
    
    public void compararLongitud(String frase){
        
        if (longitud == frase.length()){
            System.out.println("La frase nueva tiene la misma longitud que la frase anterior");
        }else{
            System.out.println("La frase nueva NO tiene la misma longitud que la frase anterior");
        }
        
    }
    
    public void unirFrases(String frase){
        System.out.println("La frase unida es: " + this.frase + " " + frase);
    }
    
    public void reemplazar(char letra){
        String remplazo;
        
        remplazo = frase.replace('a', letra);
        System.out.println("La frase remplazada es: " + remplazo);
    }
    
    public boolean contiene(String letra){
        
        return (frase.contains(letra));
    }
    
    
    

}
