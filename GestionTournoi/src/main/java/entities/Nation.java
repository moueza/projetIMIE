package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Classe entit� repr�sentant une Nation
 * 
 * @class Nation
 */
@Entity
public class Nation {
	
	@Id
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
