package br.com.madrugas.agenda.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Number telefone;
	private Byte ddd;
	private String ddi;
	private TipoTelefone tipoTelefone;
	@ManyToOne
	private AgendaContato agendaContato;
	
	// ID - 1 Residencial / 2 - Recado / 3 - Celular / 4 - Comercial
	
	public Telefone(TipoTelefone tipoTelefone, String ddi, Byte ddd, Number telefone) {
		this.tipoTelefone = tipoTelefone;
		this.ddi = ddi;
		this.ddd = ddd;
		this.telefone = telefone;
	}
	
	public Telefone (){}
	
	public Number getTelefone() {
		return telefone;
	}
	public Byte getDdd() {
		return ddd;
	}
	public String getDdi() {
		return ddi;
	}
	
	
}
