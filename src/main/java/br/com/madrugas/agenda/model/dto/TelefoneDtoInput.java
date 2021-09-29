package br.com.madrugas.agenda.model.dto;

import br.com.madrugas.agenda.model.Telefone;
import br.com.madrugas.agenda.model.TipoTelefone;

public class TelefoneDtoInput {

	private TipoTelefone tipoTelefone;
	private String ddi, telefone, ddd;

	public TelefoneDtoInput (TipoTelefone tipoTelefone, String ddi, String ddd, String telefone) {
		this.tipoTelefone = tipoTelefone;
		this.ddi = ddi;
		this.ddd = ddd;
		this.telefone = telefone;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public String getDdi() {
		return ddi;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getDdd() {
		return ddd;
	}

	public Telefone convert() {
		Telefone telefoneXPTO = new Telefone(tipoTelefone, ddi, ddd, telefone);
		return telefoneXPTO;
	}
	
}
