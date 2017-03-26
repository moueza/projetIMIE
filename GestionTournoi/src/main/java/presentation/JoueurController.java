package presentation;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entities.Sexe;
@ManagedBean
@SessionScoped
public class JoueurController {

	private String nom;
	private String prenom;
	private String sexe;
	private String nation;
	
	
	public JoueurController(){
		
	}
	
	public String affichagePage(){
		
		return "player";
	}
	
	
	public String traitementJoueur(){
		
		return "ressources/player";
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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
}
