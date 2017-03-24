package job;

import java.util.List;

import entities.Arbitre;
import entities.Nation;

public interface GestionArbitre {

	/**
	 * Permet d'ajouter un arbitre dans la Bdd
	 * 
	 * @param nom
	 *            parametre de type String
	 * @param prenom
	 *            parametre de type String
	 * @param niveau
	 *            parametre de type String
	 * @param nation
	 *            parametre de type Nation
	 * @return retoune un message de type String prévenant si l'ajout est réussi
	 *         ou si c'est un echec
	 */
	public String ajoutArbitre(String nom, String prenom, String niveau, Nation nation);

	/**
	 * Cette methode permet de recuperer la liste des arbitres inscrit dans la
	 * bdd
	 * 
	 * @return retourne une List de type Arbitre
	 */
	public List<Arbitre> getListArbitre();

}
