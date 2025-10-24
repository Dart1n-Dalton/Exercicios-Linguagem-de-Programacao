/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E6 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o caracter a ser buscado");
		char busca = leia.next().charAt(0);
		
		int cont = 0, buscaAlt;

		
		if(busca >= 65 && busca <= 90){
				buscaAlt = busca + 32;
		}else{
				buscaAlt = busca - 32;
		}
		
		
		
		System.out.println("Digite a frase");
		String frase = leia.next();
		
		
		
		
		
		for(int i = 0; i < frase.length(); i++){
			
			
			if(frase.charAt(i) == busca || frase.charAt(i) == buscaAlt){
				cont++;
			}
			
			
			
		}
		
		System.out.println("\n a frase " + frase + "\n contem " + cont + " letras \"a\"");
		
	}
}

