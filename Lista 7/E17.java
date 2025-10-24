/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E17 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a pimeira frase");
		String frase1 = leia.nextLine();
		
		System.out.println("Digite a segunda frase");
		String frase2 = leia.nextLine();
		
		boolean iguais = true;
		
		if(frase1.length() == frase2.length()){
		
			for(int i = 0; i < frase1.length(); i++){
				
				if(frase2.charAt(i) != frase1.charAt(i)){
						iguais = false;
						break;
				}	
				
				
			}
			
			
			if(iguais){
					System.out.println("as frases sao iguais!");
			}else{
					System.out.println("as frases sao diferentes!");
			}
		}else{System.out.println("as frases possuem tamanhos difeentes!");}
		
	}
}

