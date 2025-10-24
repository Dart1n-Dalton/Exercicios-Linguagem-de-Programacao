
/*
 Dalton Augusto Pontes de Santis Filho
 * 
9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

 * 
 * 
 */


import java.util.Scanner;

public class Ex9 {
	
	public static void main (String[] args) {
		
		double salarioPorHora, salarioT, acrescimo, horasMes, horasSemanal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("insira o valor do salario por hora.");
		salarioPorHora = leia.nextInt();
		
		System.out.println("insira o numero de horas trabalhadas no mês.");
		horasMes = leia.nextInt();
		horasSemanal = horasMes / 4;
		
		if(horasSemanal > 40){
			
		acrescimo = (horasSemanal - 40) * (salarioPorHora / 2);
		salarioT = (horasMes * salarioPorHora) + acrescimo;
		System.out.printf("o valor do salario mensal é de: R$%.2f . com um acrescimo de R$%.2f", salarioT, acrescimo);
		
		} else {
			
		salarioT = (horasMes * salarioPorHora);
		System.out.printf("o valor do salario mensal é de: R$%.2f", salarioT);
				
		}
		
		
	}
}

