import java.util.Scanner;
public class practica14 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        short a,i;
        int s;
        System.out.print("INGRESE SU TABLA DE SUMAR: ");
        a=entrada.nextShort();
        for(i=1; i<=12; i++){
        s=a+i;
            System.out.println(a+"+"+i+"="+s);
    }
    } 
    }
   
