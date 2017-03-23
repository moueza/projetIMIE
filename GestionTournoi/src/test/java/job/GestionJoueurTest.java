package job;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entities.Nation;
import entities.Sexe;


public class GestionJoueurTest {
	
	private GestionJoueur joueur = GestionJoueurImpl.getInstance();

	@Test
	public void testAjoutJoueurNormal() {
		String nom = "Nadal";
		String prenom = "Rafael";
		Nation nat = new Nation("Suisse");
		
		String resultat = joueur.ajoutJoueur(nom, prenom, nat, Sexe.HOMME);
		assertEquals("joueur enregistre", resultat);
	}
	
	
	@Test
	public void testAjoutJoueurNomNull() {		
		String nom = null;
		String prenom = "Roger";
		Nation nat = new Nation("Suisse");
		
		String resultat = joueur.ajoutJoueur(nom, prenom, nat, Sexe.HOMME);
		assertEquals("error in registration", resultat);
	}
	
	@Test
	public void testAjoutJoueurPrenomNull() {		
		String nom = "Roger";
		String prenom = null;
		Nation nat = new Nation("Suisse");
		
		String resultat = joueur.ajoutJoueur(nom, prenom, nat, Sexe.HOMME);
		assertEquals("error in registration", resultat);
	}
	
	@Test
	public void testAjoutJoueurNomVide() {		
		String nom = "";
		String prenom = "roger";
		Nation nat = new Nation("Suisse");
		
		String resultat = joueur.ajoutJoueur(nom, prenom, nat, Sexe.HOMME);
		assertEquals("error in registration", resultat);
	}
	
	@Test
	public void testAjoutJoueurPrenomVide() {		
		String nom = "Federer";
		String prenom = "";
		Nation nat = new Nation("Suisse");
		
		String resultat = joueur.ajoutJoueur(nom, prenom, nat, Sexe.HOMME);
		assertEquals("error in registration", resultat);
	}
	
	@Test
	public void testAjoutJoueurCaractereSpeciauxNom() {		
		String nom = "bo#by";
		String prenom = "bob";
		Nation nat = new Nation("Suisse");
		
		String resultat = joueur.ajoutJoueur(nom, prenom, nat, Sexe.HOMME);
		assertEquals("error in registration", resultat);
	}
	
	@Test
	public void testAjoutJoueurCaractereSpeciauxPrenom() {		
		String nom = "boby";
		String prenom = "bob2";
		Nation nat = new Nation("Suisse");
		
		String resultat = joueur.ajoutJoueur(nom, prenom, nat, Sexe.HOMME);
		assertEquals("error in registration", resultat);
	}
}
