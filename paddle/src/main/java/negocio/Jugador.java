package negocio;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jugador {
	@Id @GeneratedValue
	private Long idJugador;
	
	private String nombre;
	private String apellido;
	private String domicilio;
	private LocalDateTime nacimiento;
	@ManyToOne
	private Paleta paleta; //fk
	
	public Long getIdJugador() {
		return idJugador;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public LocalDateTime getNacimiento() {
		return nacimiento;
	}
	public Paleta getPaleta() {
		return paleta;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public void setNacimiento(LocalDateTime nacimiento) {
		this.nacimiento = nacimiento;
	}
	public void setPaleta(Paleta paleta) {
		this.paleta = paleta;
	}
	
	

}
