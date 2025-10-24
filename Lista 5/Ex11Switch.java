/*
 Dalton Augusto Pontes de Santis Filho
 * 
11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
e ‘/’. Calcule e mostre a operação efetuada e o seu resultado.

 * 
 * 
 */

import java.util.Scanner;

public class Ex11Switch {
	
	public static void main (String[] args) {
		
		char operacao;
		double num1, num2, res;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o primeiro valor");
		num1 = leia.nextInt();
		System.out.println("Insira o primeiro valor");
		num2 = leia.nextInt();
		System.out.println("Insira o caracter referente a operacao (+, -, *, /)");
		operacao = leia.next().charAt(0);
		
		
		 switch (operacao) {
          case '+':  
			res = num1 + num2;
              System.out.println("resultado: " + res);
              break;
          case '-':
			res = num1 - num2;
              System.out.println("resultado: " + res);
              break;
          case '*':  
			res = num1 * num2;
                System.out.println("resultado: " + res);
              break;
          case '/': 
			res = num1 / num2;
              System.out.println("resultado: " + res);
              break;
          default: 
              System.out.println("Operação invalida");
              break;
      }
	}
}

