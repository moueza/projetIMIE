package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HomeController {
	
	public HomeController(){
		
	}
	
	public String affichagePageAjoutJoueur(){
		
		return "ressources/player";
	}
}
