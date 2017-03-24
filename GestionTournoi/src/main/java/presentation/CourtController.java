package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjoutCourtController {
	
	public AjoutCourtController(){
		
	}
	
	public String affichagePage(){
		
		return "/WEB-INF/court";
	}
}
