package negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cancha {
	@Id @GeneratedValue
	private Long codigoCancha;
	
	private String nombre;
	private boolean estaIluminada;
	
	@ManyToOne
	private Color color; //fk

	public Long getCodigoCancha() {
		return codigoCancha;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isEstaIluminada() {
		return estaIluminada;
	}

	public Color getColor() {
		return color;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEstaIluminada(boolean estaIluminada) {
		this.estaIluminada = estaIluminada;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
