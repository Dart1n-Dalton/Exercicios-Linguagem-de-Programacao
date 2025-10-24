/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */


public class E47 {
	
	public static void main (String[] args) {
		
		
		for(int x = 1; x <= 100; x++){
			
			boolean teste = true;
			
			for(int i = 2;i <= (x - 1); i++){
			
				if(x % i == 0){
					
					teste = false;
					break;
					}
					
			}
			
			if(teste){
					System.out.print(x + ", ");
				}
		}
	
		
		}
		
		
		
	}


