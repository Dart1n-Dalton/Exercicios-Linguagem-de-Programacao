/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E30 {
	
	public static void main (String[] args) {
		

		Scanner read = new Scanner(System.in);
		
		String saida = "";
			System.out.println("\nDigite a frase");
			String frase = read.nextLine();

				
				
				for(int i = 0; i < frase.length(); i++){
					
					char hold = 0;
					String holder = "", caser = frase.toLowerCase();	
						
					if(caser.charAt(i) >= 'a' && caser.charAt(i) <= 'z'){	
						
						if( (caser.charAt(i) + 13) > 122){
							hold = (char)(((int)caser.charAt(i) - 13);
						}else{
							hold = (char)((int)caser.charAt(i) + 13);
						}
						
					}else{
							hold = caser.charAt(i);
					}
				
					
					holder+= (char)hold;
					
					
					
					if(frase.charAt(i) >= 65 && frase.charAt(i) <= 90){
						
						saida+= holder.toUpperCase();
						
					}else{
						
						if(frase.charAt(i) >= 97 && frase.charAt(i) <= 122){
							
							saida+= holder.toLowerCase();
							
						}else{
							
							saida+= hold;
							
						}
					}
						
				}
			
				System.out.println("\nfrase resultante: " + saida);
				

	
		
	}
}

