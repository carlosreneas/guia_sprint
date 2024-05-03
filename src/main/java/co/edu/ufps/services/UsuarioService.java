package co.edu.ufps.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.ufps.models.UsuarioDTO;

@Service
public class UsuarioService {
	
    private List<UsuarioDTO> usuarios = new ArrayList<>();
    
    public UsuarioService() {
        usuarios.add(new UsuarioDTO("Usuario1", "Usuario 1", "usuario1@example.com", new Date(), "A"));
        usuarios.add(new UsuarioDTO("Usuario2", "Usuario 2", "usuario2@example.com", new Date(), "A"));
    }
    
    public List<UsuarioDTO> getAllUsers() {
        return usuarios;
    }
    
    public UsuarioDTO getUserById(String username) {
        for (UsuarioDTO user : usuarios) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    
    public void addUser(UsuarioDTO user) {
        usuarios.add(user);
    }
    
    public void updateUser(String username, UsuarioDTO user) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsername().equals(username)) {
                usuarios.set(i, user);
                break;
            }
        }
    }
    
    public void deleteUser(String username) {
        usuarios.removeIf(user -> user.getUsername().equals(username));
    }
}

