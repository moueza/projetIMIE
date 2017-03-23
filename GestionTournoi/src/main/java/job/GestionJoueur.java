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
	 * @return retourne une chaine de caract�re contenant sois: "joueur
	 *         enregistre", sois: "error in registration"
	 */
	public String ajoutJoueur(String nom, String prenom);
	
	/**
	 * Permet de r�cup�rer la liste des joueurs enregistr� dans la base de donn�e
	 * @return retourn un argument de type List<Joueur>
	 */
	public List<Joueur> getListJoueur();
}
