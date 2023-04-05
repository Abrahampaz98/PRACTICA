import java.util.Scanner;
public class practica8 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        short nume;
        System.out.print("INGRESE SU NUMERO: ");
        nume=entrada.nextShort();
        if(nume%10==0){
            System.out.println("SU NUMERO ES MULTIPLO DE 10");
        }
        else {
            System.out.println("su numero no es multiplo de 10");
        }

    }
    
}
