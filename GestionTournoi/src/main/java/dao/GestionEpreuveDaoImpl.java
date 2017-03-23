package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import entities.Joueur;

public class GestionEpreuveDaoImpl implements GestionEpreuveDao {

	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;

	// https://docs.jboss.org/ejb3/docs/tutorial/1.0.7/html/Hibernate_Session_In_EJB3.html
	@PersistenceContext
	private Session session;

	private static GestionEpreuveDao instance = null;

	/**
	 * Constructeur du DAO Il initialise le contexte de persistance
	 */
	public GestionEpreuveDaoImpl() {
		emf = Persistence.createEntityManagerFactory("jpa");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}

	public static GestionEpreuveDao getInstance() {
		if (instance == null) {
			instance = new GestionEpreuveDaoImpl();
		}
		return instance;
	}

	@Override
	public void ajoutEpreuve(String nomEpreuve) {
		// https://www.mkyong.com/hibernate/hibernate-query-examples-hql/
		Query query = session
				.createQuery("insert into epreuve(nomEpreuve )" + "select stock_code, stock_name from backup_stock");
		int result = query.executeUpdate();
	}

	@Override
	public List<Epreuve> getListEpreuve() {
		return em.createQuery("select e from Epreuve e order by e.nomEpreuve asc").getResultList();
	}

}
