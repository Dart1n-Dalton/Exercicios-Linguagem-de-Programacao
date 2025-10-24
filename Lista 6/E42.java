/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */


public class E42 {
	
	public static void main (String[] args) {
		
		
		for(int x = 1; x <= 10; x++){
		
		int fatorial;
		
		fatorial = x;
		
		for(int i = (x - 1); i >= 1; i--){
			
		fatorial*= i;		
			
		}
			
		System.out.printf("\n\n\tFatorial de %d = %d", x, fatorial);
		
		}
		
	}
}

