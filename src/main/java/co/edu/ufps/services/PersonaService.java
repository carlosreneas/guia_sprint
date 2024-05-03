package co.edu.ufps.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.entities.Persona;
import co.edu.ufps.repositories.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;
	
	
	public List<Persona> getPersonasAll() {
		return personaRepository.findAll();
	}
	
	public Persona getPersona(String documento) {
		
		Optional<Persona> optPersona = personaRepository.findById(documento);
		if (optPersona.isPresent()) {
			return personaRepository.findById(documento).get();
		}else {
			return null;
		}
		
	}
	
	

}
