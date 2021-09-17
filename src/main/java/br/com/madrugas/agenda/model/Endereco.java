package br.com.madrugas.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String logadouro, bairro, complemento, cidade, estado, pais;
	private Integer numero;
	private TipoEndereco tipoEndereco;
	private TipoLogradouro tipoLogradouro;
	@ManyToOne
	private AgendaContato agendaContato;
	
	public Endereco(TipoEndereco tipoEndereco, TipoLogradouro tipoLogradouro, String logadouro, Integer numero,
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
	
	public Endereco (){}
	
	public String getLogadouro() {
		return logadouro;
	}
	public String getBairro() {
		return bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public Integer getNumero() {
		return numero;
	}
	public String getPais() {
		return pais;
	}
	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	
	
}
