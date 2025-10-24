/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E11 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.nextLine();
		
		int contNum = 0, contLett = 0;
		
		for(int i = 0; i < frase.length(); i++){
			
			
			if(frase.charAt(i) >= 65 && frase.charAt(i) <= 90 || frase.charAt(i) >= 97 && frase.charAt(i) <= 122 ){
				contLett++;
			}
			if(frase.charAt(i) >= 48 && frase.charAt(i) <= 57){
				contNum++;
			}
			
		}
		
		System.out.println("\n a frase " + frase + "\n contem " + contLett + " Letras e");
		System.out.println(contNum + " Numeros");
	}
}

