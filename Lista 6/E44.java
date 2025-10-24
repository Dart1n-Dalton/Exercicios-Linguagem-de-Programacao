/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E44 {
	
	public static void main (String[] args) {
		
		int qtd;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("insira a quantidade de termos");
		qtd = leia.nextInt();
		
		for(int x = 1; x <= qtd; x++){
		
		int fatorial;
		
		fatorial = x;
		
		for(int i = (x - 1); i >= 1; i--){
			
		fatorial*= i;		
			
		}
			
		System.out.printf("\n\n\tFatorial de %d = %d", x, fatorial);
		
		}
		
	}
}

