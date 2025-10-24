/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E34 {
	
	public static void main (String[] args) {
		
		
		int valor, disc;
		Scanner leia = new Scanner (System.in);
		
		
		do{
			
			System.out.println("Insira um valor maior que zero [zero p sair]");
			valor = leia.nextInt();
			
			
			for(int i = 0, x = 0; x <= (valor - 1); i+=x){
				
				System.out.print(i + ", ");
				x++;
			}
			
			
		}while(valor != 0 && valor < 0 );
		
		
		
	}
}

