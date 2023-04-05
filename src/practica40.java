import java.util.Scanner;
public class practica40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        short matr[][],nf,nc;
        System.out.print("INGRESE EL NUMERO DE FILAS: ");
        nf=entrada.nextByte();
        System.out.print("INGRESE EL NUMERO DE COLUMNAS: ");
        nc=entrada.nextByte();
        matr=new short[nf][nc];    
        System.out.print("INGRESE LOS NUMERO DE SU MATRIZ");
       for(short i=0;i<nf;i++){
       for(short j=0; j<nc;j++){
           System.out.print("["+i+"]"+"["+j+"]: ");
           matr[i][j]=entrada.nextByte();
       }}
       System.out.println("SU MATRIZ ES:");
       for(byte i=0;i<nf;i++){
       for(byte j=0;j<nc;j++){
           System.out.print(matr[i][j]);}
       System.out.println("");}
    }
}
