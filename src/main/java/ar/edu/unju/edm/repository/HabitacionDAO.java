package ar.edu.unju.edm.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.HabitacionModelo;

@Repository
public interface HabitacionDAO extends CrudRepository<HabitacionModelo,Integer>{
		
}
