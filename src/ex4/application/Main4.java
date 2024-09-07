package ex4.application;

import java.util.ArrayList;
import java.util.List;

import ex4.entities.FaturamentoMensal;
import ex4.enums.Estados;

public class Main4 {
	
	public static void main(String[] args) {
		
		/*atribuindo os valores solicitados para o faturamento de cada Estado*/
		FaturamentoMensal faturamentoSP= new FaturamentoMensal(67836.43,Estados.SP);
		FaturamentoMensal faturamentoRJ= new FaturamentoMensal(36678.66,Estados.RJ);
		FaturamentoMensal faturamentoMG= new FaturamentoMensal(29229.6688,Estados.MG);
		FaturamentoMensal faturamentoES= new FaturamentoMensal(27165.48,Estados.ES);
		FaturamentoMensal faturamentoOutros= new FaturamentoMensal(19849.53,Estados.RJ);
		
		List<FaturamentoMensal>faturamentos= new ArrayList<>();
		
		/*adicionando em uma lista para realizar os cálculos*/
		faturamentos.add(faturamentoSP);
		faturamentos.add(faturamentoRJ);
		faturamentos.add(faturamentoMG);
		faturamentos.add(faturamentoES);
		faturamentos.add(faturamentoOutros);
		
		/*percentual de cada Estado no total de faturamento*/
		System.out.println("A percentual de representação de cada Estado dentro do valor mensal total é: ");
		for(FaturamentoMensal f: faturamentos) {
			System.out.println(f.getEstado().name()+" : "+String.format("%.2f",f.calcularPorcentagemDoValorTotal(faturamentos))+"%");
		}
	
	
	
	}

}
