import java.util.Scanner;
public class practica9 {

    public static void main(String[] args) {
        final short ini=1000;
        byte opc;
        float ingr,salACT,reti;
        Scanner entrada=new Scanner(System.in);
        System.out.print("BIENVENIDO A SU CAJERO AUTOMATICO \n"
                + "1.INGRESAR DINERO\n"
                + "2.RETIRO DE DINERO \n"
                + "3.SALIR\n"
                + "opcion:");
        opc=entrada.nextByte();
        switch(opc){
            case 1:
                System.out.print("INGRESO: $");
                ingr=entrada.nextFloat();
                salACT=(ingr+ini);
                System.out.println("SU DINERO ACTUAL ES: $"+salACT);
                break;
            case 2:
                System.out.print("CANTIDAD A RETIRAR: $");
                reti=entrada.nextFloat();
                if(reti<ini){
                   salACT=(ini-reti);
                    System.out.print("SU DINERO ACTUAL ES: $"+salACT);
                }
                else {
                    System.out.print("NO CUENTA CON FONDOS SUFICIENTES");
                }
            default:
                break;
        }
    
}
}