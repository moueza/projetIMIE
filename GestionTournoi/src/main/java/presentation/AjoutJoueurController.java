package presentation;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entities.Sexe;
@ManagedBean
@SessionScoped
public class AjoutJoueurController {

	private String nomJoueur;
	private String prenom;
	private String sexe;
	private String nation;
	
	
	public AjoutJoueurController(){
		
	}
	
	public String affichagePage(){
		
		return "player";
	}
	public String traitementJoueur(){
		System.out.println("hello world");
		return "ressources/player";
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
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
