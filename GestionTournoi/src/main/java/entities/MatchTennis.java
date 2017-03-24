package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "match_tennis")
public class MatchTennis {

	@Id
	@Column(name = "idmatch", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idmatch;
	
	@ManyToOne
	public Integer idcourt;
	
	@ManyToOne
	public Integer idarbitre;
	
	@OneToOne
	public Integer idepreuve;
	
	@Column(name = "date", length = 50)
	public Date date;
	
	@Column(name = "duree", length = 50)
	public String duree;
	
	@Column(name = "etat", length = 50)
	public String etat;
}
