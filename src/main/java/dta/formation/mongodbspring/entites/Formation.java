package dta.formation.mongodbspring.entites;

import org.springframework.data.annotation.Id;


// MongoDB va mapper la classe Formation à une collection appellée fsormation
public class Formation {

	@Id
	private String id;
	private String nom;	
	private int nb_stagiaires_max;
	

	public Formation() {
	}
	
	public Formation(String nom, int nb_stagiaires_max) {
		super();
		this.nom = nom;
		this.nb_stagiaires_max = nb_stagiaires_max;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNb_stagiaires_max() {
		return nb_stagiaires_max;
	}

	public void setNb_stagiaires_max(int nb_stagiaires_max) {
		this.nb_stagiaires_max = nb_stagiaires_max;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", nom=" + nom + ", nb_stagiaires_max=" + nb_stagiaires_max + "]";
	}
	
	
}
