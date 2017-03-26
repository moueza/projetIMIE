package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "epreuve")
public class Epreuve {

	@Id
	@Column(name = "idepreuve", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idEpreuve;
	
	@Column(name = "nomepreuve", length = 50)
	public String nomEpreuve;
	
	@OneToMany
	@JoinColumn(name="idEpreuve")
	private List<MatchTennis> lesMatchs;
	public Epreuve(String nomEpreuve) {
		super();
		this.nomEpreuve = nomEpreuve;
	}

	public Integer getIdepreuve() {
		return idEpreuve;
	}

	public String getNomepreuve() {
		return nomEpreuve;
	}

	public void setNomepreuve(String nomepreuve) {
		this.nomEpreuve = nomepreuve;
	}
	
	
}
