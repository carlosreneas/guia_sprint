
package co.edu.ufps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ufps.models.UsuarioDTO;
import co.edu.ufps.services.UsuarioService;
import co.edu.ufps.services.UsuarioServiceJPA;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	UsuarioServiceJPA usuarioServiceJPA;
	
	@GetMapping
	public List<UsuarioDTO> listUsers() {
		return usuarioService.getAllUsers();
	}
	
	@GetMapping("/listjpa")
	public List<co.edu.ufps.entities.Usuario> listUsersJPA() {
		return usuarioServiceJPA.getAllUsers();
	}

}
