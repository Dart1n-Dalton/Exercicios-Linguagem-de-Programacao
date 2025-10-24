/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E23 {
	
	public static void main (String[] args) {
		
		double salario, maiorSalario = 0, mediaSalario, somaSalario = 0, percentual;
		int numFilhos, mediaFilhos = 0, somaFilhos = 0, qtd = 0, salarioCont = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("insira o numero de leituras a serem feitas");
		qtd = leia.nextInt();
		
		for(int i = 1; i <= qtd; i++){
			
		System.out.println("\ninsira o valor do salario");
		salario = leia.nextInt();
			
		System.out.println("insira o numero de filhos");
		numFilhos = leia.nextInt();	
		
		somaSalario+= salario;
		somaFilhos+= numFilhos;
			
		if(salario > maiorSalario){maiorSalario = salario;}
		if(salario < 150){salarioCont++;}
			
		}
		mediaSalario = somaSalario / qtd;
		mediaFilhos = somaFilhos / qtd;
		percentual = ((double)salarioCont / (double)qtd) * 100;
		
				
		System.out.printf("\na media salarial da populacao eh de R$ %.2f\n a media de numero de filhos eh de %d\no maior salario dos haabitantes eh de R$ %.2f\no percentual de pessoas com salario menor que R$ 150,00 eh de %.1f porcento", mediaSalario, mediaFilhos, maiorSalario, percentual);
	}
}

