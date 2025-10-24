/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E54 {
	
	public static void main (String[] args) {

	Scanner leia = new Scanner (System.in);
	
	int inicial, ultimo, a = 0, b = 1;
	
	System.out.println("insira o termo inicial");
	inicial = leia.nextInt();
	
	System.out.println("insira o termo final");
	ultimo = leia.nextInt();
	
	for(int i = 1; i <= ultimo; i++){
		
		if(i >= inicial){
			System.out.print(a + ", ");
		}
			int c = a + b;
			a = b;
			b = c;
			
	}



	}
}

