package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CourtController {
	
	private String court ; 
	
	public CourtController(){
		
	}
	
	public String traitementCourt(){
		
		return "court";
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}
	
	
	
}
