import java.util.Scanner;
public class practica39 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        short n[],dat,p=0;
        boolean search=false;
        n=new short[1000];
       for(p=0; p<10;p++){
        System.out.print("DIGUITE UN NUMERO ENTEROS: ");   
        n[p]=entrada.nextShort();}
        System.out.print("INGRESE EL NUMERO QUE DESEA BUSCAR: ");
        dat=entrada.nextShort();
// METODO DE BUSQUEDA SECUENCIAL
       short i=0;
       while(i<n[i] && search==false){
       if(n[i]==dat){
           search=true;}
       i++;
       }
//FIN DEL METODO
       if(search==true){
       System.out.println("EL NUMERO "+dat+" FUE ENCONTRO");
       }
       else{
           System.out.println("SU NUMERO "+dat+" NO FUE ENCONTRADO");   
       }
    }
}