import java.util.Scanner;
public class practica33 {
    public static void main(String[] args) {  
        Scanner entrada=new Scanner(System.in);
        short A[]=new short[10];
        boolean cre=false, decr=false;
        System.out.println("CRECIENTE, DECRECEINTE, DESORDENADOS E IGUALES");
        for(short i=0; i<A.length; i++){
            System.out.print("DIGITE UN NUMERO: ");
            A[i]=entrada.nextShort();
        }
        for(short i=0; i<9; i++){
            if(A[i]<A[i+1]){
                cre=true;
            }
            if(A[i]>A[i+1]){
                decr=true;
            }
        }
        if(cre==true && decr==false){
            System.out.println("CRECIENTE");
        }
        else if(decr==true && cre==false){
            System.out.println("DECRECIENTE");
        }
        else if(cre==true && decr==true){
            System.out.println("DESORDENADO");
        }
        else if(cre==false && decr==false){
            System.out.println("IGUALES");
        }
    }
}
