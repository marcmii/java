package Tasca7_EstructuresRepeticio2;

import java.util.Scanner;

public class Repeticio2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Entra una frase: ");
		String sentence = in.nextLine();
		
		for (int i = 0; i < sentence.length(); i++) {
			
			char c = sentence.charAt(i);
			char encryptedChar;
			
			if (sentence.charAt(i) == 'e') {
				encryptedChar = ' ';
			} else if (sentence.charAt(i) == ' ') {
				encryptedChar = 'e';
			} else {
					 
			}
			
			System.out.print(encryptedChar);
		}
	}

}
