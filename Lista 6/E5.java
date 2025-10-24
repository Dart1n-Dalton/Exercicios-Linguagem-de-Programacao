/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E5 {
	
	public static void main (String[] args) {
		
	double n;
	
	Scanner leia = new Scanner (System.in);
	
	do{
	
	System.out.println("Insira o valor limite para a contagem");
	n = leia.nextDouble();
	
	}while(n < 0);
	
		
	for(int i = 1; i <= n; i++){
	
		System.out.print(i + " ");
		
	}
		
		
	}
}

