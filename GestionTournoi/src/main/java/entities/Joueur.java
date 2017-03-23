package entities;

/**
 * Classe entité représentant un Joueur
 * 
 * @class 	Joueur
 * @author 	alexis.poe11
 */
public class Joueur extends Opposant{
	
	/**
	 * Instance de {@link String} correspondant au nom d'un joueur.
	 */
	public String nom;
	
	/**
	 * Instance de {@link String} correspondant au prénom d'un joueur.
	 */
	public String prenom;
	
	/**
	 * Instance de {@link enum.Sexe} correspondant au genre d'un joueur.
	 */
	public Sexe	sexe;
	
	/**
	 * Instance de {@link Nation} correspondant à la nationnalité d'un joueur.
	 */
	public Nation nation;
	
	
	/**
	 * Constructeur à vide de Joueur
	 */
	public Joueur() {
		super();
	}

	/**
	 * Constructeur de Joueur
	 * 
	 * @param nom 		nom
	 * @param prenom 	prénom
	 * @param sexe 		genre (HOMME / FEMME)
	 * @param nation 	nationnalité
	 */
	public Joueur(
			String nom, 
			String prenom, 
			Sexe sexe,
			Nation nation) {
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

	/**
	 * @return Retourne le genre du joueur (HOMME / FEMME)
	 */
	public Sexe getSexe() {
		return sexe;
	}

	/**
	 * @param sexe Redéfinit le genre du joueur (HOMME / FEMME)
	 */
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	/**
	 * @return Instance de {@link Nation}:  
	 */
	public Nation getNation() {
		return nation;
	}

	/**
	 * @param nation Instance de (@link Nation)
	 */
	public void setNation(Nation nation) {
		this.nation = nation;
	}
	
}