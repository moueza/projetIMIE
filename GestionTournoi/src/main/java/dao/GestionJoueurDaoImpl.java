package dao;

import java.util.ArrayList;
import java.util.List;

import entities.Joueur;

public class GestionJoueurDaoImpl implements GestionJoueurDao{

	private static GestionJoueurDao INSTANCE = null;
	
	public static GestionJoueurDao getInstance()
	{			
		if (INSTANCE == null)
		{ 	INSTANCE = new GestionJoueurDaoImpl();	
		}
		return INSTANCE;
	}
	
	
	public void ajoutJoueurDao(Joueur joueur) {
	}
	
	
	public List<Joueur> getListJoueur(){
		List<Joueur> listJoueur = new ArrayList<Joueur>();
		return listJoueur;
	}
}
