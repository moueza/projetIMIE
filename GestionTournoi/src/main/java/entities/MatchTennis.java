package entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "match_tennis")
public class MatchTennis {

	@Id
	@Column(name = "idmatch", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idmatch;
	
	@Column(name = "date", length = 50)
	private Date date;
	
	@Column(name = "duree", length = 50)
	private String duree;
	
	@Column(name = "etat", length = 50)
	private String etat;
	
	@ManyToOne
	@JoinColumn(name="idArbitre")
	private Arbitre unArbitre;
	
	@OneToMany
	@JoinColumn(name="idMatch")
	private List<Equipe> lesEquipes;
	
	@OneToMany
	@JoinColumn(name="idMatch")
	private List<Joueur> lesJoueurs;
	
	@ManyToOne
	@JoinColumn(name="idCourt")
	private Court leCourt;
	
	public Arbitre getUnArbitre() {
		return unArbitre;
	}

	public void setUnArbitre(Arbitre unArbitre) {
		this.unArbitre = unArbitre;
	}

	public Court getLeCourt() {
		return leCourt;
	}

	public void setLeCourt(Court leCourt) {
		this.leCourt = leCourt;
	}


}
