package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.edm.model.UsuarioModelo;
import ar.edu.unju.edm.service.UsuarioService;
@Controller
@RequestMapping ("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService UsuarioService;
	@PostMapping("/saveUsuarioModelo")
	public String saveUsuarioModelo(UsuarioModelo usuariomodelo, Model modelo) {
		
		 UsuarioService.guardarUsuario(usuariomodelo);
		 return "reserva";

	}
}
