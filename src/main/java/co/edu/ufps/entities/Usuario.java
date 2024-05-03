package co.edu.ufps.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
	@Id
	private String username;
	
	@Column(name="nombre", length=50)
	private String name;
	private String email;
	private Date dateCreated;
	private String state;
	private Integer edad; 	
	@Column(name="telefono", length=50)
	private String tel;
	
}
