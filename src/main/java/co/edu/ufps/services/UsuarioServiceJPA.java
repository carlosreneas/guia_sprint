package co.edu.ufps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.entities.Usuario;
import co.edu.ufps.repositories.UsuarioRepository;

@Service
public class UsuarioServiceJPA {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }
	
	public void addUser(Usuario user) {
		usuarioRepository.save(user);
    }
	
}
