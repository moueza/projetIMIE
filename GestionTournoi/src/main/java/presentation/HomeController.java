package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HomeController {

	public HomeController() {

	}

	public String affichagePageAjoutJoueur() {

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

	
}
