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
	private String ddd, ddi, telefone;
	private TipoTelefone tipoTelefone;
	@ManyToOne
	private AgendaContato agendaContato;
	
	// ID - 1 Residencial / 2 - Recado / 3 - Celular / 4 - Comercial
	
	public Telefone(TipoTelefone tipoTelefone, String ddi, String ddd, String telefone) {
		this.setTipoTelefone(tipoTelefone);
		this.ddi = ddi;
		this.ddd = ddd;
		this.telefone = telefone;
	}
	
	public Telefone (){}

	public String getTelefone() {
		return telefone;
	}
	public String getDdd() {
		return ddd;
	}
	public String getDdi() {
		return ddi;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	
}
