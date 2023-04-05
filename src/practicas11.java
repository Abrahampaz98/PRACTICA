import java.util.Scanner;
public class practicas11 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        short a,i=1;
        System.out.print("CUANTOS NUMEROS QUIERES CONTAR?: ");
        a=entrada.nextShort();
        while(i<=a){ //bucle
            System.out.println(i++);
        }
    }
    
}
