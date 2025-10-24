/* 
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E14 {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a frase");
		String frase = leia.nextLine(), saida = "";
		
		System.out.println("digite o caracter a ser trocado");
		char caracter = leia.next().charAt(0);
		
		
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == caracter){
				saida+= "*";
			}else{
				saida+= frase.charAt(i);
			}
			
		}  
		
		System.out.println(saida);

	}
}

