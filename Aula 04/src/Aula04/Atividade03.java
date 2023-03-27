package Aula04;

import java.util.Scanner;

public class Atividade03 {
	
		
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			 int[][] matriz = new int[3][3];
			 int soma1=0,soma2=0;
			 
			 System.out.println("Coloque os numero de uma matriz quadrada de 3x3 ");
			 
			 for(int n = 0; n < matriz.length; n++) {
				 for(int m = 0; m < matriz.length; m++)
				 matriz[n][m] = leia.nextInt();
			 }
			 System.out.print("Elementos da Diagonal Principal:");
			 
			 for(int n = 0; n < matriz.length; n++) {
				 System.out.print(matriz[n][n]+" ");
			 }
			
			 System.out.print(" \nElementos da Diagonal Secundária ");
			 for(int n = 0; n < matriz.length;n++) {
				 System.out.print(matriz[n][matriz.length - n - 1] + " ");
			 }
			 
			 for (int n = 0; n < 3; n++) {
			      soma1 += matriz[n][n];
			      soma2 += matriz[n][3 - n - 1];
			    }
			 
			 
			 	System.out.println("\n\nA soma da diagonal principal: " + soma1);
			    System.out.println("\nA soma da diagonanal secundária: " + soma2);
}
	}