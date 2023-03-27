import java.util.Scanner;

public class ExercicioSalarioLiquido {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		System.out.println("Insira o sálario bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Insira o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Insira ás horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Insira os descontos: ");
		descontos = leia.nextFloat();
		System.out
				.println("O seu salário líquido é: " + (salarioBruto + adicionalNoturno + horasExtras * 5 - descontos));

	}

}
