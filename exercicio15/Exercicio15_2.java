package exercicio15;

import java.util.Scanner;

public class Exercicio15_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int maior = 0, meio = 0, menor = 0;

		System.out.print("Digite o primeiro número: ");
		int a = in.nextInt();

		System.out.print("Digite o segundo número:  ");
		int b = in.nextInt();

		System.out.print("Digite o terceiro número: ");
		int c = in.nextInt();

//		Acha o maior
		if (a >= b && a >= c) {
			maior = a;
		} else if (b >= a && b >= c) {
			maior = b;
		} else if (c >= a && c >= b) {
			maior = c;
		}

//		Acha o menor
		if (a <= b && a <= c) {
			menor = a;
		} else if (b <= a && b <= c) {
			menor = b;
		} else if (c <= a && c <= b) {
			menor = c;
		}

//		Acha o do meio
		if (a > menor && a < maior) {
			meio = a;
		} else if (b > menor && b < maior) {
			meio = b;
		} else if (c >= menor && c < maior) {
			meio = c;
		}

		// Acha o do meio se houver repetições
		if (a == b && a == menor || a == b && a == maior) {
			meio = b;
		} else if (b == c && b == menor || b == c && b == maior) {
			meio = c;
		} else if (a == c && a == menor || a == c && a == maior) {
			meio = a;
		}

		System.out.println(menor + " > " + meio + " > " + maior);
		in.close();

	}
}
