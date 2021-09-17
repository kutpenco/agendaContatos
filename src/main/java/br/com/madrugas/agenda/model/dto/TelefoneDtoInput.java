package br.com.madrugas.agenda.model.dto;

import br.com.madrugas.agenda.model.TipoTelefone;

public class TelefoneDtoInput {

	private TipoTelefone tipoTelefone;
	private String ddi;
	private Number telefone, ddd;

	public TelefoneDtoInput (TipoTelefone tipoTelefone, String ddi, Byte ddd, Number telefone) {
		this.tipoTelefone = tipoTelefone;
		this.ddi = ddi;
		this.ddd = ddd;
		this.telefone = telefone;
	}
	
}
