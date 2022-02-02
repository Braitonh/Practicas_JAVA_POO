
package EjercicioEncapsulamiento;


public class EjemploEncapsulamiento {
    
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;
    
   public EjemploEncapsulamiento(int kilos, int TipoDeRopa){
       this.kilos = kilos;
       this.TipoDeRopa = TipoDeRopa;
   }
   
   private void Llenado (){
        if(kilos <= 12){
            
            llenadoCompleto = 1;
            System.out.println("LLenando");
            System.out.println("LLenado Completo");
            
        }else{
            
            System.out.println("La carga de ropa es muy pesada,Reduse el peso");
            
        }      
   }
   
   private void Lavado (){
       
       Llenado();
       
       if (llenadoCompleto == 1){
           if (TipoDeRopa == 1){
               System.out.println("Ropa Blanca / Lavado Suave");
               System.out.println("Lavando");
               LavadoCompleto = 1;
           }else if (TipoDeRopa ==2){
               System.out.println("Ropa de color / Lavado Intenso");
               System.out.println("Lavando");
               LavadoCompleto = 1;
           }else {
               System.out.println("tipo de ropa incorrecta");
               System.out.println("Se limpiara como ropa de color / Lavado Intenso");
               LavadoCompleto = 1;
           }
       }else{
           
       }
   }
   
   private void Secado (){
       Lavado();
       if (llenadoCompleto == 1){
           System.out.println("Secando...");
           SecadoCompleto = 1;
       }
   }
   
   public void CicloFinalizado (){
       Secado();
       if (SecadoCompleto == 1){
           System.out.println("Proceso de lavado completo");
       }
   }
    
}
