package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe entit� repr�sentant un Joueur
 * 
 * @class Joueur
 * @author alexis.poe11
 */
@Entity
@Table(name = "joueur")
public class Joueur {

	@Id
	@Column(name = "idjoueur", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idjoueur;

	/**
	 * Instance de {@link String} correspondant au nom d'un joueur.
	 */
	@Column(name = "nom", length = 50)
	public String nom;

	/**
	 * Instance de {@link String} correspondant au pr�nom d'un joueur.
	 */
	@Column(name = "prenom", length = 50)
	public String prenom;

	/**
	 * Instance de {@link enum.Sexe} correspondant au genre d'un joueur.
	 */
	@Column(name = "sexe", length = 50)
	public String sexe;

	/**
	 * Instance de {@link Nation} correspondant � la nationnalit� d'un joueur.
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	public Nation nation;

	/**
	 * Constructeur � vide de Joueur
	 */
	public Joueur() {
		super();
	}

	/**
	 * Constructeur de Joueur
	 * 
	 * @param nom
	 *            nom
	 * @param prenom
	 *            pr�nom
	 * @param sexe
	 *            genre (HOMME / FEMME)
	 * @param nation
	 *            nationnalit�
	 */
	public Joueur(String nom, String prenom, String sexe, Nation nation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.nation = nation;
	}

	/**
	 * Constructeur de Joueur
	 * 
	 * @param nom
	 *            nom
	 * @param prenom
	 *            pr�nom
	 * @param sexe
	 *            genre (HOMME / FEMME)
	 * @param nation
	 *            nationnalit�
	 */
	public Joueur(String nom, String prenom, Sexe sexe, Nation nation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe.toString();
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
	public String getSexe() {
		return sexe;
	}

	/**
	 * @param sexe
	 *            Red�finit le genre du joueur (HOMME / FEMME)
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	/**
	 * @return Instance de {@link Nation}:
	 */
	public Nation getNation() {
		return nation;
	}

	/**
	 * @param nation
	 *            Instance de (@link Nation)
	 */
	public void setNation(Nation nation) {
		this.nation = nation;
	}

}