package exercicio15;

import java.util.Scanner;

public class Exercicio15_1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int maior = 0;

		System.out.println("Digite o primeiro número: ");
		int a = in.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int b = in.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int c = in.nextInt();
		
		if(a > b && a > c) {
			maior = a;
		} else if (b > a && b > c) {
			maior = b;
		} else {
			maior = c;
		}
		
		System.out.println("Maior: " + maior);
		
		in.close();

	}
}
