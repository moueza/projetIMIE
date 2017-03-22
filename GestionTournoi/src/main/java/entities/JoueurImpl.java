package entities;

/**
 * Classe entité représentant un Joueur
 * 
 * @class 	JoueurImpl
 * @author 	alexis.poe11
 */
public class JoueurImpl implements Joueur{
	
	public String 	nom;
	public String 	prenom;
	public Sexe		sexe;
	public String 	nation;
	
	public JoueurImpl() {
		super();
	}

	public JoueurImpl(
			String nom, 
			String prenom, 
			Sexe sexe,
			String nation) {
		super();
		this.nom 	= nom;
		this.prenom = prenom;
		this.sexe 	= sexe;
		this.nation = nation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
}