import java.util.Scanner;
public class practica23 {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    Scanner entrada_2 = new Scanner (System.in);
    short i,cont6=0,cont=0,contF=0;
    float litr=0,prec=0,tota1=0,tota2=0,contL=0;
    String palabra = null;
    for(i=1; i<=5; i++){
    System.out.print("NOMBRE DE PRODUCTO: ");
    palabra=entrada_2.nextLine();
    System.out.print("CANTIDAD DE LITROS: ");
    litr= entrada.nextFloat();
    contL+=litr;
    System.out.print("PRECIO POR LITRO: ");
    prec= entrada.nextFloat();
    tota1=prec*litr;
    if(tota1>600){
       cont6++; 
    }
    tota2+=tota1;
    System.out.println("FACTURA N°: "+i);
    contF++;
    }
   System.out.println("CANTIDAD DE LITROS VENDIDOS: "+contL);
   System.out.println("TOTAL DE LAS FACTURAS INGRESADAS: "+tota2);
   System.out.println("EL NUMERO DE FACTURAS QUE PASARON LOS $600 SON: "+cont6);
    }
}