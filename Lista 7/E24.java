/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E24 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sequencia");
		String frase = leia.nextLine();

			String saida = "";
			int inicio = 0;
			
			int maiorCadeia = 0;
			
			int cadeia = 0;
			
			for(int i = 0; i < frase.length(); i++){
				
				
				
				if(frase.charAt(i) == '1'){
						
					cadeia++;
					maiorCadeia = cadeia;
		
				}else{
					cadeia = 0;
				}
				
				
			
			}
		
			System.out.printf("a maior cadeia foi de %d numeros", maiorCadeia);
				
			
			
	
		
	}
}

