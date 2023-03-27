package aula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade01Collections {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		 String cor;
		int opcao;

		do {
			System.out.println("1 - Cadastrar cor: ");
			System.out.println("2 - Listar todas as cores: ");
			System.out.println("3 - Ordenar as cores: ");
			System.out.println("4 - Sair ");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("Digite a cor: ");
				leia.skip("\\R?");
				cor = leia.nextLine();
				cores.add(cor);
				break;
			case 2: 
				if(cores.isEmpty())
				System.out.println("Nenhuma cor foi adicionada! ");
				
				else
					
				cores.forEach(System.out::println);
				
				break;
			case 3:
				Collections.sort(cores);
				System.out.println(cores);
				break;
			

			}

		} while (opcao != 4);
		

	}
}
