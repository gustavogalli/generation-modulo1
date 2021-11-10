package exercicio15;

import java.util.Scanner;

public class Exercicio15_3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = in.nextInt();

		if (idade >= 10 && idade <= 15) {
			System.out.println("Infantil");
		} else if (idade <= 17) {
			System.out.println("Juvenil");
		} else if (idade <= 25) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idade inválida");
		}

		in.close();

	}
}
