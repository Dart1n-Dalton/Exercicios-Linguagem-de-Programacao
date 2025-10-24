/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */


public class E16 {
	
	public static void main (String[] args) {
		
		int soma = 0, media;
		
		for(int i = 15; i <= 100; i++){
			
			soma+= i;
			
		};
		
		media = soma / (100 - 15);
		
		System.out.println("a media é " + media);
		
	}
}

