/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E16 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.nextLine();
		
		boolean maiusculo = true;
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) >= 97 && frase.charAt(i) <= 122 ){
					maiusculo = false;
					break;
			}	
			
			
		}
		
		
		if(maiusculo){
				System.out.println("todos os alfabeticos sao maiusculos!");
		}else{
				System.out.println("nem todos os alfabeticos sao maiusculos");
		}
		
		
	}
}

