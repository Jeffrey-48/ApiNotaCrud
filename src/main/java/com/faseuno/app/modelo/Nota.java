package com.faseuno.app.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notas")
public class Nota {
	
	@Id
	private int id;
	private double valor;
	
	public Nota(int id, double valor) {
		this.id = id;
		this.valor = valor;
	}
	public Nota() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
