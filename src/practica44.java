import java.util.Scanner;
public class practica44 {
    public static void main(String[] args) {
    String clave="abraham", pass = null;
    Scanner entrada =new Scanner(System.in);
    System.out.print("CLAVE: ");
    pass=entrada.nextLine();
    if(clave.equals(pass)==false){
    System.out.println("CONTRASEÑA INCORRECTA");
    }else{
    System.out.println("ACCESO PERMITIDO");
    }}
}
