package it.uniroma3.clinica.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import it.uniroma3.clinica.model.Esame;
import it.uniroma3.clinica.model.Medico;

public class MedicoValidator implements Validator {

		@Override
		public boolean supports(Class<?> paramClass) {
			return Esame.class.equals(paramClass);
		}

		@Override
		public void validate(Object obj, Errors errors) {
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome", "nome.required");
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cognome", "cognome.required");
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, "specializzazione", "specializzazione.required");
		}
	}

