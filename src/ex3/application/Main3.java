package ex3.application;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import ex3.entities.Faturamento;

public class Main3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		 String filePath = "faturamentos.json";
		  ObjectMapper objectMapper = new ObjectMapper();
		   // Registra o módulo JavaTimeModule para suportar a API de data/hora do Java 8+
          objectMapper.registerModule(new JavaTimeModule());
		 try {
			  // Ler o arquivo JSON e converter para uma lista de objetos Faturamento
	            List<Faturamento> faturamentos = objectMapper.readValue(new File(filePath), new TypeReference<List<Faturamento>>(){});
	            
	            // Converter a lista para um vetor (array)
	            Faturamento[] vetorFaturamentos = faturamentos.toArray(new Faturamento[10]);

	            double menorValor=vetorFaturamentos[0].getValorFaturamento();
		    	  int posicaoMenorValor=0;  
		    	  /*utilizando iteração para calcular o menor faturamento do mês*/
	      for(int i=0;i<vetorFaturamentos.length;i++) {
	    	
	    	  if(vetorFaturamentos[i].getValorFaturamento()<menorValor ) {
	    		  menorValor=vetorFaturamentos[i].getValorFaturamento();
	    		  posicaoMenorValor=i;
	    	  }
	      }
	      double maiorValor=vetorFaturamentos[0].getValorFaturamento();
    	  int posicaoMaiorValor=0; 
    	  /*utilizando iteração para calcular o maior faturamento do mês*/
    	    	  
  for(int i=0;i<vetorFaturamentos.length;i++) {
	
	  if(vetorFaturamentos[i].getValorFaturamento()>maiorValor ) {
		  maiorValor=vetorFaturamentos[i].getValorFaturamento();
		  posicaoMaiorValor=i;
	  }
  }
  double valorSoma=0;
  int cont=0;
  for(Faturamento f: vetorFaturamentos) {
	  if(f.getValorFaturamento()!=0) {
		  valorSoma+=f.getValorFaturamento();
		  cont+=1;
	  }
  }
  /*média aritmética do total de faturamento dentro do mês*/
  double media= valorSoma/cont;
  
  int acimaDaMedia=0;
  /*contagem do número de faturamentos acima da média*/
  for(Faturamento f: vetorFaturamentos) {
	  if(f.getValorFaturamento()>media) {
		  acimaDaMedia+=1;
	  }
  }
  
	      
	      
	      
	      System.out.printf("o menor valor de faturamento da "
	      		+ "distribuidora foi %.2f e ocorreu no dia %d%n ",
	    		  menorValor,vetorFaturamentos[posicaoMenorValor].getData().getDayOfMonth());
	      System.out.printf("o maior valor de faturamento da "
		      		+ "distribuidora foi %.2f e ocorreu no dia %d%n ",
		      		maiorValor,vetorFaturamentos[posicaoMaiorValor].getData().getDayOfMonth());
		    
	      
	      System.out.println("O número de dias que o valor foi superior a média mensal é "+acimaDaMedia);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		
		
		
		
		
		
		sc.close();
	}
	
}
