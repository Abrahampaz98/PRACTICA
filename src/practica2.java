import java.util.Scanner; //libreria para la entrada y salida de datos

public class practica2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); // es para la entrada y salida de datos
        Scanner entrada_2 = new Scanner (System.in);
        byte numero;
        float numero2;
        String cadena,cadena_2; //para cadena
        char letra; //para caracter
        System.out.print("INGRESE UN  NUMERO ENTERO: ");
        numero = entrada.nextByte();//se iguala la variable a entrada y el next"segun su tipo de dato"
        System.out.println("SU NUMERO ES: "+numero);
        System.out.print("INGRESE UN NUMERO DECIMAL:");
        numero2= entrada.nextFloat();
        System.out.println("SU NUMERO DECIMAL ES: "+numero2);
        System.out.print("INGRESE UNA PALABRA: ");
        cadena =entrada_2.nextLine();//para guardar cadenas con espacio
       System.out.println("SU PALABRA ES:"+cadena); 
       System.out.print("INGRESE OTRA CADENA: ");
       cadena_2=entrada_2.next();//Para guardar cadena sin espacios
       System.out.println("SU SEGUNDA CADENA ES:"+cadena_2);
       System.out.print("INGRESE SU CARACTER: ");
       letra= entrada_2.next().charAt(0);//solo para copiar un caracter asi haya ingresado una cadena
       System.out.print("SU CARACTER ES: "+letra);
    }
}