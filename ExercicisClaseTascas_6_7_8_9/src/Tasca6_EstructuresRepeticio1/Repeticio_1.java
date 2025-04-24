package Tasca6_EstructuresRepeticio1;

import java.util.Scanner;

public class Repeticio_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int number = 1;
        int countPos = 0;
        int countNeg = 0;
        int sum = 0;
        
        do {
            System.out.print("Entra un enter (0 per sortir): ");
            number = in.nextInt();
            
            if (number > 0) {
                countPos++;
                sum += number;
            } else if (number < 0) {
                countNeg++;
                sum += number;
            }
        } while (number!= 0);
        
        if (countPos + countNeg > 0) {
            double avg = (double) sum / (countPos + countNeg); 
            System.out.println("Nombres positius: " + countPos);
            System.out.println("Nombres negatius: " + countNeg);
            System.out.println("Suma Total: " + sum);
            System.out.println("Mitjana aritmètica: " + avg);
        } else {
            System.out.println("No s'han introduït números (només 0).");
        }
    }
}
