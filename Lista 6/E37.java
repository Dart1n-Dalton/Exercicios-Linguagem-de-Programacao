/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner; 

public class E37 {
	
	public static void main (String[] args) {
		
		
		int valor;
		Scanner leia = new Scanner (System.in);
		
		
		do{
			
			System.out.println("Insira um valor maior que zero [zero p sair]");
			valor = leia.nextInt();
			
			System.out.print("1, ");
			
			for(int i = 1, x = 2; i <= (valor - 1); i++){
				
				System.out.print(i + "/" + x + ", ");
				x++; 
			}
			
			
		}while(valor != 0 && valor < 0 );
			
		
		
	}
}

