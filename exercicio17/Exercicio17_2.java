package exercicio17;

import java.util.Scanner;

public class Exercicio17_2 {

	public static void main(String[] args) {
		
//		Faça um programa onde o usuário entre com 4 notas de 3 alunos diferentes e o programa mostre as médias.
		
		Scanner in = new Scanner(System.in);
		
		double[][] total = new double[3][4];
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.print("Digite a nota " + coluna + " do aluno " + linha + ": ");
				total[linha][coluna] = in.nextDouble();
			}
		}
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.print("[" + total[linha][coluna] + "]");
			}
			System.out.println();
		}

		
//		pendente calcular média
		System.out.println("MÉDIA ALUNO 1: ");
		System.out.println("MÉDIA ALUNO 2: ");
		System.out.println("MÉDIA ALUNO 3: ");
		
		in.close();
		
	}
}