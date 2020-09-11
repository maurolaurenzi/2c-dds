package negocio;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Partido {
	@Id @GeneratedValue
	private Long idPartido;
	
	private LocalDateTime inicioPartido;
	private LocalDateTime finPartido;
	
	@ManyToOne
	private Cancha cancha; //fk
	
	@OneToOne
	private Reserva reserva; //fk

	public Long getIdPartido() {
		return idPartido;
	}

	public LocalDateTime getInicioPartido() {
		return inicioPartido;
	}

	public LocalDateTime getFinPartido() {
		return finPartido;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public Reserva getReserva() {
		return reserva;
	}

	

	public void setInicioPartido(LocalDateTime inicioPartido) {
		this.inicioPartido = inicioPartido;
	}

	public void setFinPartido(LocalDateTime finPartido) {
		this.finPartido = finPartido;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	

}
