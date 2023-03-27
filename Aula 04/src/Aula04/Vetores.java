package Aula04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int vetorInteiros[] = { 1, 2, 3, 4, 5 };

		float vetorFloat[] = new float[5];

		for (int contador = 0; contador < vetorInteiros.length; contador++)
			System.out.println("posição " + contador + " = " + vetorInteiros[contador]);

		for (int indice = 0; indice < vetorFloat.length; indice++) {
			System.out.println("digite um valor para a posiçao[" + indice + "]");
			vetorFloat[indice] = leia.nextFloat();
		}

		Arrays.sort(vetorFloat);

		for (var numero : vetorFloat) // para so mostrar/listar dados na tela.
			System.out.println(numero);

		leia.close();
	}
}
