
/*
 Dalton Augusto Pontes de Santis Filho
 * 
4) Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
também a média calculada.
 * 
 * 
 */

 import java.util.Scanner;

public class Ex4 {
    
    public static void main (String[] args) {

    double val1, val2, media;  
    Scanner leia = new Scanner (System.in);

	System.out.println("Insira a nota da primeira avaliação");
    val1 = leia.nextInt();

	System.out.println("Insira a nota de segunda avaliação");
    val2 = leia.nextInt();
		
    media = (val1 + val2) / 2; 


        if (media >= 6) {
            System.out.println("nota: " + media);
            System.out.println("Aprovado");
        } else {

            System.out.println("nota: " + media);
            System.out.println("Reprovado");

        }


	}

}


