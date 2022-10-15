package com.jb.fibonacci.DTO;

import java.util.List;

public class FibonacciGeradoDTO {
	
	private Integer numero;
	private List<Integer> sequencia;
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public List<Integer> getSequencia() {
		return sequencia;
	}
	
	public void setSequencia(List<Integer> sequencia) {
		this.sequencia = sequencia;
	}

}
