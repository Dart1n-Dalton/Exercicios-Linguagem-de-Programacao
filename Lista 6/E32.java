/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E32 {
	
	public static void main (String[] args) {
		
		int valor;
		Scanner leia = new Scanner (System.in);
		
		
		do{
			
			System.out.println("Insira um valor maior que zero [zero p sair]");
			valor = leia.nextInt();
			
			
			for(int i = 0; i <= (valor * 2); i+=2){
				
				System.out.print(i + ", ");
			}
			
			
		}while(valor != 0 && valor < 0 );
		
		
		
	}
}

