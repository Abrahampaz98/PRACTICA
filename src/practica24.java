import java.util.Scanner;
public class practica24 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        short suel=0,n=0,i,max=0;
        System.out.print("INGRESE UN NUMERO: ");
        n=entrada.nextShort();
        for(i=1; i<=n; i++){
            System.out.print("INGRESE SUELDO: $");
            suel=entrada.nextShort();
            if(suel>max){
                max=suel;
            }
            }
        System.out.println("SU SUELDO MAXIMO ES: $"+max);
    }
}
