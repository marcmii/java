package Tasca6_EstructuresRepeticio1;

import java.util.Iterator;
import java.util.Scanner;

public class Repeticio_1Dibuix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int rows = 0;
		int columns = 0;
		
		do {
			System.out.println("Entra el nombre de files: ");
			rows = in.nextInt();
			
			System.out.println("Entra el nombre de columnes: ");
			columns = in.nextInt();
		} while (rows > 3 || columns > 3 || rows < 30 || columns < 30);
		
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.println(" * ");
				
			}
			System.out.println();
		}
		
	}

}
