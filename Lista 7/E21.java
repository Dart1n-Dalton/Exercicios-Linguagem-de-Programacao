/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E21 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sequencia");
		String frase = leia.nextLine();

			String saida = "\n";
			
			for(int i = 0; i < frase.length(); i++){
				
				
				
				if(frase.charAt(i) == ' '){
						
					saida+= "\n";
		
				}else{
					
					saida+= frase.charAt(i);
					
				}
				
			
			}
			
			System.out.println(saida);
				
			
			
	
		
	}
}

