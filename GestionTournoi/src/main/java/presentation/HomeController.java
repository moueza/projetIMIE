package presentation;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HomeController {

	private String title;
	private String description;
	private String entete;
	private List<String> lesJoueurs;
	private List<String> list;

	public HomeController() {

	}

	public String affichagePageAjoutJoueur() {

		title = "Enregistrement d'un nouveau joueur";
		description = "Enregistrer un nouveau joueur en indiquant son nom, son prénom," + "son sexe et sa nationalité.";
		entete = "Liste des joueurs";
		list = new ArrayList<String>();
		list.add("novak djokovic");
		return "player";
	}

	public String affichagePageEnregistrerArbitre() {

		title = "Enregistrement des arbitres";
		description = "Enregistrer un nouvel arbitre en indiquant son nom,son "
				+ "prénom, sa nationalité et son niveau(chaise ou ligne).";
		entete = "Liste des arbitres";

		return "arbitre";
	}

	public String affichagePageEnregistrerCourt() {

		title = "Enregistrer des courts";
		description = "Enregistrer un nouveau court en indiquant son nom";
		entete = "Liste des courts";
		return "court";
	}

	public String affichagePagePlanifierMatch() {

		title = "Planifier des matchs";
		description = "Pour créer un match, sélectionne deux joueurs, un arbitre," + "un court et une date";

		lesJoueurs = new ArrayList<String>();

		lesJoueurs.add("toto");
		lesJoueurs.add("toto");

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

	public List<String> getLesJoueurs() {
		return lesJoueurs;
	}

	public void setLesJoueurs(List<String> lesJoueurs) {
		this.lesJoueurs = lesJoueurs;
	}

	public String getEntete() {
		return entete;
	}

	public void setLibelle(String entete) {
		this.entete = entete;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
