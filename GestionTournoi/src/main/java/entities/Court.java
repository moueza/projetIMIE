package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "court")
public class Court {

	@Id
	@Column(name = "idcourt", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idcourt;
	
	@Column(name = "nom", length = 50)
	public String nom;

	public Court(String nom) {
		super();
		this.nom = nom;
	}

	public Integer getIdcourt() {
		return idcourt;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
