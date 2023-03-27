package aula05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade04CollectionsSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numero = new HashSet<Integer>();
		
		
		int notas;
		
		numero.add(2);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		notas = leia.nextInt();
		
		if(notas > 10 || notas < 0 )
			System.out.println("Número não encontrado:  " + notas );
		else
			System.out.println("Número encontrado:  " + notas);
		
		leia.close();
			
	
	
		
		
		
		

	}

}
