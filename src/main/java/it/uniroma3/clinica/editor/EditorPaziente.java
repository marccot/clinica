package it.uniroma3.clinica.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.uniroma3.clinica.facade.PazienteFacade;
import it.uniroma3.clinica.model.Paziente;
@Component
public class EditorPaziente extends PropertyEditorSupport {
	
	@Autowired
	private PazienteFacade facadePaziente;

    // Converts a String to a Country (when submitting form)
    @Override
    public void setAsText(String text) {
        Paziente p = this.facadePaziente.getPaziente(Long.valueOf(text));

        this.setValue(p);
    }

}
