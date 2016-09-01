package managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import controller.AnimalDAO;
import model.Animal;

@ManagedBean
@SessionScoped
public class AnimalMB {
	private Animal animal;
	private List<Animal> animais;
	private AnimalDAO animalDAO;

	public AnimalMB() {
		animal = new Animal();
		animais = new ArrayList<Animal>();
		animalDAO = new AnimalDAO();
	}

	public String adicionarAnimal() {

		try {
			animalDAO.salvarAnimal(animal);
			montaMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "index";
	}

	public void mudaFoto(ValueChangeEvent event) {

		FacesContext context = FacesContext.getCurrentInstance();

		if ("Caos" == event.getNewValue()) {
			animal.setFoto("img/dogue_alemao.jpg");
			context.release();
		} else if ("Gatos" == event.getNewValue()) {
			animal.setFoto("img/gatos.jpg");
			context.release();
		} else if ("Passaros" == event.getNewValue()) {
			animal.setFoto("img/passaros.jpg");
			context.release();
		}
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public void montaMessage() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Successful", "Salcvo o animal: " + animal));
	}
}
