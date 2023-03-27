package Aula03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 1, s1 = 0, s2 = 0;

		while (n >= 0) {
			System.out.println("Digite a idade: ");
			n = leia.nextInt();
		
		if (n < 0) {
			System.out.println("Valor inválido!");
		} else {
			if (n <= 21) {
				s1 += 1;

			} else if (n >= 50) {
				s2 += 1;
			}	}

		}
		System.out.println("Total de pessoas com menos de 21 anos: " + s1);
		System.out.println("Total de pessoas com mais de 50 anos: " + s2);

		leia.close();
	}

}
