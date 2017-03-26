package presentation;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PlanningMatchController {
	
	
	private Date date;
	private String data;
	

	public PlanningMatchController(){
		
	}
	
	public String traitement(){
		
		System.out.println(date.toString());
		System.out.println(data);
		return "planning";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
