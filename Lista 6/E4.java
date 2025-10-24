/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E4 {
	
	public static void main (String[] args) {
		
		double n;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Insira o valor limite para a contagem");
	n = leia.nextDouble();
		
	for(int i = 1; i <= n; i++){
	
		System.out.print(i + " ");
		
	}
		
	}
}

