package entities;

/**
 * Interface pour la représentation d'une entité Joueur
 * 
 * @interface 	Joueur
 * @author 		alexis.poe11
 */
public interface Joueur {
	public String 	getNom();
	public void 	setNom(String nom);
	public String 	getPrenom();
	public void 	setPrenom(String prenom);
	public Sexe 	getSexe();
	public void 	setSexe(Sexe sexe);
	public String 	getNation();
	public void 	setNation(String nation);
}
