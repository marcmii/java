package GestioLavabo;

import java.util.ArrayList;

public class CheckList {

	
	public static void checkList(ArrayList<String> llistaLavabo) {
		System.out.println("Aquesta és la llista: ");
		System.out.println(llistaLavabo);
		
	}
	
	public static void checkLastAlumn(ArrayList<String> llistaLavabo) {
		
		System.out.println("Ultim Alumne: ");
		System.out.println(llistaLavabo.get(llistaLavabo.size() - 1));
		
	}
}
