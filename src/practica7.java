import java.util.Scanner;
 public class practica7 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            byte a;
            System.out.print("INGRESE UN NUMERO: ");
            a= entrada.nextByte();
            switch(a){
                case 1: 
               System.out.print("SU NUMERO ES 1");
               break;
               case 2: 
               System.out.print("SU NUMERO ES 2");
               break;
               case 3: 
               System.out.print("SU NUMERO ES 3");
               break;
               case 4:
                   System.out.print("SU NUMERO ES 4");
               break;
               default: 
               System.out.print("ES DIFERENTE DE 4");
               break;
               
               
            }
    }
    
}
