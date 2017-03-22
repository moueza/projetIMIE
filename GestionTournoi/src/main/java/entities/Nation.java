package entities;

public class Nation {
	
	private Integer idNation;
	
	/**
	 * Instance de {@link String} correspondant au libelé de la Nation.
	 */
	private String 	libele;
	
	/**
	 * Constructeur à vide de Nation
	 */
	public Nation() {
		super();
	}

	/**
	 * Constructeur de Nation
	 * 
	 * @param libele libelé
	 */
	public Nation(String libele) {
		super();
		this.libele = libele;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}
}
