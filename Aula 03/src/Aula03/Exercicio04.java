package Aula03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	int idade, sexo, categoria, backEnd = 0, frontEnd = 0, mobile = 0, fullStack = 0;
	String continua = "s";
	
	while(continua.equalsIgnoreCase("s")) { 
	
	System.out.println("Digite a idade: ");
	idade = leia.nextInt();
	
	System.out.println("Digite o sexo: ");
	sexo = leia.nextInt();
	
	System.out.println("Digite a categoria: ");
	categoria = leia.nextInt();
	if (categoria == 1)
		backEnd ++;
	if (categoria == 2 && sexo == 2)
		frontEnd ++;
	if (categoria == 3 && sexo == 1 && idade > 40)
		mobile ++;
	if (categoria == 4 && sexo == 2 && idade < 30)
		fullStack ++;
	
	System.out.println("Deseje continuar (S/N)? ");
	leia.skip("\\R?");
	continua = leia.nextLine();
	
	
	}leia.close();
	System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backEnd);
	System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + frontEnd);
	System.out.println("\nTotal de homens desenvolvedores mobile maiores de 40 anos: " + mobile);
	System.out.println("\nTotal de mulheres desenvolvedoras Fullstack: " + fullStack);

	
	
	}
	
	
	
	

}
