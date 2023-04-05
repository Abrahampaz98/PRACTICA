import java.util.Scanner;
import java.util.Arrays;
public class practica30 {
    public static void main(String[] args) {
        short n[] = new short[5];
        Scanner entrada = new Scanner(System.in);
        for (short i = 0; i < n.length; i++) {
            System.out.print("Introduce un número: ");
            n[i]=entrada.nextShort();            
        }
        System.out.println("Imprimiendo orden inverso.");
        for (short i = (short) (n.length - 1); i >= 0 ; i--) {
            System.out.println("Indice  "+ n[i]);
        }
    }
}