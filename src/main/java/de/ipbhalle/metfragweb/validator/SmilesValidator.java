package de.ipbhalle.metfragweb.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import de.ipbhalle.metfraglib.additionals.MoleculeFunctions;

public class SmilesValidator implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value)
			throws ValidatorException {
		try {
			if(value == null) return;
			String smiles = ((String)value).trim();
			if(smiles.length() == 0) return;
			// parse smiles
			MoleculeFunctions.parseSmiles(smiles);
		} catch(Exception e) {
			FacesMessage msg = new FacesMessage();
			msg.setDetail("Invalid SMILES");
			msg.setSummary("Invalid SMILES");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}
	
}
