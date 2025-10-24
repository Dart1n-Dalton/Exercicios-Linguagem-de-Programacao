
/*
 Dalton Augusto Pontes de Santis Filho
 * 
3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra..
 * 
 * 
 */

 import java.util.Scanner;

public class Ex3 {
    
    public static void main (String[] args) {

    double preco; 

	System.out.println("Insira o Valor");
    Scanner leia = new Scanner (System.in);
    int val = leia.nextInt();
		
        
        if (val >= 12) {
            preco = 1.00;
        } else {preco = 1.30;}

		System.out.println("valor unitario = " + preco );
            System.out.println("valor a pagar = " + (preco * val));
	}

}


