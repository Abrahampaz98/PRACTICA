import java.util.Scanner;
public class preactica38 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        short cont,i,nume;
        System.out.print("INGRESE UN NUMERO: ");
        nume=entrada.nextShort();
        cont=0;
        for(i=1;i<=nume;i++)
        {
            if((nume%i)==0)
            {
                cont++;
            }
        }
        if(cont<=2)
        {
            System.out.println("EL NUMERO "+nume+" INGRESADO ES PRIMO");
        }else{
            System.out.println("EL NUMERO "+nume+" INGRESADO NO ES PRIMO");
        }
    }
}