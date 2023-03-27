package Atividade01;


	
public class TestaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alfredo", "7896541254", 2, "1 rosh", 15.0f);
		
		c1.visualizar();
		
		Cliente c2 = new Cliente("Emily", "3849235270", 1, "1 narguile - aluguel, 1 vodka - drink", 55.0f);
		
		c2.visualizar();

	}

}
