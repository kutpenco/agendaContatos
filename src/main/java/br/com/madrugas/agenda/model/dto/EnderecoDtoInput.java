package br.com.madrugas.agenda.model.dto;

import br.com.madrugas.agenda.model.TipoEndereco;
import br.com.madrugas.agenda.model.TipoLogradouro;

public class EnderecoDtoInput {

	private String logadouro, bairro, complemento, cidade, estado, pais;
	private Integer numero;
	private TipoLogradouro tipoLogradouro;
	private TipoEndereco tipoEndereco;

	public EnderecoDtoInput (TipoEndereco tipoEndereco, TipoLogradouro tipoLogradouro, String logadouro, Integer numero,
			String complemento, String bairro, String cidade, String estado, String pais) {
		this.tipoEndereco = tipoEndereco;
		this.tipoLogradouro = tipoLogradouro;
		this.logadouro = logadouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	
}
