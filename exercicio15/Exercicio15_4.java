package exercicio15;

import java.util.Scanner;

public class Exercicio15_4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		System.out.print("Digite um número: ");
		int n = in.nextInt();

		if (n % 2 == 0) {
			System.out.println("A raiz quadrada de " + n + " é " + Math.sqrt(n));
		} else {
			System.out.println(n + " ao quadrado é " + Math.pow(n, 2));
		}

		in.close();

	}
}
