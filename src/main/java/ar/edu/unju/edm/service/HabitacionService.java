package ar.edu.unju.edm.service;

import java.util.List;

import ar.edu.unju.edm.model.HabitacionModelo;

public interface HabitacionService {
	public void guardarhabitacion(HabitacionModelo UnaHabitacion);
	public List<HabitacionModelo> buscarHabitaciones();
	public void delate (Integer id);
}