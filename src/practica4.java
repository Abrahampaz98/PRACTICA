import java.util.Scanner;
public class practica4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double numero1,numero2,numero3,numero4;
        System.out.print("1 NUMERO: ");
        numero1= entrada.nextDouble();
        double raiz=Math.round(Math.sqrt(numero1)); //double raiz= Math.sqrt(numero1);  --->es para sacar la raiz cuadrada
        System.out.println("SU RAIZ CUADRADA ES: "+raiz);
        System.out.print("DIGITE 2 NUMEROS: ");
        numero2= entrada.nextDouble();
        numero3= entrada.nextDouble();
        double resu= Math.pow(numero2, numero3); //double resu= Math.pow(numero2, numero3); --->es para exponetes
        System.out.println("SU RESULTADO ES: "+resu);
        System.out.print("INGRESE UN NUMERO DECIMAL: ");
        numero4= entrada.nextDouble();
        double redo = Math.round(numero4); //double redo = Math.round(numero4); ---> para redondear
        System.out.println("SU REDONDEO ES: "+redo);
        double numero=(int)(Math.random()*100); //double numero= Math.random(); ---> numero aleatorios
        System.out.print("SU NUMERO RANDON ES: "+numero);
    }
    
}
