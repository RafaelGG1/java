package Aula03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2;

		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		n2 = leia.nextInt();

		if (n1 < n2) {
			for (int c = n1; c <= n2; c++) {
				if (c % 3 == 0 && c % 5 == 0) {

					System.out.println("\n" + "O intervalo entre  " + n1 + " e " + n2 + " é: " + c);
				}

			}
		}else{
			System.out.println("Intervalo inválido!");
			
		}
		leia.close();

	}

}
