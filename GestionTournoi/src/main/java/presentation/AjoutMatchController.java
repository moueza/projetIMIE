package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjoutMatchController {
	
	public AjoutMatchController(){
		
	}
	
	public String affichagePage(){
		
		return "/WEB-INF/match";
	}
}
