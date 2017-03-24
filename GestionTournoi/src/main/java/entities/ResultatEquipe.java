package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "resultatequipe")
public class ResultatEquipe {
	
	@ManyToOne
	public Integer idmatch;
	
	@ManyToOne
	public Integer idequipe;
	
	@Column(name = "score", length = 50)
	public String score;

}
