package it.uniroma3.clinica.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Paziente;

public class EsameValidator implements Validator {

	@Override
	public boolean supports(Class<?> paramClass) {
		return Esame.class.equals(paramClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tipologia", "tipologia.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "medico", "medico.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paziente", "paziente.required");
	}
}
