import java.util.Scanner;
public class practica6 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        byte a,b=5;
        System.out.println("DIGITE EL NUMERO 5:");
        a=entrada.nextByte();
        if(a==b){              // !=es de diferente, ==es de igualdad, >=mayor igual, <=menor igual
        System.out.print("SU NUMERO SI ES 5");
        }
        else {
            System.out.println("SU NUMERO ES DIFERENTE DE 5");
        }
    }
    
}
