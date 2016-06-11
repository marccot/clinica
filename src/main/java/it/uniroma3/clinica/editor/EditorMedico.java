package it.uniroma3.clinica.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.uniroma3.clinica.model.Medico;
import it.uniroma3.clinica.facade.MedicoFacade;

@Component
public class EditorMedico extends PropertyEditorSupport{
	@Autowired
	private MedicoFacade facadeMedico;
	 @Override
	    public void setAsText(String text) {
	        Medico m = this.facadeMedico.getMedico(Long.valueOf(text));
	        this.setValue(m);
	    }
}
