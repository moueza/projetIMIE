package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipe")
public class Equipe {

	@Id
	@Column(name = "idequipe", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idequipe;
	
	@Column(name = "nomequipe", length = 50)
	public String nomequipe;

	public Equipe(String nomequipe) {
		super();
		this.nomequipe = nomequipe;
	}

	public Integer getIdequipe() {
		return idequipe;
	}
	
	public String getNomequipe() {
		return nomequipe;
	}

	public void setNomequipe(String nomequipe) {
		this.nomequipe = nomequipe;
	}
	
}
