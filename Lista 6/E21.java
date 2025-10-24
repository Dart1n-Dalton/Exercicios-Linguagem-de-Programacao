/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E21 {
	
	public static void main (String[] args) {
		
		int qtd, valor, media, maior = 0, soma = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("diigte a quantidede de valores a serem lidos");
		qtd = leia.nextInt();
		
		for(int i = 1; i <= qtd; i++){
			
		System.out.println("diigte o valor a ser inserido");
		valor = leia.nextInt();
		
		soma+= valor;
		if(valor >= maior){maior = valor;}
		
		}
		
		media = soma / qtd;
		
		System.out.printf("a media dos numeros lidos eh %d\n o maior numero lido foi %d", media, maior);
		
	}
}

