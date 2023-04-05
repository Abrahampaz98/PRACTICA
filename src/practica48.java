public class practica48 {
    public static void main(String[] args) {
           long firstNum = 0, secondNum = 1, tempNumber;
       System.out.println(secondNum);
        for (int i =0; i<=50; i++) {
            tempNumber = firstNum + secondNum;
            System.out.println(tempNumber);
            firstNum = secondNum;
            secondNum = tempNumber;
        }
    }
       
    }


