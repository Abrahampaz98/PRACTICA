import java.util.Scanner;
public class practica5 {

    public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);
Scanner entrada2= new Scanner(System.in);
float nota,not2,not3,fina;
String cadena;
System.out.print("INGRESE NOMBRE: ");
cadena= entrada2.nextLine();
System.out.print("INGRESE SU PRIMERA NOTA: ");
nota= entrada.nextFloat();
System.out.print("INGRESE SU SEGUNDA NOTA: ");
not2= entrada.nextFloat();
System.out.print("INGRESE SU TERCERA NOTA: ");
not3= entrada.nextFloat();
fina= (nota+not2+not3)/3;
System.out.print("LA NOTA FINAL DE "+cadena);
System.out.print(" ES: "+fina);
    }
    
}
