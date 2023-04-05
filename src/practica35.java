import java.util.Scanner;
import java.util.Arrays;
public class practica35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte arr[],num;
        boolean crec=true;
        arr= new byte[10];
        do{
            System.out.println("DIGITACION DE UN ARREGLO,debe ser puesto en forma creciente");
            for(byte i=0;i<arr.length;i++){
            System.out.print("INGRESE UNN NUMERO:");
            arr[i]=entrada.nextByte();
            }
            for(byte i=0;i<9;i++){
            if(arr[i]<arr[i+1]){
                crec=true;
            }
            if(arr[i]>arr[i+1]){
                crec=false;
                break;
            }
            }
             if(crec==false){
                System.out.println("por favor ingresar los numeeros de forma creciente");
            }
               
        }while(crec==false);
    System.out.print("INGRESE EL NUMERO QUE DESEA BUSCAR: ");
        num=entrada.nextByte();
        byte i=0;
        while(i<10 && arr[i]<num){
        i++;
        }
        if(i==10){
            System.out.println("EL NUMERO QUE INGRESO NO FUE ENCONTRADO");
        }
        else{
        if(arr[i]==num){
            System.out.println("EL NUMERO INGRESADO FUE ENCONTRADO");
        }
        else{
            System.out.println("EL NUMERO INGRESADO NO FUE ENCONTRADO");
        }
        }
   }
}