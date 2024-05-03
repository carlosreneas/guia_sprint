package co.edu.ufps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ufps.entities.Persona;
import co.edu.ufps.services.PersonaService;

@RestController
@RequestMapping("/persons")
public class PersonaController {
	
	@Autowired
	public PersonaService personaService;
	
	@GetMapping
	public List<Persona> getAllPersonas(){
		return personaService.getPersonasAll();
	}
	
	@GetMapping("/{documento}")
	public Persona getPersona(@PathVariable String documento){
		return personaService.getPersona(documento);
	}
	
	
}
