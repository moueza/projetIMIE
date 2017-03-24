package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjoutArbitreController {
	
	private String nom;
	private String prenom;
	private String niveau;
	private String nation;
	
	public AjoutArbitreController(){
		
	}
	
	public String affichagePage(){
		
		return "/WEB-INF/arbitre";
	}
	
	public String traitementArbitre(){
		
		return "arbitre";
	}
	
	public String arbitre(){
		
		return "arbitre";
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
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
	
	
}
