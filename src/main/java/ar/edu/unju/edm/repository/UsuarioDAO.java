package ar.edu.unju.edm.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.UsuarioModelo;

@Repository
public interface UsuarioDAO extends  CrudRepository<UsuarioModelo,Integer>{
	public Optional<UsuarioModelo> findByNombreusuario(String nombreUsuario);

}
