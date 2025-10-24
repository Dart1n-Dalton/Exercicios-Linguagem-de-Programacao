/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E43 {
	
	public static void main (String[] args) {
			
		for(int x = 1; x <= 7; x++){
			
			int valor, fatorial;
			
			Scanner leia = new Scanner (System.in);	
			
			System.out.println("\n\ninsira um valor");
			valor = leia.nextInt();
			
			fatorial = valor;
			
			for(int i = (valor - 1); i >= 1; i--){
				
			fatorial*= i;		
				
			}
				
			System.out.println("Fatorial = " + fatorial);
		
		}
		
	}
}

