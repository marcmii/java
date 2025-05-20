package GestioLavabo;

import java.util.ArrayList;
import java.util.Scanner;

public class counting {

	public static void countAlumn(ArrayList<String> llistaLavabo) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nom alumne: ");
		String name = in.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < llistaLavabo.size(); i++) {
			if (llistaLavabo.get(i).equals(name)) {
				count++;
			}
		}
		
		System.out.println("L'alumne " + name + " ha anat al lavabo " + count + " cops.");
		
		
		
	}
	
	public static void countTotal(ArrayList<String> llistaLavabo) {
		
		int count = 0;
		
		for (int i = 0; i < llistaLavabo.size(); i++) {
			for (int j = 0; j < llistaLavabo.size(); j++) {
				if (llistaLavabo.get(j).equals(llistaLavabo.get(i))) {
					count++;
					System.out.println(llistaLavabo.get(j) + count);
					
				}
			}
			count = 0;
		}
		
	}
	
}

