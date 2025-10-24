
/*
 Dalton Augusto Pontes de Santis Filho
 * 
5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).
 * 
 * 
 */

 import java.util.Scanner;

public class Ex5 {
    
    public static void main (String[] args) {

    int anoAtual, anoNascimento, idade;  
    Scanner leia = new Scanner (System.in);

	System.out.println("Insira o ano atual");
    anoAtual = leia.nextInt();

	System.out.println("Insira a nota de segunda avaliação");
    anoNascimento = leia.nextInt();
		
    idade = anoAtual - anoNascimento; 


        if (idade >= 18) {
            System.out.println("Pode votar");
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("Não pode votar");
            System.out.println("Idade: " + idade);

        }


	}

}


