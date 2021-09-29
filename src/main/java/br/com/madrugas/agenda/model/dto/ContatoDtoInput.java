package br.com.madrugas.agenda.model.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.madrugas.agenda.model.AgendaContato;
import br.com.madrugas.agenda.model.Email;
import br.com.madrugas.agenda.model.Endereco;
import br.com.madrugas.agenda.model.Telefone;

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

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public List<EnderecoDtoInput> getEnderecos() {
		return enderecos;
	}

	public List<TelefoneDtoInput> getTelefones() {
		return telefones;
	}

	public List<EmailDtoInput> getEmails() {
		return emails;
	}

	public AgendaContato convert() {
		//map do stream é um "DE PARA"
		List<Endereco> enderecos = this.enderecos.stream().map(e->e.convert()).collect(Collectors.toList());
		//List<String> ddds = this.telefones.stream().map(t->t.getDdd()).collect(Collectors.toList());
		List<Telefone> telefones = this.telefones.stream().map(t->t.convert()).collect(Collectors.toList());
		List<Email> emails = this.emails.stream().map(m->m.convert()).collect(Collectors.toList());
		AgendaContato agendaContato = new AgendaContato(nome, sobrenome, apelido, dtNascimento, enderecos, telefones, emails);
		return agendaContato;
	}
}
