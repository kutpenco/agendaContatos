package br.com.madrugas.agenda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.madrugas.agenda.model.dto.ContatoDtoInput;

@RestController
@RequestMapping("agenda/")
public class AgendaController {
	
	@PostMapping("cadastro")
	public ResponseEntity<?> cadastroContato(@RequestBody ContatoDtoInput agendaContato){
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("contato")
	public ResponseEntity<?> consultarContato(){
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
