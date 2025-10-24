/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E51 {
	
	public static void main (String[] args) {

	Scanner leia = new Scanner (System.in);
	
	int qtd, a = 0, b = 1;
	
	System.out.println("insira o numero de termos");
	qtd = leia.nextInt();
	
	for(int i = 1; i <= qtd; i++){
		
			System.out.print(a + ", ");
			int c = a + b;
			a = b;
			b = c;
			
	}



	}
}

