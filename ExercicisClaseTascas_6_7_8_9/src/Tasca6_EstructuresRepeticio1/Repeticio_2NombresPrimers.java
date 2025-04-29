package Tasca6_EstructuresRepeticio1;

import java.util.Scanner;

public class Repeticio_2NombresPrimers {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduce un número límite: ");
        int limite = in.nextInt();
        
        int count = 0;

        System.out.println("Números primos hasta " + limite + ":");

        for (int i = 1; i <= limite; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
                count++;
            }
            
            
            if (esPrimo) {
                System.out.println(i);
            }
            
        }
        
        int arrayPrimo [][] = new int[count][count];
        
        for (int i = 1; i <= limite; i++) {
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(arrayPrimo[j][i]);
                }
                count++;
            }
        }
        
    }
}
