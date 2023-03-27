import java.util.Scanner;

public class ExercicioDaDiferença {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, n4, diferença;

		System.out.println("Insira o número 1: ");
		n1 = leia.nextInt();
		System.out.println("Insira o número 2: ");
		n2 = leia.nextInt();
		System.out.println("Insira o número 3: ");
		n3 = leia.nextInt();
		System.out.println("Insira o número 4: ");
		n4 = leia.nextInt();

		diferença = (n1 * n2) - (n3 * n4);

		System.out.printf("A diferença é: %d", diferença);
	}

}
