package co.edu.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ufps.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, String> {

}
