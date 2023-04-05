import java.util.Scanner;
public class practica22 {
    public static void main(String[] args) {
     Scanner entrada= new Scanner(System.in);
     short i,num=0,mult=0;
     System.out.print("INGRESE UN NUMERO DEL 1 AL 10: ");
     num= entrada.nextShort();
     if(num>0 && num<=10){
         for(i=1; i<=12; i++){
             mult=(short) (i*num);
             System.out.println(num+"*"+i+"="+mult);
         }
     }
     else{
         System.out.println("EL NUMERO INGRESADO ESTA FUERA DEL RANGO INDICADO");
     }
    }   
}
