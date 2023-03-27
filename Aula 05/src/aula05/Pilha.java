package aula05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
	Stack<String> pilha = new Stack<String>();
		
		pilha.push("Rony");
		pilha.push("Lucas");
		pilha.push("Isaac");
		pilha.push("Fernando");
		pilha.push("Laise");
		pilha.push("Elizangela");
		
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Remover um elemento da pilha: ");
		pilha.pop();
		
		for(var elemento : pilha)
			System.out.println(elemento);
		System.out.println("Topo da pilha: ");
		System.out.println(pilha.peek());
		
		
	}

}
