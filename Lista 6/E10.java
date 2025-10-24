/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E10 {
	
	public static void main (String[] args) {
		int num, soma = 0, media;
		Scanner leia = new Scanner (System.in);
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println("Insira um numero");
			num = leia.nextInt();
			soma+= num;
			
		}
		
		media = soma / 10;
		
		System.out.printf("a media dos numeros inseridos é %d", media);
		
	}
}

