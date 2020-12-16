package ar.edu.unju.edm.service;

import ar.edu.unju.edm.model.UsuarioModelo;

public interface UsuarioService {
	public void guardarUsuario(UsuarioModelo unUsuario);
	public Iterable<UsuarioModelo> listar();
	public void delete(Integer id);
	public UsuarioModelo editar(Integer id) throws Exception;
	

}
