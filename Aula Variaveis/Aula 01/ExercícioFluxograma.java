import java.util.Scanner;

public class ExercícioFluxograma {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Float salario, abono, novoSalario;

		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();

		novoSalario = salario + abono;
		System.out.println("Novo salário é: " + novoSalario);

	}
}
