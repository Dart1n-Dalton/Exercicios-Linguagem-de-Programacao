/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E28 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.nextLine();

			String saida = "", dobra = "";
			
			for(int i = ((int)(frase.length() / 2)); i < frase.length(); i++){
			
				dobra = frase.charAt(i) + dobra;
				
			}
			

			for(int i = 0; i < ((int)(frase.length() / 2)); i++){
			
				saida+= (char)frase.charAt(i);
				saida+= (char)dobra.charAt(i);			
			}
		
			System.out.println(saida);
				
	

				
			
			
	
		
	}
}

