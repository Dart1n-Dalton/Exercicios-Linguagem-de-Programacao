
/*
 Dalton Augusto Pontes de Santis Filho
 * 
6) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrever o maior deles

 * 
 * 
 */

 import java.util.Scanner;

public class Ex6 {
    
    public static void main (String[] args) {

        Scanner leia = new Scanner (System.in);        

	System.out.println("Insira o Valor");
    int val1 = leia.nextInt();

	System.out.println("Insira o Valor");
    int val2 = leia.nextInt();
		
        
        if (val1 > val2) {
            System.out.println("o maior é o " + val1);
        } else {System.out.println("o maior é o " + val2);}
		
	}

}


