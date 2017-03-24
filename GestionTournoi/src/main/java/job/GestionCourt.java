package job;

import java.util.List;

import entities.Court;

public interface GestionCourt {

	public String ajoutCourt(String nom);
	
	public List<Court> getListCourt();
}
