/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E18 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sequencia");
		String frase = leia.nextLine();
		
		boolean binario = true;
		
		if(frase.length() == 8){
		
			for(int i = 0; i < frase.length(); i++){
				
				if(frase.charAt(i) != '1' && frase.charAt(i) != '0'){
						binario= false;
						break;
				}	
				
				
			}
			
			
			if(binario){
					System.out.println("eh 8 bits");
			}else{
					System.out.println("nao eh 8 bits");
			}
			
		}else{
			System.out.println("nao eh 8 bits");
		}
		
	}
}

