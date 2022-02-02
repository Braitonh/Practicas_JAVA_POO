
package ejercicio_4;


public class Rectangulo {
    
    private int base, altura;
    
    //metodos constructor
    
    public Rectangulo (){
        
    }
    
    public Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }
    
    //metodos set y get

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    //metodos 
    
    public void crearRectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void superficie (){
        int superficie = base * altura;
        System.out.println("La superficie es: " + superficie);
    }
    
    public void perimetro (){
        int perimetro = (base + altura)*2;
        System.out.println("El perimetro es: " + perimetro);
    }
    
    public void dibujarRectangulo (){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1 || j==0 ||j==base-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
