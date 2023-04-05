import java.util.Scanner;
public class practica12 {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte a;
        short b,i=1, i2=100;
        System.out.print("DE QUE FORMA DESEA CONTAR?\n"
                + "1.CRECIENTE:\n"
                + "2.DECRECIENTE:\n"
                + "opcion: ");
        a=entrada.nextByte();
        switch(a){
            case 1:
                System.out.print("HASTA DONDE DESEA CONTAR?: ");
                b=entrada.nextShort();
                while(i<=b){
                    System.out.println(i++);
                }
                    break;
            case 2:
                System.out.print("DE 100 HASTA DONDE DESEA CONTAR?: ");
                b=entrada.nextShort();
                while(i2>=b){
                    System.out.println(i2--);
                }
                    break;
            default:
                System.out.print("NUMERO INCORRECTO");
                break;
        }
    }
}
