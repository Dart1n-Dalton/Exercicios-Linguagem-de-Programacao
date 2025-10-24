/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */


public class E30 {
	
	public static void main (String[] args) {
		
		for(int i = 1; i <= 10; i++){
				
			System.out.print("\n " + i + ", ");	
								
			for(int x = 1; x <= (i * 2); x++){
			
			if(i % 2 == 0){
				
				if(x % 2 == 0){System.out.print(x + " ");}
				
			}else{	
				if(x % 2 != 0){System.out.print(x + " ");}	
			}
			
			
			
			}
			
		}
			
	}

}
		
		
		



