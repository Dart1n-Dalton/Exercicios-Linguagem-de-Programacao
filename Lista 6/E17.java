/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E17 {
	
	public static void main (String[] args) {
		
		char resp = 'n';
		double a1, a2, media;
		Scanner leia = new Scanner (System.in);
		
		do{
	
		System.out.println("insira a primeria nota");
		a1 = leia.nextInt();
		
		System.out.println("insira a segunda nota");
		a2 = leia.nextInt();
		
		media = (a1 + a2) / 2;
		
		System.out.println("media: " + media);
		System.out.println("Gostaria de realizar outro calculo? (s/n)");
		resp = leia.next().charAt(0);
		
		
		
		}while(resp == 's');
		
		
	}
}

