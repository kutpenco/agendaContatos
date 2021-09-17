package br.com.madrugas.agenda.model.dto;

import java.time.LocalDate;
import java.util.List;

public class ContatoDtoInput {
	
	private String nome, sobrenome, apelido;
	private LocalDate dtNascimento;
	private List<EnderecoDtoInput> enderecos;
	private List<TelefoneDtoInput> telefones;
	private List<EmailDtoInput> emails;

	public ContatoDtoInput (String nome, String sobrenome, String apelido, LocalDate dtNascimento,
			List<EnderecoDtoInput> enderecos, List<TelefoneDtoInput> telefones, List<EmailDtoInput> emails) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.dtNascimento = dtNascimento;
		this.enderecos = enderecos;
		this.telefones = telefones;
		this.emails = emails;
	}
}
