import java.util.Scanner;
public class practica21 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Scanner entrada_2= new Scanner(System.in);
        String nomb;
        short sum=0,contDmil=0,suel,cont;
            for(cont=0; cont<5; cont++ ){
       System.out.println("INGRESE SU NOMBRE: ");
        nomb=entrada_2.nextLine();
       System.out.println("INGRESE SU SULEDO: ");
        suel=entrada.nextShort();
        if(suel>1000){
        contDmil++;
        }
        else{}
        sum+=suel;
         }
        System.out.println("LA SUMA DE LOS "+cont+" TRABAJADORES ES: "+sum);
        System.out.println("LA CANTIDAD DE SUELDOS PASADOS DE LOS MIL SON: "+contDmil);
        }
    }