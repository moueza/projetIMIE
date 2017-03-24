package job;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.GestionCourtDao;
import dao.GestionCourtDaoImpl;
import dao.GestionJoueurDao;
import dao.GestionJoueurDaoImpl;
import entities.Court;
import entities.Joueur;
import entities.Nation;
import entities.Sexe;

public class GestionCourtImpl implements GestionCourt{
	
	private static GestionCourt INSTANCE = null;
	
	public static GestionCourt getInstance()
	{			
		if (INSTANCE == null)
		{ 	INSTANCE = new GestionCourtImpl();	
		}
		return INSTANCE;
	}

	/**
	 * Ajout joueur s'occupe d'ajouter un court à la bdd
	 */
	@Override
	public String ajoutCourt(String nom) {
		if (isboolVerifierNonNull(nom)) {
			if(isboolVerifierChampsNonVide(nom)){
				if(isboolVerifierPasDeCaractereSpe(nom)){
					Court court = new Court(nom);
					
					GestionCourtDao CourtDao = GestionCourtDaoImpl.getInstance();
					CourtDao.ajoutCourtDao(court);
					return "joueur enregistre";
				}
			}
		}
		return "error in registration";
	}

	/**
	 * Cette fonction permet de vérifier que les informations renseignés ne sont
	 * pas null
	 * 
	 * @param nom
	 * @return boolean
	 */
	public boolean isboolVerifierNonNull(String nom) {
		if (nom != null) {
			return true;
		}
		return false;
	}

	/**
	 * Cette méthode vérifie qu'il n'y a que des lettres dans le nom
	 * 
	 * @param nom
	 * @return boolean Si il n'y a que des lettres, return true, sinon return
	 *         false
	 */
	public boolean isboolVerifierPasDeCaractereSpe(String nom) {
		//le pattern représente tout ce qui se trouver en dehors de a-zA-Z
		Pattern pattern = Pattern.compile("[^a-zA-Z1-9]");
		// Vérification du nom
		Matcher matcher = pattern.matcher(nom);
		while (matcher.find()) {
			return false;
		}
		return true;

	}

	/**
	 * Vérifie que les champs nom et prenoms ne sont pas vides
	 * 
	 * @param nom
	 *            de type String
	 * @return boolean true si les champs sont renseigné, false si ils sont vide
	 */
	public boolean isboolVerifierChampsNonVide(String nom) {
		
		if (nom.equals("")) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Permet de récupérer la liste des courts présent dans la base de données
	 * 
	 * @return
	 */
	public List<Court> getListCourt() {
		List<Court> listCourt = new ArrayList<Court>();
		GestionCourtDao courtDao = GestionCourtDaoImpl.getInstance();
		
		return listCourt;
	}
}
