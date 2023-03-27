package aula05;

import java.util.Scanner;
import java.util.Stack;

public class Atividade02Pilha {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();

		int opcao;
		String livro;

		while (true) {

			System.out.println("-----------------------------------------------------");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Livro na Pilha            ");
			System.out.println("            2 - Listar todos os Livros da Pilha            ");
			System.out.println("            3 - Retirar Livro da Pilha              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("------------------------------------------------------");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();

			

			switch (opcao) {
			
			case 0:
				System.out.println("Programa finalizado! ");
				System.exit(opcao);
				break;
			case 1:
			
				System.out.println("Adicionar Livro:  ");
				System.out.println("Digite o nome do Livro: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				livros.push(livro);
				System.out.println("Livro " + livro + " adicionado! ");

				break;
			case 2:
				System.out.println("Consultar Livros na pilha ");
				livros.forEach(System.out::println);

				System.out.println("\nOs livros foram Listados!");

				break;
			case 3:
				System.out.println("Retirar livro ");
				if (livros.isEmpty())
					System.out.println("Não há livros na pilha! ");
				else
					System.out.println(" O Livro : " + livros.pop() + " foi retirado da Pilha! ");

				break;
			default:
				System.out.println("Opção Inválida! ");

				leia.close();

			}

		}
	}
}
