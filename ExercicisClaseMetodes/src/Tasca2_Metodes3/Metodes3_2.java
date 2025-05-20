package Tasca2_Metodes3;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodes3_2 {

    public static void main(String[] args) {
        ArrayList(); 
    }

    
    public static void ArrayList() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number;

        do {
            System.out.println("Entra un número entre -10 y 10. 0 para salir: ");
            number = in.nextInt();

            if (number != 0) {
                if (number <= 10 && number >= -10) {
                    list.add(number);
                } else {
                    System.out.println("Número fuera de rango. Por favor, ingrese un número entre -10 y 10.");
                }
            }
        } while (number != 0);

        System.out.println("Números ingresados: " + list);
        in.close();
    }
}
