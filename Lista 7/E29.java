/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E29 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("1- descriptografar\n2- criptografar\n3- sair");
		int select = leia.nextInt();
	
	while(select != 3){
		
		
		if(select == 1 || select == 2){
		
		Scanner read = new Scanner(System.in);
		
		String saida = "";
			System.out.println("\nDigite a frase");
			String frase = read.nextLine();

				
				
				for(int i = 0; i < frase.length(); i++){
					
					
					char hold = 0;
					String holder = "", caser = frase.toLowerCase();	
						
						
					switch(caser.charAt(i)){
						
					//zenit	
						
						case 'z':
							
							hold = 'p';
						
						break;
						
						
						case 'e':
						
							hold = 'o';
						
						break;
						
						
						case 'n':
						
							hold = 'l';
						
						break;
						
						case 'i':
						
							hold = 'a';
						
						break;
						
						case 't':
						
							hold = 'r';
						
						break;
						
					//polar
					
						case 'p':
							
							hold = 'z';
						
						break;
						
						
						case 'o':
					
							hold = 'e';
						
						break;
						
						
						case 'l':
						
							hold = 'n';
						
						break;
						
						case 'a':
						
							hold = 'i';
						
						break;
						
						case 'r':
						
							hold = 't';
						
						break;
						
						default:
							
							hold = caser.charAt(i);
							
						break;
					}
					
					holder+= hold;
					
					
					
					if(frase.charAt(i) >= 65 && frase.charAt(i) <= 90){
						
						saida+= holder.toUpperCase();
						
					}else{
						
						if(frase.charAt(i) >= 97 && frase.charAt(i) <= 122){
							
							saida+= holder.toLowerCase();
							
						}else{
							
							saida+= hold;
							
						}
					
					
					}
						
				}
			
				System.out.println("\n frase resultante: " + saida);
			}
		
	}
				
			

				
			
			
	
		
	}
}

