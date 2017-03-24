package job;

import java.util.List;

import entities.Arbitre;
import entities.Joueur;
import entities.Nation;

public interface GestionArbitre {
	
	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param niveau
	 * @param nation
	 * @return
	 */
	public String ajoutArbitre(String nom, String prenom, String niveau, Nation nation);
	
	
	/**
	 * 
	 * @return
	 */
	public List<Arbitre> getListArbitre();

}
