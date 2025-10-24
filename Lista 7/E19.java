/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E19 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a palavra");
		String frase = leia.nextLine(), fraseR = "";
		
		for(int x = 0; x < frase.length(); x++){
			
				fraseR = frase.charAt(x) + fraseR;
			
		}
		
		boolean palindromo = true;
		
		
		
			for(int i = 0; i < frase.length(); i++){
				
				if(frase.charAt(i) != fraseR.charAt(i)){
						palindromo = false;
						break;
				}	
				
				
				}
				
				
				if(palindromo){
						System.out.println("eh palindromo");
				}else{
						System.out.println("nao eh palindromo");
				}
			
	
		
	}
}

