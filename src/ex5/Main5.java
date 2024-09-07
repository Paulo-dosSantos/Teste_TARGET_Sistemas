package ex5;

import java.util.Scanner;

public class Main5 {
	 public static void main(String[] args) {
	        // Opção 1: Definir a string diretamente no código
	        // String inputString = "exemplo";

	        // Opção 2: Receber a string do usuário
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite uma string para inverter: ");
	        String inputString = scanner.nextLine();

	        String reversedString = reverseString(inputString);

	        System.out.println("String original: " + inputString);
	        System.out.println("String invertida: " + reversedString);
	    }

	    public static String reverseString(String str) {
	        char[] characters = str.toCharArray();
	        int left = 0;
	        int right = characters.length - 1;

	        while (left < right) {
	            // Troca os caracteres nas posições left e right
	            char temp = characters[left];
	            characters[left] = characters[right];
	            characters[right] = temp;

	            // Move os índices
	            left++;
	            right--;
	        }

	        // Cria uma nova string a partir do array de caracteres invertido
	        return new String(characters);
	    }
}
