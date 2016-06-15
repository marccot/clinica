package it.uniroma3.clinica.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.uniroma3.clinica.model.Risultato;

public class RisultatoValidator {

    public boolean supports(Class<?> clazz) {
      return Risultato.class.equals(clazz);
    }
    
    public boolean validate(Risultato risultato) {
      if(risultato.getNome().isEmpty() || risultato.getValore().isEmpty())
          return false;
      return true;

    }
}
