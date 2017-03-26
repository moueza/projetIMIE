package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class ConnectionController implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pseudo;
	private String password;
	
	public ConnectionController(){
		
	}
	
	public String traitementConnection() {
		
		return "ressources/home";
	}
	

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
