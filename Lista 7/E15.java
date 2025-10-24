/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E15 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.nextLine();
		
		boolean numero = false;
		
		for(int i = 0; i < frase.length(); i++){
			
			
			if(frase.charAt(i) >= '0' && frase.charAt(i) <= '9' ){
				numero = true;
			}
			
		}
		
		
		if(numero){
				System.out.println("Existem caracteres numericos!");
		}else{
				System.out.println("Nao existem caracteres numericos!");
		}
		
		
	}
}

