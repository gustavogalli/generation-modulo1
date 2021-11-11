package exercicio16;

import java.util.Scanner;

public class Exercicio16_4 {

	public static void main(String[] args) {
//		4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas 	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
//		o número de pessoas calmas;
//		o número de mulheres nervosas;
//		o número de homens agressivos;
//		o número de outros calmos;
//		o número de pessoas nervosas com mais de 40 anos;
//		o número de pessoas calmas com menos de 18 anos.

		Scanner in = new Scanner(System.in);

		int idade, sexo, estado, contador = 0;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, pessoasNervosasMais40 = 0,
				pessoasCalmasMenos18 = 0;

		while (contador <= 150) {
			System.out.println("Qual sua idade? ");
			idade = in.nextInt();
			System.out.println("Qual seu sexo?\n[1] Masculino\n[2] Feminino\n[3] Outros");
			sexo = in.nextInt();
			System.out.println("Escolha abaixo: \n[1] Calmo(a)\n[2] Nervoso(a)\n[3] Agressivo(a)");
			estado = in.nextInt();
			
			if(estado == 1) {
				pessoasCalmas++;
				if(idade < 18) {
					pessoasCalmasMenos18++;
				} 
				if (sexo == 3) {
					outrosCalmos++;
				}
			} else if (sexo == 2 && estado == 2) {
				mulheresNervosas++;
			} else if (sexo == 1 && estado == 3) {
				homensAgressivos++;
			} else if (idade > 40 && estado == 2) {
				pessoasNervosasMais40++;
			}
			
			contador++;
		}

		System.out.println("PESSOAS CALMAS: " + pessoasCalmas);
		System.out.println("MULHERES NERVOSAS: " + mulheresNervosas);
		System.out.println("HOMENS AGRESSIVOS: " + homensAgressivos);
		System.out.println("OUTROS CALMOS: " + outrosCalmos);
		System.out.println("PESSOAS NERVOSAS COM MAIS DE 40 ANOS: " + pessoasNervosasMais40);
		System.out.println("PESSOAS CALMAS COM MENOS DE 18 ANOS: " + pessoasCalmasMenos18);
		
		in.close();
	}
}