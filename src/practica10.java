import java.util.Scanner;
public class practica10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Scanner entrada2= new Scanner(System.in);
        String nomb;
        final int basi=400; 
        byte cant;
        float vent,total,total2,total3;
        short v,i=1;
        System.out.print("NUMERO DE VENDEDORES: ");
        v=entrada.nextShort();
        while(i<=v){
            i++;
        System.out.print("NOMBRE DEL VENDEDOR: ");
        nomb=entrada2.nextLine();
        System.out.print("NUMERO DE VENTAS: ");
        cant=entrada.nextByte();
        System.out.print("TOTAL DE DINERO EN VENTAS: ");
        vent=entrada.nextFloat();
        total=cant*100;
        total2= vent*0.2f;
        total3= total+total2+basi; 
       System.out.print("EL SUELDO DE "+nomb);System.out.println(" POR COBRAR ES: "+total3);
    }
    }
}