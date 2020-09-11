package negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Constructor {
	@Id @GeneratedValue
	private Long codigoConstructor;
	
	private String nombre;
	private String domicilio;
	
	public String getNombre() {
		return nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public Long getId() {
		return codigoConstructor;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	

}
