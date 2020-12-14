package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.unju.edm.model.HabitacionModelo;
import ar.edu.unju.edm.service.HabitacionService;
@Controller
@RequestMapping("habitacion")
public class HabitacionController {
@Autowired
HabitacionService HabitacionService;
 		@PostMapping("/saveHabitacionModelO")
 		public String saveHabitacionModelo(HabitacionModelo habitacionmodelo, Model modelo) {
 			HabitacionService.guardarhabitacion(habitacionmodelo);
 			return ("habitacion");
 		}
}
