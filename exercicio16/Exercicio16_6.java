package exercicio16;

import java.util.Scanner;

public class Exercicio16_6 {

	public static void main(String[] args) {
		
//		6- Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		
		Scanner in = new Scanner(System.in);
		
		int n, soma = 0, total = 0;
		
		do {
			System.out.println("Digite um número: ");
			n = in.nextInt();
			
			if(n % 3 == 0) {
				soma += n;
				total++;
			}
			
		} while (n != 0);
		
		double media = soma/(total - 1);
		
		System.out.println("\nMédia dos múltiplos de 3: " + media);
		
		in.close();
	}
}