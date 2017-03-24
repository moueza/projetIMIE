package job;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.GestionArbitreDao;
import dao.GestionArbitreDaoImpl;
import dao.GestionJoueurDao;
import dao.GestionJoueurDaoImpl;
import entities.Arbitre;
import entities.Joueur;
import entities.Nation;

public class GestionArbitreImpl implements GestionArbitre {

	private static GestionArbitre INSTANCE = null;

	public static GestionArbitre getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new GestionArbitreImpl();
		}
		return INSTANCE;
	}

	public String ajoutArbitre(String nom, String prenom, String niveau, Nation nation) {
		if (isboolVerifierNonNull(nom, prenom)) {
			if (isboolVerifierChampsNonVide(nom, prenom)) {
				if (isboolVerifierPasDeCaractereSpe(nom, prenom)) {
					Arbitre arbitre = new Arbitre(nom, prenom, niveau, nation);
					GestionArbitreDao dao = GestionArbitreDaoImpl.getInstance();
					
					return "arbitre enregistre";
				}
			}
		}
		return "error in registration";
	}

	/**
	 * Cette fonction permet de v�rifier que les informations renseign�s ne sont
	 * pas null
	 * 
	 * @param nom
	 * @param prenom
	 * @return boolean
	 */
	public boolean isboolVerifierNonNull(String nom, String prenom) {
		if (nom != null && prenom != null) {
			return true;
		}
		return false;
	}

	/**
	 * Cette m�thode v�rifie qu'il n'y a que des lettres dans le nom et le
	 * pr�nom
	 * 
	 * @param nom
	 * @param prenom
	 * @return boolean Si il n'y a que des lettres, return true, sinon return
	 *         false
	 */
	public boolean isboolVerifierPasDeCaractereSpe(String nom, String prenom) {
		// le pattern repr�sente tout ce qui se trouver en dehors de a-zA-Z
		Pattern pattern = Pattern.compile("[^a-zA-Z]");
		// V�rification du nom
		Matcher matcher = pattern.matcher(nom);
		while (matcher.find()) {
			return false;
		}
		// V�rification du pr�nom
		matcher = pattern.matcher(prenom);
		while (matcher.find()) {
			return false;
		}
		return true;

	}

	/**
	 * V�rifie que les champs nom et prenomsne sont pas vides
	 * 
	 * @param nom
	 *            de type String
	 * @param prenom
	 *            de type String
	 * @return boolean true si les champs sont renseign�, false si ils sont vide
	 */
	public boolean isboolVerifierChampsNonVide(String nom, String prenom) {

		if (nom.equals("") || prenom == "") {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Permet de r�cup�rer la liste des joueurs pr�sent dans la base de donn�es
	 * 
	 * @return
	 */
	public List<Arbitre> getListArbitre() {
		List<Arbitre> listArbitre = new ArrayList<Arbitre>();

		return listArbitre;
	}
}
