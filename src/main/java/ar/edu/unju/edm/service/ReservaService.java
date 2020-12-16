package ar.edu.unju.edm.service;

import ar.edu.unju.edm.model.ReservaModelo;

public interface ReservaService {
	public void guardarReserva(ReservaModelo unaReserva);
	public Iterable<ReservaModelo> listar();
	public void delete(Integer id);
	public ReservaModelo editar(Integer id) throws Exception;
	

}
