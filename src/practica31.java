import java.util.Arrays;
import java.util.Scanner;
public class practica31 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in); 
        float n[]=new float[5];
        float SNP=0, SNN=0,mediaP,mediaN;
        short cont=0,CNP=0,CNN=0;
for(short i=0; i<n.length; i++){
    System.out.print("DIGITE UN NUMERO: ");
    n[i]=entrada.nextFloat();        
if(n[i]==0){
    cont++;
}
else if(n[i]>0){
    SNP+=n[i];
    CNP++;
}
else{
    SNN+=n[i];
    CNN++;
}
}
if(CNP==0){
}
else{
    mediaP= SNP/CNP;
    System.out.println("SU MEDIA DE NUMEROS POSITIVOS ES: "+mediaP);
}
if(CNN==0){
}
else{
    mediaN= SNN/CNN;
    System.out.println("SU MEDIA DE NUMEROS NEGATIVOS ES: "+mediaN);
}
System.out.println("LA CANTIDAD DE CEROS ES: "+cont);
    
    }
}