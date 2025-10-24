/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E18 {
	
	public static void main (String[] args) {
		
		int qtd;
		double valor, soma = 0, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o numero de produtos!");
		qtd = leia.nextInt();
		
		for(int i = 1; i <= qtd; i++){
			
			System.out.println("Insira o valor do produto!");
			valor = leia.nextInt();	
			soma+= valor;
			
		}
		media = soma / qtd;
		
		
		System.out.printf("o valor total do estoque é de R$ %.2f\n a media dos valores dos produtos é de R$ %.2f", soma, media);
	}
}

