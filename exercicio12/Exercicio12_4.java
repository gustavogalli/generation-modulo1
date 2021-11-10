package exercicio12;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio12_4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int A = in.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int B = in.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int C = in.nextInt();
		
		int R = (int) Math.pow((A + B), 2);
		int S = (int) Math.pow((B + C), 2);
		
		int D = (R + S) / 2;
		
		System.out.println(D);

		in.close();
			
		
	}
}