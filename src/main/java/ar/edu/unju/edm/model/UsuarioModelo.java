package ar.edu.unju.edm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
@Component
@Entity
public class UsuarioModelo implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Integer IdUsuario;
	@Column
	private long dni;
	@Column
	private String nombre;
	@Column
	private String password;
	@Column
	private String nombreusuario;
	@Column
	private String apellido;
	@Column
	private String tipo;
	
	public UsuarioModelo() {

	}

	public UsuarioModelo(long dni, String password, String nombreusuario, String apellido, String nombre,Integer IdUsuario, String tipo) {
		super();
		this.dni = dni;
		this.nombre= nombre;
		this.password = password;
		this.nombreusuario = nombreusuario;
		this.apellido = apellido;
		this.IdUsuario= IdUsuario;
		this.tipo=tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String setNombre() {
		return nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getnombreusuario() {
		return nombreusuario;
	}

	public void setnombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}