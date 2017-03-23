package job;

import java.util.List;

import entities.Joueur;

public interface GestionJoueur {

	/**
	 * Permet d'ajouter un joueur dans la BDD
	 * 
	 * @param nom
	 *            de type String
	 * @param prenom
	 *            de type String
	 * @return retourne une chaine de caractère contenant sois: "joueur
	 *         enregistre", sois: "error in registration"
	 */
	public String ajoutJoueur(String nom, String prenom);
	
	/**
	 * Permet de récupérer la liste des joueurs enregistré dans la base de donnée
	 * @return retourn un argument de type List<Joueur>
	 */
	public List<Joueur> getListJoueur();
}
