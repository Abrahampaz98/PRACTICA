import java.util.Scanner;
public class practica15 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float resu;
        short a;
        do{
        System.out.printf("INGRESE SU NUMERO: ");
        a=entrada.nextShort();
        resu= (short) Math.pow(a,2);
        System.out.println("SU CUADRADO ES: "+resu);
        }while(a>=0);
}
}
