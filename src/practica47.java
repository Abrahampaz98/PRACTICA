import java.util.Scanner;
public class practica47 {
public static void main(String []args){
    Scanner teclado= new Scanner(System.in);
    String one,two;
    System.out.println("INGRESAR LA PRIMERA PALABRA: ");
    one=teclado.nextLine();
    System.out.println("INGRESAR LA SEGUNDA PALABRA: ");
    two=teclado.nextLine();
    comprobarAnagrama(one,two);
    if(comprobarAnagrama(one,two)==true)System.out.println("si es un anagrama");
    if(comprobarAnagrama(one,two)==false)System.out.println("no es un anagrama");
}

static boolean comprobarAnagrama(String word1, String word2) {
        String invWord="";
        for (String chars : word1.split("")) {
            invWord = chars + invWord;
        } 
        return invWord.toLowerCase().contentEquals(word2.toLowerCase());
    }
}