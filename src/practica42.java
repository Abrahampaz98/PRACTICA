import java.util.Scanner;
public class practica42 {
    public static void main(String[] args) {
      Scanner entrada= new Scanner (System.in);
    String a;
    System.out.print("INGRESE UN NOMBRE: ");
    a= entrada.nextLine();
    System.out.println("EL NOMBRE INGRESADO ES: "+a);
    System.out.println("EL NOMBRE TIENE "+a.length()+" LETRAS");
    System.out.println("EL NOMBRE INICIA CON LA LETRA "+a.charAt(0));
    System.out.println("EL NOMBRE TERMINA CON LA LETRA "+a.charAt(a.length()));
    System.out.println("LAS LETRAS QUE SE EXTRAJERON SON: "+a.substring(0,4));
    }
    
}
