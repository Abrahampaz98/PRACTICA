import java.util.Scanner;
public class practica37 {
    public static void main(String[] args) {
            Scanner entrada= new Scanner(System.in);
     byte arr[],elem,aux,pos;
     System.out.print("INGRESAR UN NUMERO DE ARREGLOS: ");
     elem=entrada.nextByte();
     arr=new byte[elem];
     for(byte i=0;i<elem;i++){
         System.out.print("INGRESE UN NUMERO: ");
         arr[i]=entrada.nextByte();
     }
     //METODO DE ORDANMINETO POR INSERCION
     for(byte i=0;i<elem;i++){
         pos=i;
         aux=arr[i];
         while((pos>0)&&(arr[pos-1]>aux)){
             arr[pos]=arr[pos-1];
             pos--;
         }
         arr[pos]=aux;
     }
     //FIN DE METODO POR INSERCION
    System.out.println("ORDEN DE FORMA ASCENDENTE");
     for(byte i=0;i<elem;i++){
         System.out.println(arr[i]);
     }
     System.out.println("ORDEN DE FORMA DESCENDENTE");
     for(byte i=(byte) (elem-1);i>=0;i--){
         System.out.println(arr[i]);
    }
}
}