package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organisateur")
public class Organisateur {

	@Id
	@Column(name = "idorganisateur", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idorganisateur;
	
	@Column(name = "nom", length = 50)
	public String nom;
	
	@Column(name = "pseudo", length = 50)
	public String pseudo;
	
	@Column(name = "password", length = 50)
	public String password;
}
