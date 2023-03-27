
import java.text.DecimalFormat;

public class Variaveiss {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###.##");
		int numero = 10;
		String nome = "Rafael Gouvêa";
		double area = 43.65830283;

		System.out.println("O nome do participante é:" + nome);
		System.out.println("O número é:" + numero);
		System.out.printf("A área é: %.2f\n", area);

	}

}
