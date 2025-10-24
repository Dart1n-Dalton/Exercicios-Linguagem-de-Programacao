/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner; 

public class E39 {
	
	public static void main (String[] args) {
		
		double soma = 0;
		int valor;
		Scanner leia = new Scanner (System.in);
		
		
		do{
			
			System.out.println("Insira um valor maior que zero [zero p sair]");
			valor = leia.nextInt();
			

			
			for(int i = 1, x = valor; i <= valor; i++){
				
				System.out.print(i + "/" + x + ", ");
				soma+= ((double)i / (double)x);
				x--; 
				
			}
			System.out.printf("\nA soma sa sequencia resulta em %.3f", soma);
			
		}while(valor != 0 && valor < 0 );
			
		
		
	}
}

