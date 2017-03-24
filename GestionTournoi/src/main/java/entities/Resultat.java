package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "resultat")
public class Resultat {

	@ManyToOne
	public Integer idmatch;
	
	@ManyToOne
	public Integer idjoueur;
	
	@Column(name = "score", length = 50)
	public String score;
}
