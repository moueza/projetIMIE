package dao;

import entities.Organisateur;

public class GetInfoOrganisateurDaoImpl implements GetInfoOrganisateurDao {

	private static GetInfoOrganisateurDao INSTANCE = null;

	public static GetInfoOrganisateurDao getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new GetInfoOrganisateurDaoImpl();
		}
		return INSTANCE;
	}

	public Organisateur getInfoOrganisateur() {

		Organisateur organisateur = new Organisateur();

		return organisateur;
	}
}
