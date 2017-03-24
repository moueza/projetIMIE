package dao;

import entities.Joueur;

public interface GestionJoueurDao {

	/**
	 * Permet l'ajout d'un joueur dans la bdd
	 * 
	 * @param joueur
	 *            de type Joueur
	 */
	public void ajoutJoueurDao(Joueur joueur);

}
