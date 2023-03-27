package Atividade04;

import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {
		long id;
		String nome, nomeComercial, fabricante, foto;
		float preco;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Id: ");
		id = leia.nextLong();
		
		System.out.println("Nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Nome Comercial: ");
		nomeComercial = leia.nextLine();
		
		System.out.println("Fabricante: ");
		fabricante = leia.nextLine();
		
		System.out.println("Foto: ");
		foto = leia.nextLine();
		
		System.out.println("Preço: ");
		preco = leia.nextFloat();
		
		/*O encapsulamento é a ação de os métodos de Farmácia só serem acessíveis dentro
		 da própria classe Farmácia.*/
		
		Farmacia f1 = new Farmacia(id, nome, nomeComercial, fabricante, foto, preco);
		
		// Farmacia f2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Química", "-", 20.0f);
		
		f1.visualizar();
		
		// f2.visualizar();

		
		
		leia.close();
	}

}