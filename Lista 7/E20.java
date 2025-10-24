/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E20 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sequencia");
		String frase = leia.nextLine();

		int cont = 0;
		
			if(frase.charAt(frase.length() - 1) != ' '){
				cont++;
			}
			
			for(int i = 0; i < frase.length(); i++){
				
				
				
				if(frase.charAt(i) == ' ' && frase.charAt(i - 1) != ' '){
						cont++;
				}	
				
				
				}
			
		System.out.printf("a frase contem %d palavras", cont);
				
			
			
	
		
	}
}

