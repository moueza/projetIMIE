package dao;

import java.util.List;

import entities.Joueur;

public interface GestionEpreuveDao {
	/**
	 * Permet l'ajout d'une epreuve dans la bdd
	 * 
	 * @param nomEpreuve
	 *            de type String
	 */
	public void ajoutEpreuve(String nomEpreuve);

	
	/**
	 * Permet de r�cup�rer la liste des �preuves pr�sentes dans la bdd
	 * 
	 * @return List<Epreuve>
	 */
	public List<Epreuve> getListEpreuve();

}
