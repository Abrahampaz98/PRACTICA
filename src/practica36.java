import java.util.Scanner;
import java.util.Arrays;
public class practica36 {
    public static void main(String[] args) {
     Scanner entrada= new Scanner(System.in);
     byte arr[],elem,aux;
     System.out.print("INGRESAR UN NUMERO DE ARREGLOS: ");
     elem=entrada.nextByte();
     arr=new byte[elem];
     for(byte i=0;i<elem;i++){
         System.out.print("INGRESE UN NUMERO: ");
         arr[i]=entrada.nextByte();
     }
     //METODO BURBUJA
     for(byte n=0; n<(elem-1);n++){
         for(byte j=0; j<(elem-1);j++){
             if(arr[j]<arr[j+1]){
                 aux=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=aux;
             }
         }
     }
     //FIN DEL METDODO BURBJA
     System.out.println("ORDEN DE FORMA DECRECIENTE");
     for(byte i=0;i<elem;i++){
         System.out.println(arr[i]);
     }
     System.out.println("ORDEN DE FORMA CRECIENTE");
     for(byte i=(byte) (elem-1);i>=0;i--){
         System.out.println(arr[i]);
    }
}
}