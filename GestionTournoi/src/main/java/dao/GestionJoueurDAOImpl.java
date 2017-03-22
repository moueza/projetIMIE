package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;


@Component
public class GestionJoueurDAOImpl {
	
	@PersistenceContext
	EntityManager em;
	
	public GestionJoueurDAOImpl() {
		super();
	}
	
	
}
