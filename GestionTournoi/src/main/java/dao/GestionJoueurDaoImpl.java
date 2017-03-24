package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entities.Joueur;
import entities.Nation;
import entities.Sexe;

public class GestionJoueurDaoImpl implements GestionJoueurDao {

	private static GestionJoueurDao INSTANCE = null;

	public static GestionJoueurDao getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new GestionJoueurDaoImpl();
		}
		return INSTANCE;
	}

	
	
	
	
	
	
	
	
	public void ajoutJoueurDao(Joueur joueur) {
    //Hibernate API to save this objects to DB
    //Session factory is created only ONCE
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
    
    
    
    
    
    
    
    
	public void ajoutJoueurDao2(Joueur joueur) {

		Session session = null;

		try {
			
			// This step will read hibernate.cfg.xml and prepare hibernate for
			// use
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			System.out.println("lbl12");
			Transaction tx = session.beginTransaction();
			// Create new instance of Contact and set values in it by reading
			// them from form object
			System.out.println("Inserting Record");
			// Contact contact = new Contact();
			Joueur joueur2 = new Joueur("NOM", "Prenom", Sexe.HOMME, new Nation("France"));

			session.save(joueur2);
			tx.commit();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " in catch exception");
		} finally {
			// Actual contact insertion will happen at this step
			session.flush();
			session.close();

		}
		
		
		
		
		

	}

	/* TODO */
	public List<Joueur> getListJoueur() {
		List<Joueur> listJoueur = new ArrayList<Joueur>();
		return listJoueur;
	}
	
	
public void ajoutNation(Nation nation){
	  //Hibernate API to save this objects to DB
    //Session factory is created only ONCE
    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();

    //create transaction
    session.beginTransaction();
    session.save(nation);

    //end the transaction
    session.getTransaction().commit();

    //Closing the session
    session.close();
	}
}