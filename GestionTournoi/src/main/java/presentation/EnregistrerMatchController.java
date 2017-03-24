package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EnregistrerMatchController {
	
	public EnregistrerMatchController(){
		
	}
	
	public String affichagePage(){
		
		return "/WEB-INF/results";
	}
}
