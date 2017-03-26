package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HomeController {
	
	private String title;
	private String description;
	
	public HomeController() {

	}

	public String affichagePageAjoutJoueur() {
		
		title = "Enregistrement d'un nouveau joueur";
		description = "Enregistrer un nouveau joueur en indiquant son nom, son prénom," + 
		"son sexe et sa nationalité.";
		
		return "player";
	}

	public String affichagePageEnregistrerArbitre() {

		return "arbitre";
	}

	public String affichagePageEnregistrerCourt() {

		return "court";
	}

	public String affichagePagePlanifierMatch() {

		return "planning";
	}

	public String affichagePageEnregisterResultat() {

		return "results";
	}

	public String deconnexion() {

		return "deconnection";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
