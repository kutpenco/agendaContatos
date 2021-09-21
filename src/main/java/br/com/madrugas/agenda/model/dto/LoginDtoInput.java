package br.com.madrugas.agenda.model.dto;

public class LoginDtoInput {

	private String email;
	private String senha;

	public LoginDtoInput(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "LoginDtoInput [email=" + email + ", senha=" + senha + "]";
	}
}
