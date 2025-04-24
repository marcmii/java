package Tasca7_EstructuresRepeticio2;

import java.util.Iterator;
import java.util.Scanner;

public class Repeticio2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		boolean correctFormat = false;
		String addressIP;
		
		do {
			System.out.println("Escriu una adreça IP en format decimal: ");
			addressIP = in.nextLine();
			
			String parts[] = addressIP.split(".");
			
			if (parts.length == 4) {
				correctFormat = true;
			}
			
			for (int i = 0; i < parts.length; i++) {
				
			} 
			
		} while (correctFormat);
		
		
	}

}
