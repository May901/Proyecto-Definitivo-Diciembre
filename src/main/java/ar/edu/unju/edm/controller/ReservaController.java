package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.ReservaModelo;
import ar.edu.unju.edm.service.HabitacionService;
import ar.edu.unju.edm.service.ReservaService;
@Controller
@RequestMapping ("/reserva")
public class ReservaController {
	@Autowired
	ReservaService reservaService;
	@Autowired
	HabitacionService habitacionService;
		@PostMapping ("/saveReserva")
		public String saveReservaModelo(ReservaModelo reservamodelo, Model modelo) {
			
			reservaService.guardarReserva(reservamodelo);
			return "formulario";
		}
		@PostMapping ("/listado")
		public String listarReserva() {
			
			return "listadoreserva";
		}
		@GetMapping ("/formularioReserva")
		public String formReserva() {
			
			return "reserva";
		}
		@GetMapping("/formReserva")
		public ModelAndView getformreserva() {
			ModelAndView model = new ModelAndView("reserva");
			model.addObject("reserva", new ReservaModelo());
			model.addObject("listadohabitaciones", habitacionService.buscarHabitaciones());
			return model;
		}

}
