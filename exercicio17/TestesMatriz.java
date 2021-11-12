package exercicio17;

import java.util.Scanner;

public class TestesMatriz {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Criando uma matriz populada
		int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		// Criando uma matriz não populada
		int matriz2 [][]= new int[3][3];

		
		// Populando matriz2
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print("Digite um valor: ");
				matriz2[linha][coluna] = in.nextInt();
			}
		}
		
		// Imprimindo matriz2
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print("[" + matriz2[linha][coluna] + "]");
			}
			System.out.println();
		}
		
		in.close();
		
	}
}