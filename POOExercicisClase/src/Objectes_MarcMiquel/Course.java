package Objectes_MarcMiquel;

public class Course {

	private String nomCurs;
	private String nomProfessor;
	
	public Course(String nomCurs, String nomProfessor) {
		this.nomCurs = nomCurs;
		this.nomProfessor = nomProfessor;
	}
	
	
	public void setNomCurs(String nomCurs) {
		this.nomCurs = nomCurs;
	}
	
	public String getNomCurs() {
		return nomCurs;
	}
	
	public void setNomProfessor(String nomProfessor) {
		this.nomProfessor = nomProfessor;
	}
	
	public String getNomProfessor() {
		return nomProfessor;
	}
	
	@Override
	public String toString() {
		return nomCurs + " impartit per " + nomProfessor;
	}
}
