import java.util.Scanner;
public class practica45 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       String gene;
       int alt;
       float peso;
       do{
           System.out.print("INGRESE SEXO H/M: ");
           gene=entrada.nextLine();
       }while(gene.equalsIgnoreCase("H")==false && gene.equalsIgnoreCase("M")==false);
       System.out.print("INGRESE SU ALTURA EN CM:");
       alt=entrada.nextInt();
       if(gene.equalsIgnoreCase("H")){
         peso=(float)alt-110;
         System.out.print("SU PESO ESTA ENTRE LOS: "+peso+" KG");
       } else if(gene.equalsIgnoreCase("M")){
          peso=(float)alt-120;
          System.out.print("SU PESO ESTA ENTRE LOS: "+peso+" KG");
       }
    }
}
