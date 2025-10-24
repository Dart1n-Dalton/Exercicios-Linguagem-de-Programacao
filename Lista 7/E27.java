/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E27 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira frase");
		String frase1 = leia.nextLine();
		
		System.out.println("Digite a segunda frase");
		String frase2 = leia.nextLine(), saida = "";


		if(frase1.length() == frase2.length()){
		
			for(int i = 0; i < frase1.length(); i++){
			
				saida+= (char)frase1.charAt(i);
				saida+= (char)frase2.charAt(i);			
			}
		
			System.out.println(saida);
		
		}else{
			
			System.out.println("as frases tem tamanhos diferentes");
		
		}
		
			
		
			
			
			
			
				
			
			
	
		
	}
}

