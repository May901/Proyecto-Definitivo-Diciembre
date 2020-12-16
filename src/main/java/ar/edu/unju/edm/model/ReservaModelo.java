package ar.edu.unju.edm.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class ReservaModelo implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
		private long idreserva;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
		private UsuarioModelo cliente;
	@Column
		private String desayunos;
	@Column
		@DateTimeFormat(pattern="dd/MM/yyyy")
		private LocalDate fecha;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "reserva_habitacion", 
	 joinColumns = @JoinColumn(name = "reserva_id"), 
	 inverseJoinColumns = @JoinColumn(name = "habitacion_id"))
		private List<HabitacionModelo> listadohabitacion;
		public ReservaModelo () {
		}

		public long getIdreserva() {
			return idreserva;
		}

		public void setIdreserva(long idreserva) {
			this.idreserva = idreserva;
		}

		public UsuarioModelo getCliente() {
			return cliente;
		}

		public void setCliente(UsuarioModelo cliente) {
			this.cliente = cliente;
		}
		public String getDesayunos() {
			return desayunos;
		}

		public void setDesayunos(String desayunos) {
			this.desayunos = desayunos;
		}
		public LocalDate getFecha() {
			return fecha;
		}
		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}
		
}

