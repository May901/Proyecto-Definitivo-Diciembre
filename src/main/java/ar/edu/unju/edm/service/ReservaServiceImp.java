package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.ReservaModelo;
import ar.edu.unju.edm.repository.ReservaDAO;

@Service
public class ReservaServiceImp implements ReservaService{
	
	@Autowired
	ReservaDAO reservaDAO;
	
	@Override
	public void guardarReserva(ReservaModelo unaReserva) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<ReservaModelo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ReservaModelo editar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
