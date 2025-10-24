/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */


import java.util.Random;

public class E26 {
	
	public static void main (String[] args) {	

		Random aleatorio = new Random();

		String lista = "", alfabeto = "abcdefghijklmnopqrstuvwxyz", vogais = "aeiou", maiorRepetidas = "", repetidas = "", maiorVogais = "", vogaisS = "", maiorAlfa = "", alfa = "";
		System.out.println();

			
			for(int i = 0; i <= 100; i++){
			
			lista+=	(char)(97 + aleatorio.nextInt(26));

			}
			
			System.out.println(lista);
			
			
			//verificar se a letra não existe
			
			for(int i = 0; i < alfabeto.length(); i++){
				
				boolean existe = false;
				
				for(int x = 0; x < lista.length(); x++){
				
					
					if(lista.charAt(x) == alfabeto.charAt(i)){
						existe = true;
						break;
						
					}
				}
				
				if(!existe){
					System.out.println("\n A lista nao contem a letra " + alfabeto.charAt(i));
				}
				
			}
			
			//letras repetidas
			
			for(int i = 1; i < (lista.length() - 1); i++){
				
				if(repetidas  .isEmpty()){
					repetidas+= lista.charAt(i);
				}else{
					
					if(lista.charAt(i) == lista.charAt(i + 1)){
						
						if(lista.charAt(i) != repetidas.charAt(0)){
							
							if(repetidas.length() >= maiorRepetidas.length()){
								maiorRepetidas = repetidas;
								repetidas = "";
							}
							repetidas = "";	
						}else{
							repetidas+= lista.charAt(i);
						}
							
					}else{
						if(lista.charAt(i) == lista.charAt(i - 1)){
							repetidas+= lista.charAt(i);
						}	
					}
				}
				
			}
			System.out.println("\nA maior sequencia de letras iguais foi " + maiorRepetidas + ", ou possuia a mesma quantidade de caracteres");
			
			
			
			
			
		
			
			
	
		
	}
}

