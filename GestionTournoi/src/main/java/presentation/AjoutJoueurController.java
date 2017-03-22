package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjoutJoueurController {

	
	public AjoutJoueurController(){
		
	}
	
	public String affichagePage(){
		
		return "/WEB-INF/player";
	}
}
