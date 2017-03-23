package dao;

import java.util.List;

import entities.Joueur;

public interface GestionJoueurDao {

	/**
	 * Permet l'ajout d'un joueur dans la bdd
	 * 
	 * @param joueur
	 *            de type Joueur
	 */
	public void ajoutJoueurDao(Joueur joueur);

	/**
	 * Permet de récupérer la liste des joueurs présents dans la bdd
	 * 
	 * @return List<Joueur>
	 */
	public List<Joueur> getListJoueur();
}
