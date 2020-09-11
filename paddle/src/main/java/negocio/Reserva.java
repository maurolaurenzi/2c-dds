package negocio;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reserva {
	@Id @GeneratedValue
	private Long idReserva;
	
	@ManyToOne
	private Cancha cancha; //fk
	
	@OneToOne
	private Partido partido;
	
	@ManyToOne
	private Jugador responsable; //fk

	public Long getIdReserva() {
		return idReserva;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public Partido getPartido() {
		return partido;
	}

	public Jugador getResponsable() {
		return responsable;
	}


	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public void setResponsable(Jugador responsable) {
		this.responsable = responsable;
	}
	
	

}
