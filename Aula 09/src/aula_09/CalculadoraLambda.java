package aula_09;

import java.util.Scanner;

public class CalculadoraLambda {

	public static int calcular(OperacaoMatematica om, int num1, int num2) {
		return om.executar(num1, num2);
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;

		System.out.println("Digite o 1º número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o 2º número: ");
		num2 = leia.nextInt();
		
		System.out.println("A soma dos 2 números é igual a : "+ calcular((a, b)-> a+b, num1,num2));
		
		System.out.println("A subtração dos 2 números é igual a : "+ calcular((a, b)-> a-b, num1,num2));
		
		System.out.println("A multiplicação dos 2 números é igual a : "+ calcular((a, b)-> a*b, num1,num2));
		
		System.out.println("A divisão dos 2 números é igual a : "+ calcular((a, b)-> a / b, num1,num2));
		

		leia.close();
	}

}
