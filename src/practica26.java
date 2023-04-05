import java.util.Arrays;
import java.util.Scanner;
public class practica26 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        short numero;
        char caracter;
        
        System.out.println("DIGITE UN NUMERO ENTERO: ");
        numero=entrada.nextShort();
        System.out.println("DIGITE UN CARACTER");
        caracter=entrada.next().charAt(0);

        short[]n=new short[numero];
        char[]c=new char[caracter];
        
         System.out.println("SU NUMERO ENTERO ES "+numero+" SU CARACTER ES "+caracter);  
    }
}
