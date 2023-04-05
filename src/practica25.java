import java.util.Scanner;
public class practica25 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        short n,i=0;
        boolean negativos=false;
        for(i=1; i<=10; i++){
            System.out.print("INGRESE UN NUMERO: ");
            n=entrada.nextShort();
        if(n<0){
            negativos=true;
        }
        }
        if(negativos==true){
            System.out.println("SI HAY POR LO MENOS UN NUNMERO NEGATIVO");
        }
        else{
            System.out.println("NO HAY NUMERO NEGATIVOS");
        }
    }
}
