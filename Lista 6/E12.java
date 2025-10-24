/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E12 {
	
	public static void main (String[] args) {
		
		int num, soma = 0;
		Scanner leia = new Scanner (System.in);
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println("Insira um numero");
			num = leia.nextInt();
			soma+= num;
			
		}
		
		System.out.printf("a soma dos numeros inseridos é %d", soma);
		
	}
}

