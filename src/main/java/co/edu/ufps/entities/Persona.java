package co.edu.ufps.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Persona {
	
	@Id
	private String documento;
	private String nombre;
	private String email;

}
