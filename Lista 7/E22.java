/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E22 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a palavra a ser buscada");
		String palavra = leia.nextLine();
		
		System.out.println("Digite a frase");
		String frase = leia.nextLine();
 
			int cont = 0;

			
			for(int i = 0; i < frase.length(); i++){
			
				if(i <= (frase.length() - palavra.length())){
					if(frase.substring(i, (i + palavra.length())).equals(palavra)){
						cont++;
					}
				}

			
			}
			
			System.out.printf("a palavra apareceu %d vezes na frase", cont);
				
			
			
	
		
	}
}

