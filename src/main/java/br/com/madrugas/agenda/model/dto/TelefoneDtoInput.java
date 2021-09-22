package br.com.madrugas.agenda.model.dto;

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
	
}
