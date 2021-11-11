package exercicio16;

import java.util.Scanner;

public class Exercicio16_5 {

	public static void main(String[] args) {
		
//		5- Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
		
		Scanner in = new Scanner(System.in);
		
		int n, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			n = in.nextInt();
			soma += n;
			
		} while(n != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
			
		in.close();
	}
}