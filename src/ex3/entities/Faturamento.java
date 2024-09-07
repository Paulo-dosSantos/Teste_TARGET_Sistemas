package ex3.entities;

import java.time.LocalDate;

public class Faturamento {
	
	private Double valorFaturamento;
	private LocalDate data;
	
	public Faturamento() {
		
	}

	public Faturamento(Double valorFaturamento, LocalDate data) {
		super();
		this.valorFaturamento = valorFaturamento;
		this.data = data;
	}

	public Double getValorFaturamento() {
		return valorFaturamento;
	}

	public void setValorFaturamento(Double valorFaturamento) {
		this.valorFaturamento = valorFaturamento;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	

}
