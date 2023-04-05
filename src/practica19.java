import java.util.Scanner;
public class practica19 {
    public static void main(String[] args) {
        short num,alea,cont=0;
        Scanner entrada= new Scanner(System.in);
        alea=(short)(Math.random()*100);
        //System.out.println(alea);
    System.out.println("ADIVINE EL NUMERO ALEATORIO: ");
do{
    num=entrada.nextShort();
    if(alea>num){
        System.out.println("ES UN NUMERO MAYOR");
    }
    else{
        System.out.println("ES UN NUMERO MENOR");
            }
    cont++;
}while(alea!=num); 
System.out.println("SU NUMERO FUE ADIVINADO EN EL INTENTO NUMERO "+cont);
    }
    }