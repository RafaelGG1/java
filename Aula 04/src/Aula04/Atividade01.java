package Aula04;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor [] = {2,5,1,3,4,9,7,8,10,6};
		int n;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		n = leia.nextInt();
		for(int i = 0; i < vetor.length; i++) {
			
		if(n == vetor[i]) { 
			System.out.println("O número " + n + " está localizado na posição " + i);
			break;
		}
			else if(vetor.length -1 == i && vetor[i] != n)
				System.out.println("O número " + n + "  valor não encontrado ");
		
		
		
		
		leia.close();
			
		
		}
		
	}
		
	

}


