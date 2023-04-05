import java.util.Arrays;
import java.util.Scanner;
public class practica29 {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    float n[]=new float[5];
    short i;
    System.out.println("Guardar datos en los arreglos: ");
    for(i=0;i<5;i++){
        System.out.print("DIGITE UN NUMERO: ");
        n[i]=entrada.nextFloat();
    }
    System.out.println("PRESENTACION DE LOS ELEMENTOS DEL ARREGLO");
    for(float pre:n){
        System.out.println(pre);
    }
    }
}
