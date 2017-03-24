package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * Classe entité représentant un arbitre
 *
 */
@Entity
@Table(name = "arbitre")
public class Arbitre {
	
	@Id
	@Column(name = "idarbitre", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idarbitre;
	
	@ManyToOne
	public Integer idnation;
	
	/**
	 * Instance de {@link String} correspondant au nom d'un joueur.
	 */
	@Column(name = "nom", length = 50)
	public String nom;
	
	/**
	 * Instance de {@link String} correspondant au nom d'un joueur.
	 */
	@Column(name = "nom", length = 50)
	public String prenom;
	
	/**
	 * Instance de {@link String} correspondant au nom d'un joueur.
	 */
	@Column(name = "niveau", length = 50)
	public String niveau;

	public Arbitre(String nom, String prenom, String niveau) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
	}

	public Integer getIdarbitre() {
		return idarbitre;
	}
	
	public Integer getIdnation() {
		return idnation;
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

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	

}
