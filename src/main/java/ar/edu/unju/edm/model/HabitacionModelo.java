package ar.edu.unju.edm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
@Entity
@Component
public class HabitacionModelo implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Integer idhabitacion;
	@Column
	private String detallesHab;
	@Column
	private int numHab;
	@Column
	private double costo;
	@Column
	private String disponibilidad;
	@Column
	private String tipo;
	
	public HabitacionModelo() {	
}

	public HabitacionModelo(Integer idhabitacion, String detallesHab, int numHab, double costo, String disponibilidad, String tipo) {
		super();
		this.idhabitacion = idhabitacion;
		this.detallesHab = detallesHab;
		this.numHab = numHab;
		this.costo = costo;
		this.disponibilidad = disponibilidad;
		this.tipo = tipo;
	}

	public long getId() {
		return idhabitacion;
	}

	public void setId(Integer idhabitacion) {
		this.idhabitacion = idhabitacion;
	}

	public String getDetallesHab() {
		return detallesHab;
	}

	public void setDetallesHab(String detallesHab) {
		this.detallesHab = detallesHab;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}