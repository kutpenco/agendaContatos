package br.com.madrugas.agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.madrugas.agenda.model.AgendaContato;

@Repository
public interface ContatoRepository extends JpaRepository<AgendaContato, Integer>{

	List<AgendaContato> findAll();
	
	List<AgendaContato> findAllById(Integer id);
	
	List<AgendaContato> findByNomeIgnoreCaseContaining(String name);
	
	List<AgendaContato> findByTelefonesContaining(String number);
	
}
