package br.com.madrugas.agenda.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AgendaContato implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome, sobrenome, apelido;
	private LocalDate dtNascimento;
	@OneToMany(mappedBy = "agendaContato")
	private List<Endereco> enderecos = new ArrayList<>();
	@OneToMany(mappedBy = "agendaContato")
	private List<Telefone> telefones = new ArrayList<>();
	@OneToMany(mappedBy = "agendaContato")
	private List<Email> emails = new ArrayList<>();
		
	public AgendaContato(String nome, String sobrenome, String apelido, LocalDate dtNascimento,
			List<Endereco> enderecos, List<Telefone> telefones, List<Email> emails) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.dtNascimento = dtNascimento;
		this.enderecos = enderecos;
		this.telefones = telefones;
		this.emails = emails;
	}
	
	public AgendaContato (){}
	
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
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public List<Email> getEmail() {
		return emails;
	}
}