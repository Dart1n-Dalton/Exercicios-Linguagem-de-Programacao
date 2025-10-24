/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E10 {
	
	public static void main (String[] args) {
		
		int quant = 0, num, soma = 0, media;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira a quantidade de alunos na turma");
		quant = leia.nextInt();
		
		for(int i = 1; i <= quant; i++){
			
			System.out.println("Insira um numero");
			num = leia.nextInt();
			soma+= num;
			
		}
		
		media = soma / quant;
		
		System.out.printf("a media dos numeros inseridos é %d", media);
		
	}
}

