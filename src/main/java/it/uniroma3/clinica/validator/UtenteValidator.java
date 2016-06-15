package it.uniroma3.clinica.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.clinica.model.Utente;

public class UtenteValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Utente.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paziente.nome", "nome.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paziente.cognome", "cognome.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paziente.email", "email.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paziente.codiceFiscale", "codicefiscale.required");
	}

}
