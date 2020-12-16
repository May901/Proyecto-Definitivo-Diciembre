package ar.edu.unju.edm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.UsuarioModelo;
import ar.edu.unju.edm.repository.UsuarioDAO;

@Service
public class LoginUsuarioServiceImp implements UserDetailsService {
		@Autowired
		UsuarioDAO UsuarioDAO;
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			// TODO Auto-generated method stub
			UsuarioModelo usuarioEncontrado = UsuarioDAO.findByNombreusuario(username).orElseThrow(()-> new UsernameNotFoundException("Login invalido"));
			List<GrantedAuthority> tipo = new ArrayList<>();
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(usuarioEncontrado.getTipo()); 
			tipo.add(grantedAuthority);
			UserDetails user = (UserDetails) new User(username, usuarioEncontrado.getPassword(),tipo);
			return user;
		}
}
