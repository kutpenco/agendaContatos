package br.com.madrugas.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	@ManyToOne
	private AgendaContato agendaContato;
	
	public Email(String email) {
		this.email = email;
	}
	
	public Email (){}

	public String getEmail() {
		return email;
	}
}
