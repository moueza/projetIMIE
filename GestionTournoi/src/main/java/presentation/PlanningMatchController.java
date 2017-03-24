package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PlanningMatchController {
	
	public PlanningMatchController(){
		
	}
	
	public String affichagePage(){
		
		return "/WEB-INF/match";
	}
}
