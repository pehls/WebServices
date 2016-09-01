package validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class RegistroValidator implements Validator {
	
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {

		String email = (String) value;
		String regex = "[a-z]{2,30}@[a-z]{2,30}.[a-z]{2,30}?.[a-z]{2,30}";  
		
		if (!email.matches(regex )) {
			FacesMessage message = new FacesMessage();
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
		//	message.setSummary("O Resgistro esta incorreto");
			message.setDetail("O Email está incorreto");
			context.addMessage("cadastroDono:Email", message);
			throw new ValidatorException(message);
		}
	}
}
