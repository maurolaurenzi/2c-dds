package negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Participacion {
	@Id @GeneratedValue
	private Long idParticipacion;
	@ManyToOne
	private Jugador jugador; //fk
	@ManyToOne
	private Partido partido; //fk
	@ManyToOne
	private Paleta paleta; //fk
	
	public Long getIdParticipacion() {
		return idParticipacion;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public Partido getPartido() {
		return partido;
	}
	public Paleta getPaleta() {
		return paleta;
	}
	
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public void setPaleta(Paleta paleta) {
		this.paleta = paleta;
	}
	

}
