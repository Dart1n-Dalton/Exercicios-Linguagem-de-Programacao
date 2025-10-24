/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E12 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.nextLine(), base = "AEIUOUaeiou";
		
		
		for(int x = 0; x < base.length(); x++){
			
			int cont = 0;
			
			for(int i = 0; i < frase.length(); i++){
				
				if(frase.charAt(i) == base.charAt(x)){
					cont++;
				}
			}
			
			if(cont > 0){
				System.out.println(cont + " letras \"" + base.charAt(x) + "\"");
			}
		}
		
	}
}

