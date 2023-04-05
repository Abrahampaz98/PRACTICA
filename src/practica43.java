import java.util.Scanner;
import javax.swing.JOptionPane;
public class practica43 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("ELIGA LA OPCION DE AREA QUE QUIERE OBTENER:\n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4:Circulo \nOPCION:");
        int op=entrada.nextInt();
        switch(op){
            case 1:
            int lado=Integer.parseInt(JOptionPane.showInputDialog("INSERTAR LADO: "));
            System.out.print("SU AREA DEL CUADRADO ES: "+Math.pow(lado, 2));
            break;
            case 2: 
                int base=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA SU BASE: "));
                int alt=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA SU ALTURA: "));
                System.out.print("SU AREA DE EL RECTANGULO ES: "+base*alt);
                break;
            case 3:
                base=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA SU BASE: "));
                alt=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA SU ALTURA: "));
                System.out.print("EL AREA DE SU TRIANGULO ES: "+(base*alt)/2);
                break;
            case 4:
                float rad=Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL RADIO: "));
                System.out.printf("%1.2",Math.PI*(Math.pow(rad,2)));
                break;
            default:
                System.out.print("LA OPCION ES INCORRECTA");
                break;
        }
    }
    
}
