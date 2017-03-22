package entities;

public class Nation {
	
	private Integer idNation;
	
	/**
	 * Instance de {@link String} correspondant au libel� de la Nation.
	 */
	private String 	libele;
	
	/**
	 * Constructeur � vide de Nation
	 */
	public Nation() {
		super();
	}

	/**
	 * Constructeur de Nation
	 * 
	 * @param libele libel�
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
