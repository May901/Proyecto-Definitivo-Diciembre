package ar.edu.unju.edm.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ar.edu.unju.edm.model.ReservaModelo;


@Repository
public interface ReservaDAO extends CrudRepository<ReservaModelo,Integer>{
	public Iterable<ReservaModelo> findByClienteNombreusuario(String nombreusuario);
	public Iterable<ReservaModelo> findByFecha(LocalDate fecha);
}
