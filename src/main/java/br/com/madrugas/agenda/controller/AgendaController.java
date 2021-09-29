package br.com.madrugas.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.madrugas.agenda.model.AgendaContato;
import br.com.madrugas.agenda.model.dto.ContatoDtoInput;
import br.com.madrugas.agenda.repository.ContatoRepository;

@RestController
@RequestMapping("agenda/")
public class AgendaController {
	
	private ContatoRepository contatoRepository;
	
	@Autowired
	public AgendaController(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}

	@PostMapping("cadastro")
	public AgendaContato cadastroContato(@RequestBody ContatoDtoInput agendaContato){
		AgendaContato contato = agendaContato.convert(); 
		//return contatoRepository.save(agendaContato.convert()); // OU FAZ DIRETO
		return contatoRepository.save(contato);
	}
	
	@GetMapping("contato")
	public ResponseEntity<?> consultarContato(@RequestParam(value = "Id" , required = true) Integer Id){
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("contato/{id}")
	public ResponseEntity<?> consultarContatoId(@PathVariable Integer id){
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("contato/nome/{nome}")
	public ResponseEntity<?> consultarContatoNome(@PathVariable Integer nome){
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("contato/telefone/{numTelefone}")
	public ResponseEntity<?> consultarContatoNumero(@PathVariable Integer numTelefone){
		return ResponseEntity.ok("OK");
	}
}
