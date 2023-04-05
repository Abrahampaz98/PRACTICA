import java.util.Scanner;
public class practica16 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        short a;
            System.out.print("INGRESE UN NUMERO: ");
        a=entrada.nextShort();
  if(a>=1){     
            System.out.println("SU NUMERO "+a+" ES POSITIVO");
  }
  else{    
            System.out.println("SU NUMERO "+a+" ES NEGATIVO");
  }

    }
}