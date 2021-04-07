package br.com.fernando.apiviavarejo.client.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Selic implements Serializable {
	private static final long serialVersionUID = 1L;

	private String data;

	private BigDecimal valor;

	public Selic() {

	}

	public Selic(String data, BigDecimal valor) {
		this.data = data;
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Selic [data=" + data + ", valor=" + valor + "]";
	}

}
