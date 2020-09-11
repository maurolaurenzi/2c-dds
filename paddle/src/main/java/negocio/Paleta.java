package negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Paleta {
	@Id @GeneratedValue
	private Long idPaleta;
	
	private String nombre;
	private double grosor;
	
	@ManyToOne
	private Color color;
	@ManyToOne
	private Constructor constructor;
	
	public Long getIdPaleta() {
		return idPaleta;
	}
	public String getNombre() {
		return nombre;
	}
	public double getGrosor() {
		return grosor;
	}
	public Color getColor() {
		return color;
	}
	public Constructor getConstructor() {
		return constructor;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setConstructor(Constructor constructor) {
		this.constructor = constructor;
	}

}
