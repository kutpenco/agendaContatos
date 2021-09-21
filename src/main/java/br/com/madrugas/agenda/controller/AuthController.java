package br.com.madrugas.agenda.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.madrugas.agenda.model.dto.LoginDtoInput;
import br.com.madrugas.agenda.model.dto.TokenDto;
import br.com.madrugas.agenda.service.TokenService;

@RestController
@RequestMapping("auth")
public class AuthController {

	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	TokenService tokenService;
	
	@PostMapping
	public ResponseEntity<TokenDto> autentica(@RequestBody LoginDtoInput formLogin){
		Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(formLogin.getEmail(), formLogin.getSenha()));
		String token = tokenService.geraToken(authenticate);
		return ResponseEntity.ok(new TokenDto(token, "Bearer"));
	}
}
