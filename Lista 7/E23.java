/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E23 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome completo");
		String frase = leia.nextLine();

			String saida = "";
			int inicio = 0;
			
			
			for(int i = 0; i < frase.length(); i++){
				
				
				
				if(frase.charAt(i) == ' '){
						
					inicio = i;
		
				}
				
				
			
			}
			
			for(int x = (inicio +1); x < frase.length(); x++){
				
				saida+= frase.charAt(x);
			
			}
			
			System.out.println(saida);
				
			
			
	
		
	}
}

