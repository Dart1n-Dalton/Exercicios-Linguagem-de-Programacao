
/*
 Dalton Augusto Pontes de Santis Filho
 * 
10) Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total da
vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
salário total.

 * 
 * 
 */

import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] args) {
		
		
		double salario, venda, comissao;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o valor do seu salario");
		salario = leia.nextInt();
		
		System.out.println("Insira o valor da venda");
		venda = leia.nextInt();
		
		if(venda <= 1500){
			
		comissao = (0.3 * venda)/100;
		salario+= comissao;
		System.out.printf("Ganhará um comissão de %.2f. seu salario total será de %.2f", comissao, salario);
			
		}else{
		
		comissao = (0.5 * venda)/100;
		salario+= comissao;
		System.out.printf("Ganhará um comissão de %.2f. seu salario total será de %.2f", comissao, salario);
			
		
		}
	}
}

