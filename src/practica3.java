
import java.util.Scanner;


public class practica3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       float numero1, numero2, suma, mult, divi, resto, resta;
       System.out.print("DIGITE 2 NUMEROS: ");
       numero1= entrada.nextFloat();
       numero2= entrada.nextFloat();
       suma=numero1+numero2;
       resta=numero1-numero2;
       mult=numero1*numero2;
       divi=numero1/numero2;
       resto=numero1%numero2;
       System.out.println("LA SUMA ES: "+suma);
       System.out.println("LA RESTA ES:"+resta);
       System.out.println("LA MULTIPLICACION ES: "+mult);
       System.out.println("LA DIVICION ES: "+divi);
       System.out.println("EL RESIDUO: "+resto);
    }
}
