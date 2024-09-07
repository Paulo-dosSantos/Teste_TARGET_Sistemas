package ex4.entities;

import java.util.List;

import ex4.enums.Estados;

public class FaturamentoMensal {
	
	private Double valorFaturamentoMensal;
	private Estados estado;
	
	
	public FaturamentoMensal() {
		
	}


	public FaturamentoMensal(Double valorFaturamentoMensal, Estados estado) {
		super();
		this.valorFaturamentoMensal = valorFaturamentoMensal;
		this.estado = estado;
	}


	public Double getValorFaturamentoMensal() {
		return valorFaturamentoMensal;
	}


	public void setValorFaturamentoMensal(Double valorFaturamentoMensal) {
		this.valorFaturamentoMensal = valorFaturamentoMensal;
	}


	public Estados getEstado() {
		return estado;
	}


	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	/*método para calcular a porcentagem de participação do faturamento de um Estado no faturamento mensal*/
	public double calcularPorcentagemDoValorTotal(List<FaturamentoMensal>faturamentos) {
		
		double total= faturamentos.stream().map(x->x.getValorFaturamentoMensal()).reduce(0.0,(x,y)->x+y);
		double porcentagem= (valorFaturamentoMensal/total)*100;
		return porcentagem;
	}
	
}
