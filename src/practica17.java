import java.util.Scanner;
public class practica17 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        short a=1;
        while(a!=0){
            System.out.print("INGRESE UN NUMERO: ");
        a=entrada.nextShort();
  if(a%2==0){     
            System.out.println("SU NUMERO "+a+" ES PAR");
  }
  else{    
            System.out.println("SU NUMERO "+a+" ES IMPAR");
  }

    }
}
}