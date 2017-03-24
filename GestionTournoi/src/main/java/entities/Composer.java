package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "composer")
public class Composer {

	@ManyToOne
	public Integer idequipe;
	
	@ManyToOne
	public Integer idjoueur;
	
}
