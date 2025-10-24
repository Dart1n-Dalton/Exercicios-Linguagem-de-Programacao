/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E13 {
	
	public static void main (String[] args) {
		
		int num, soma = 0;
		Scanner leia = new Scanner (System.in);
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println("Insira um numero");
			num = leia.nextInt();
			
			if(num < 40){soma+= num;};
			
			
			
			
		}
		
		System.out.printf("a soma dos numeros inseridos menores que 40 é %d", soma);
		
	}
}

