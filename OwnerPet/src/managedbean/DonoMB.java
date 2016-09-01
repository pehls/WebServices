package managedbean;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.Dono;

@ManagedBean
@SessionScoped
public class DonoMB {
	
	private Dono dono;
	private ArrayList<Dono> donos;
	
	public DonoMB() {
		dono = new Dono();
	}
	
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	 public void saveMessage() {
	        FacesContext context = FacesContext.getCurrentInstance();
	         
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + dono) );
	    }	

}
