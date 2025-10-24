/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E5 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.next();
		
		int cont = 0;
		
		for(int i = 0; i < frase.length(); i++){
			
			
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A'){
				cont++;
			}
			
			
			
		}
		
		System.out.println("\n a frase " + frase + "\n contem " + cont + " letras \"a\"");
		
	}
}

