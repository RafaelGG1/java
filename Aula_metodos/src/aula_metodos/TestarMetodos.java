package aula_metodos;

import static aula_metodos.pacote2.Classe2.*;

public class TestarMetodos {

	public static void main(String[] args) {
		metodoPublic();
		metodoFriendly();
		metodoProtegido();
		metodoPrivado();
		
		Classe1.metodoPublico1();
		Classe1.metodoFriendly1();
		Classe1.metodoProtegido1();
		//Classe1.metodoPrivado1();
		
		metodoPublicoPacote2();
		/*metodoFriendlyPacote2();
		metodoProtegidoPacote2();
		metodoPrivadoPacote2();*/
	
	
		System.out.println(soma(2,4));
		
	}
	
	public static void metodoPublic() {
		System.out.println("Eu sou um Método público! ");
		
	}
	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
		
	}
	static void metodoFriendly() {
		System.out.println("Eu sou um Método friendly! ");
	}
	protected static void metodoProtegido() {
		System.out.println("Eu sou um Método protegido! ");
	}
	private static void metodoPrivado() {
		System.out.println("Eu sou um Método privado! ");
	}
	
	
	

}
