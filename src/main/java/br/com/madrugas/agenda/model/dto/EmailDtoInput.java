package br.com.madrugas.agenda.model.dto;

import br.com.madrugas.agenda.model.Email;

public class EmailDtoInput {
	
	private String email;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Email convert() {
		Email email2 = new Email(email);
		return email2;
	}
}