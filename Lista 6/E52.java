/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
 
import java.util.Scanner;

public class E52 {
	
	public static void main (String[] args) {

	Scanner leia = new Scanner (System.in);
	
	int valor, a = 0, b = 1;
	
	System.out.println("insira o numero de termos");
	valor = leia.nextInt();
	
	for(int i = 1; i <= valor; i++){
		
			int c = a + b;
			a = b;
			b = c;
			
			if(a == valor){
				
				System.out.print(valor + " pertence");
				break;
			}else{
				if(i == valor){
						System.out.print(valor + " Nao pertence");
				}
					
			}
			
	}

		

	}
}

