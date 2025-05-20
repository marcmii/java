package GestioLavabo;

import java.util.ArrayList;
import java.util.Scanner;

public class Request {
	
	public static void request(ArrayList<String> llistaLavabo) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nom alumne: ");
		String name = in.nextLine();
		
		int countName = 0;
		
		for (int i = 0; i < llistaLavabo.size(); i++) {
			if (llistaLavabo.get(i).equals(name)) {
				countName++;
			}
		}
		
		if (countName == 3) {
			System.out.println(name + " Ja has anat masses cops!");
		} else {
			System.out.println("Pots anar al Lavabo, " + name );
			llistaLavabo.add(name);
		}
		
		
		
	}

}
