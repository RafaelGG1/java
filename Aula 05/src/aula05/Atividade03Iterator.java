package aula05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade03Iterator {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

	        Set<Integer> numeros = new HashSet<Integer>();

	        int numero;

	        System.out.println("Digite um número: ");

	        for (int contador = 0; contador <= 9; contador++) {
	            numero = leia.nextInt();
	            numeros.add(numero);

	        }
	        System.out.println("Listar dados do set: ");
	        Iterator<Integer> nuIte = numeros.iterator();

	        while (nuIte.hasNext()) {
	            System.out.println(nuIte.next());
	            
	            
	            
	            
	            leia.close();
	}	
	}

}
