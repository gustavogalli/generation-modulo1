package exercicio17;

import java.util.Scanner;

public class Exercicio17_1 {

	public static void main(String[] args) {
		
//		Faça um programa onde o	usuário entre com 4 notas num vetor chamado média, e o programa mostre a média.

		Scanner in = new Scanner(System.in);

		double[] media = new double[4];
		double mediaDaTurma = 0;
		double total = 0;

		for(int i = 0; i < media.length; i++) {
			System.out.print("Digite uma nota: ");
			media[i] = in.nextDouble();
			total += media[i];
		}
		
		mediaDaTurma = total / media.length;

		System.out.println("\nMédia: " + mediaDaTurma);

		in.close();

	}
}