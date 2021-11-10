package exercicio12;

import java.util.Scanner;

public class Exercicio12_6 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Digite x1: ");
		int x1 = in.nextInt();
		
		System.out.println("Digite y1: ");
		int y1 = in.nextInt();
		
		System.out.println("Digite x2: ");
		int x2 = in.nextInt();
		
		System.out.println("Digite y2: ");
		int y2 = in.nextInt();
		
		double x = Math.pow((x2 - x1), 2);
		double y = Math.pow((y2 - y1), 2);
		
		double d = Math.sqrt(x + y);
		
		System.out.println("D = " + d);
		
		in.close();
		
	}
}