package job;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.GestionJoueurDao;
import dao.GestionJoueurDaoImpl;
import entities.Joueur;

public class GestionJoueurImpl implements GestionJoueur {
	
	private static GestionJoueur INSTANCE = null;
	
	public static GestionJoueur getInstance()
	{			
		if (INSTANCE == null)
		{ 	INSTANCE = new GestionJoueurImpl();	
		}
		return INSTANCE;
	}

	/**
	 * Ajout joueur s'occupe d'ajouter un joueur � la bdd
	 */
	@Override
	public String ajoutJoueur(String nom, String prenom) {
		if (isboolVerifierNonNull(nom, prenom)) {
			if(isboolVerifierChampsNonVide(nom, prenom)){
				if(isboolVerifierChampsNonVide(nom, prenom)){
					GestionJoueurDao joueurDao = GestionJoueurDaoImpl.getInstance();
					joueurDao.ajoutJoueurBdd(nom, prenom);
			return "joueur enregistre";
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
		//le pattern repr�sente tout ce qui se trouver en dehors de a-zA-Z
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
	 * V�rifie que les champs nom et prenoms ne sont pas vides
	 * 
	 * @param nom
	 *            de type String
	 * @param prenom
	 *            de type String
	 * @return boolean true si les champs sont renseign�, false si ils sont vide
	 */
	public boolean isboolVerifierChampsNonVide(String nom, String prenom) {
		if (nom.isEmpty() && prenom.isEmpty()) {
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
	public List<Joueur> getListJoueur() {
		List<Joueur> listJoueur = new ArrayList<Joueur>();
		return listJoueur;
	}
}
