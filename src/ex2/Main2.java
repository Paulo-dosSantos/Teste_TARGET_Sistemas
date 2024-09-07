package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		List<Integer>numerosDeFibonacci=new ArrayList<>();
		
		//algoritmo para segunda pergunta
		//informar número para calcular sequência de fibonacci
		
		System.out.println("Informe o número para calcular a sequência de Fibonacci e responder se o mesmo está presente: ");
		int numero=sc.nextInt();
		
		//primeiro número da sequência de Fibonacci
		int a=0;
		//segundo número da sequência de Fibonacci
		int b=1;
		while(b<=numero) {
			int proximoNumero=a+b;
			 if (proximoNumero > numero) break; // Sai do loop se o próximo número ultrapassar o valor informado
	            numerosDeFibonacci.add(proximoNumero);
	            a = b; // Atualiza 'a' para o próximo cálculo
	            b = proximoNumero; // Atualiza 'b' para o próximo cálculo
		}
		 // Exibe a sequência de Fibonacci
        System.out.println("Números da sequência de Fibonacci até " + numero + ": ");
        for (Integer n : numerosDeFibonacci) {
            System.out.print(n + " ");
        }

        // Verifica se o número informado está na sequência de Fibonacci
        if (numerosDeFibonacci.contains(numero)) {
            System.out.println("\nO número " + numero + " está presente na sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " não está presente na sequência de Fibonacci.");
        }
	}

}
