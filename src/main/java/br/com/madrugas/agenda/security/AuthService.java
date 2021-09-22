package br.com.madrugas.agenda.security;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.madrugas.agenda.model.Usuario;
import br.com.madrugas.agenda.repository.UsuarioRepository;

@Service
public class AuthService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<Usuario> usuario = usuarioRepository.findByEmail(username);
		if (usuario.isPresent()) {
			return usuario.get();
		}
		throw new UsernameNotFoundException("Usuario não encontrado.");
	}

	public Usuario buscarPorId(Integer id) {
		return usuarioRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("ID de Usuario não encontrado."));
	}
	
	public Usuario buscarPorEmail(String username) {
		return usuarioRepository.findByEmail(username)
				.orElseThrow(() -> new EntityNotFoundException("Usuário #{username} não encontrado."));
	}
}
