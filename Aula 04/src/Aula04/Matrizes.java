package Aula04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int matrizesInteiros[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		float[][] matriz = new float[2][2];

		// ler linhas
		for (int indiceI = 0; indiceI < matrizesInteiros.length; indiceI++) {

			// ler colunas
			for (int indiceJ = 0; indiceJ < matrizesInteiros.length; indiceJ++) {
				System.out.println(matrizesInteiros[indiceI][indiceJ]);

			}

		}

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				System.out.println("digite um valor real: ");
				matriz[indiceI][indiceJ] = leia.nextFloat();
			}
		}

		for (float[] vetor : matriz) {
			for (var elemento : vetor) {
				System.out.println(elemento);
			}
		}

		leia.close();

	}

}
