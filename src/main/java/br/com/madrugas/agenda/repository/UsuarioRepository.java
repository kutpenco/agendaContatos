package br.com.madrugas.agenda.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.madrugas.agenda.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Optional<Usuario> findByEmail(String email);
}
