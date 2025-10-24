
/*
 Dalton Augusto Pontes de Santis Filho
 * 
1) Escreva um programa em Java para ler um valor e escrever a mensagem “É MAIOR QUE
10!” se o valor lido for maior que 10, caso contrário escrever “NÃO É MAIOR QUE 10!”.
 * 
 * 
 */

 import java.util.Scanner;

public class Ex1 {
    
    public static void main (String[] args) {

        

	System.out.println("Insira o Valor");
    Scanner leia = new Scanner (System.in);
    int val = leia.nextInt();
		
        
        if (val >= 10) {
            System.out.println("É maior ou igual a 10");
        } else {System.out.println("É menor que 10");}
		
	}

}


