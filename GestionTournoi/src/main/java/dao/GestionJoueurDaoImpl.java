package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Joueur;

public class GestionJoueurDaoImpl implements GestionJoueurDao {

	private static GestionJoueurDao INSTANCE = null;

	public static GestionJoueurDao getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new GestionJoueurDaoImpl();
		}
		return INSTANCE;
	}	
	
	
	public void ajoutJoueurDao(Joueur joueur) {
SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

    //create transaction
    session.beginTransaction();
    session.save(joueur);

    //end the transaction
    session.getTransaction().commit();

    //Closing the session
    session.close();
	}
}