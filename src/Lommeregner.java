import java.awt.datatransfer.SystemFlavorMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lommeregner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1=0;
        double num2=0;
        char op;
        double result;


        while (true){
            System.out.println("Velkommen til lommeregneren");
            System.out.println("  + for addition");
            System.out.println("  - for subtraktion");
            System.out.println("  * for muliplikation");
            System.out.println("  / for division");
            System.out.println("  q for quit");
            System.out.print("Indtast operator: ");
            op=input.next().charAt(0);
            if (op=='q') break;

            num1=inputDouble("Indtast tal1: ");
            num2=inputDouble("Indtast tal2: ");

            // System.out.print("Indtast tal2: ");
            // num2= input.nextDouble();

            switch (op){
                case '+':
                    result=num1+num2;
                    break;

                case '-':
                    result=num1-num2;
                    break;

                case '*':
                    result=num1*num2;
                    break;

                case '/':
                    result=num1/num2;
                    break;

                default:
                    System.out.println("Ugyldigt operator");
                    System.out.println();
                    continue;

            }
            System.out.println("Resultatet:  "+result);
            System.out.println();


        } // while
        System.out.println("Tak for i dag");

    } // Main

    static double inputDouble(String prompt){
        Scanner input=new Scanner(System.in);
        boolean OK=false;
        double num=0;
        do {

            try {
                System.out.print(prompt);
                num= input.nextDouble();
                OK=true;
            } catch (InputMismatchException e) {
                System.out.println("Ulovligt input. Prøv igen");
                input.nextLine();
            }
        } while(!OK);
        return num;

    }

}
