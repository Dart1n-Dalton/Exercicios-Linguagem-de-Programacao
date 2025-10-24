/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E19 {
	
	public static void main (String[] args) {
		
		char resp = 'n';
		double valor, soma = 0, media;
		int cont = 0;
		
		Scanner leia = new Scanner (System.in);
		

		do{		
			cont++;
			System.out.println("Insira o valor do produto!");
			valor = leia.nextInt();	
			soma+= valor;
			
			
			System.out.println("Mais mercadorias? (s/n)");
			resp = leia.next().charAt(0);	
			
			media = soma / cont;
		}while(resp == 's');
		
		System.out.printf("o valor total do estoque é de R$ %.2f\n a media dos valores dos produtos é de R$ %.2f", soma, media);
	}
		
		
	}



