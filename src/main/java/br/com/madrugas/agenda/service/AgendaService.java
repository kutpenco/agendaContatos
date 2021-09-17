package br.com.madrugas.agenda.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.madrugas.agenda.model.AgendaContato;
import br.com.madrugas.agenda.repository.ContatoRepository;

@Service
public class AgendaService {

	private final ContatoRepository contatoRepository;

	public AgendaService(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}
	
	public List<AgendaContato> consultarContato() {
		//consultarContato
		return contatoRepository.findAll();
	}
	
	public List<AgendaContato> consultarContatoId(Integer id) {
		//consultarContatoId
		return contatoRepository.findAllById(id);
	}
	
	public List<AgendaContato> consultarContatoNome(String name) {
		//consultarContatoNome
		return contatoRepository.findByNomeIgnoreCaseContaining(name);
	}
	
	public List<AgendaContato> consultarContatoNumero(String number) {
		//consultarContatoNumero
		return contatoRepository.findByTelefonesContaining(number);
	}
}
