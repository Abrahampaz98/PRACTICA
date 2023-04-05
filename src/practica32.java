import java.util.Scanner;
import java.util.Arrays;
public class practica32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        short a[],b[],c[];
        a= new short[10];
        b= new short[10];
        c= new short[20];
        System.out.println("*NUMEROS DEL 1ER ARREGLO*");
        for(short i=0; i<a.length; i++){
            System.out.println("DIGITE UN NUMERO: ");
        a[i]=entrada.nextShort();
        }
            System.out.println("*NUMEROS DEL 2DO ARREGLO*");
        for( short i=0;i<b.length;i++){
            System.out.println("DIGITE UN NUMERO: ");
            b[i]=entrada.nextShort();
        }
        short p=0;
        for(short i=0; i<10; i++){
            c[p]=a[i];
            p++;
            c[p]=b[i];
            p++;
        }
        System.out.println("*LA UNION DE LOS DOS ARREGLOS*");
        for(short i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
}
