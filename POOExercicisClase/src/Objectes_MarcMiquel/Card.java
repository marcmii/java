package Objectes_MarcMiquel;

public class Card {

	private int numero;
	private String pal;
	
	public Card(int num, String pal) {
		this.numero = num;
		this.pal = pal;
	}
	
	@Override
	public String toString() {
		return numero + pal;
	}
	
}
