package br.com.madrugas.agenda.controller;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.madrugas.agenda.model.AgendaContato;
import br.com.madrugas.agenda.model.Email;
import br.com.madrugas.agenda.model.Endereco;
import br.com.madrugas.agenda.model.Telefone;
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
		
		//Endereco endereco = contatoRepository.findAll(agendaContato.getEnderecos());
		//Telefone telefone = contatoRepository.getOne(agendaContato.getTelefones());
		//Email email = contatoRepository.getOne(agendaContato.getEmails());
		//AgendaContato agenda = new AgendaContato(agendaContato.getNome(), agendaContato.getSobrenome(), agendaContato.getApelido(), agendaContato.getDtNascimento(), endereco, telefone, email);
		//return produtoService.salvar(agenda);
		return contatoRepository.save(agendaContato.convert());
		//return ResponseEntity.ok("OK");
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
