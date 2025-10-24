/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E9 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.nextLine();
		
		int cont = 0;
		
		for(int i = 0; i < frase.length(); i++){
			
			
			if(frase.charAt(i) == 32){
				cont++;
			}
			
		}
		
		System.out.println("\n a frase " + frase + "\n contem " + cont + " Espacos");
		
	}
}

