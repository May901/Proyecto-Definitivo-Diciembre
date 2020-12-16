package ar.edu.unju.edm.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.UsuarioModelo;
import ar.edu.unju.edm.repository.UsuarioDAO;
@Service
public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	UsuarioDAO UsuarioDAO;
	
	@Override
	public void guardarUsuario(UsuarioModelo unUsuario) {
		// TODO Auto-generated method stub
		String pw= unUsuario.getPassword();
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		unUsuario.setPassword(bCryptPasswordEncoder.encode(pw));
		UsuarioDAO.save(unUsuario);
	}

	@Override
	public Iterable<UsuarioModelo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsuarioModelo editar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
