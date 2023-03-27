package Aula03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, soma = 0;

		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if (n > 0)
				soma += n;

		} while (n != 0);
		System.out.println("A soma de todos os números é: " + soma);
		System.out.println("Sistema finalizado!");

		leia.close();

	}
}
