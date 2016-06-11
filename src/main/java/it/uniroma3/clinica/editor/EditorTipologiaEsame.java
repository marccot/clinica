package it.uniroma3.clinica.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.uniroma3.clinica.facade.TipologiaEsameFacade;
import it.uniroma3.clinica.model.TipologiaEsame;
@Component
public class EditorTipologiaEsame extends PropertyEditorSupport{
	@Autowired
	private TipologiaEsameFacade facadeTipologiaEsame;
	
	 @Override
	    public void setAsText(String text) {
	        TipologiaEsame t = this.facadeTipologiaEsame.getTipologiaEsame(Long.valueOf(text));

	        this.setValue(t);
	    }
}
