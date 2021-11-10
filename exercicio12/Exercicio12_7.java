package exercicio12;

import java.util.Scanner;

public class Exercicio12_7 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		int a = in.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = in.nextInt();

		System.out.println("Digite o valor de C: ");
		int c = in.nextInt();
		
		System.out.println("Digite o valor de D: ");
		int d = in.nextInt();

		System.out.println("Digite o valor de E: ");
		int e = in.nextInt();
		
		System.out.println("Digite o valor de F: ");
		int f = in.nextInt();
		
		int x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		int y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
		in.close();
		
	}
}
