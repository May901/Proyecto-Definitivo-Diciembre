package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.HabitacionModelo;
import ar.edu.unju.edm.repository.HabitacionDAO;
@Service
public class HabitacionServiceImp implements HabitacionService{
@Autowired
HabitacionDAO HabitacionDAO;

@Override
public void guardarhabitacion(HabitacionModelo UnaHabitacion) {
	HabitacionDAO.save(UnaHabitacion);
	// TODO Auto-generated method stub
}
@Override
public void delate(Integer id) {
	// TODO Auto-generated method stub
	
}
@Override
public List<HabitacionModelo> buscarHabitaciones() {
	// TODO Auto-generated method stub
	List<HabitacionModelo> listadoHabitacion=(List<HabitacionModelo>) HabitacionDAO.findAll();
	return listadoHabitacion;
}
}
