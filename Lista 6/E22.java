/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */

import java.util.Scanner;

public class E22 {
	
	public static void main (String[] args) {
		
		double valor, soma = 0, media, maior = 0;
		int codigo, codigoMaior = 0;
		
		Scanner leia = new Scanner (System.in);
		
		
		for(int i = 1; i <= 5; i++){
			
			System.out.println("insira o codigo do produto");
			codigo = leia.nextInt();
			
			System.out.println("insira o valor do produto");
			valor = leia.nextInt();
			
			soma+= valor;
			
			if(valor > maior){
				
				maior = valor;
				codigoMaior = codigo;
				
			}
			
		}
		
		media = soma / 15;
		
		System.out.printf("o maior preço lido pertence ao produto %d, com valor de R$ %.2f\n a media dos valores dos produtos é de R$ %.2f", codigoMaior, maior, media);
	}
}

