/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E20 {
	
	public static void main (String[] args) {
	
	int valor, menor = 0, maior = 0;
	
	Scanner leia = new Scanner (System.in);
	
		for(int i = 1; i <= 100; i++){
			
		System.out.println("insira o valor!");
		valor = leia.nextInt();
		
		if(valor > maior){maior = valor;}
		if(valor < menor){menor = valor;}
		
		}
		
		System.out.printf("o maior numero é o %d, o menor numero é o %d", maior, menor);
		
	}
}

