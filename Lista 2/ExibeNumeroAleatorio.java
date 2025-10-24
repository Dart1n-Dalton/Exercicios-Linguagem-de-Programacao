/*
 Dalton Augusto Pontes de Santis Filho
 * 
2 - Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em Java que
gere um número real aleatório entre 0 e 100. Esse número deve ser armazenado em uma variável do
tipo double chamada numeroAleatorio. Por fim, exiba o valor dessa variável na saída padrão.
 * 
 * 
 */

import java.util.Random;

public class ExibeNumeroAleatorio {
    
	public static void main (String[] args) {
		Random random = new Random();
        double numeroAleatorio = random.nextDouble(101);
		System.out.printf("Numero: %.2f", numeroAleatorio);
		
	}
}
