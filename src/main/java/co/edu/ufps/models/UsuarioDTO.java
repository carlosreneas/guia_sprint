package co.edu.ufps.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDTO {
	
	private String username;
	private String name;
	private String email;
	private Date dateCreated;
	private String state;

}
