import java.util.Scanner;
public class practica20 {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    short num,sum=0;
    System.out.println("INGRESE UN NUMERO: ");
    do{
        num=entrada.nextShort();
        sum+=num;
    }while(num!=0);
    System.out.println("LA SUMA DE SUS NUMERO DIGITADOS ES: "+sum);
    }
    
}