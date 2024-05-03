package co.edu.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
