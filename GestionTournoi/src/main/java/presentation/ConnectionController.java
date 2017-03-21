package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class ConnectionController implements Serializable {

	private static final long serialVersionUID = 1L;

	public String print() {
		return "connection.xhtml";
	}
}
