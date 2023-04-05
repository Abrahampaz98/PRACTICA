import java.util.Scanner;
public class practica41 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        short matr[][],nf,nc,sf,sc;
        System.out.print("INGRESE EL NUMERO DE FILAS: ");
        nf=teclado.nextByte();
        System.out.print("INGRESE EL NUMERO DE COLUMNAS: ");
        nc=teclado.nextByte();
        matr=new short[nf][nc];    
        System.out.print("INGRESE LOS NUMERO DE SU MATRIZ");
       for(short i=0;i<nf;i++){
       for(short j=0; j<nc;j++){
           System.out.print("["+i+"]"+"["+j+"]: ");
           matr[i][j]=teclado.nextByte();
       }}
       System.out.println("SU MATRIZ ES:");
       for(byte i=0;i<nf;i++){
       for(byte j=0;j<nc;j++){
           System.out.print(matr[i][j]+" ");}
       System.out.println("");}
       System.out.println("LA SUMA DE SU MATRIZ ES:");
       //SUMAR FILAS
       for(byte f=0;f<nf;f++){
           sf=0;
       for(byte c=0;c<nc;c++){
           sf+=matr[f][c];
       }
     System.out.print(sf+" ");      
    } 
     System.out.println("");  
       //SUMA DE COLUMNA
       for(byte c=0;c<nc;c++){
           sc=0;
       for(byte f=0;f<nf;f++){
           sc+=matr[f][c];
       }
     System.out.print(sc+" ");      
    } 
     System.out.println(""); 
    }
}
