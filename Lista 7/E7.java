/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E7 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.next();
		
		
		
		for(int x = 65; x <= 90; x++){
			
			int cont = 0;
			
			for(int i = 0; i < frase.length(); i++){
				
				if(frase.charAt(i) == x || frase.charAt(i) == (x + 32)){
					cont++;
				}
			}
			
			
			System.out.println(cont + " letras \"" + (char)x + "\"");
			
		}
		
		
		
	}
}

