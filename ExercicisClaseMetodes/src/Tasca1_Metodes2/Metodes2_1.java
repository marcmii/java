package Tasca1_Metodes2;

import java.util.*;

public class Metodes2_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escriu una paraula: ");
        String word = in.nextLine();
        
        String paraulaBarrejada = barrejarParaula(word);
        System.out.println("Paraula barrejada: " + paraulaBarrejada);
        
        System.out.println("Escriu una frase: ");
        String sentence = in.nextLine();
        
        String fraseBarrejada = barrejarFrase(sentence);
        System.out.println("Frase berrejada: "+ fraseBarrejada);
        
        in.close();
    }

    // method mix word
    public static String barrejarParaula(String paraula) {
        char letters[] = paraula.toCharArray();
        char c[] = new char[paraula.length()];
        boolean[] usedPositions = new boolean[paraula.length()]; 
        
        Random rand = new Random();

        for (int i = 0; i < letters.length; i++) {
            int position;
            do {
                position = rand.nextInt(paraula.length());
            } while (usedPositions[position]); 
            
            c[position] = letters[i]; 
            usedPositions[position] = true; 
        }
        
        return new String(c); 
    }
    
    // method mix sentence
    
    public static String barrejarFrase(String frase) {
    	
    	String Paraules[]= frase.split(" ");
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
}
