
/*
 Dalton Augusto Pontes de Santis Filho
 * 
2) Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
(considere o valor zero como positivo).

 * 
 * 
 */

 import java.util.Scanner;

public class Ex2 {
    
    public static void main (String[] args) {

        

	System.out.println("Insira o Valor");
    Scanner leia = new Scanner (System.in);
    int val = leia.nextInt();
		
        
        if (val >= 0) {
            System.out.println("É Positivo");
        } else {System.out.println("É negativo");}
		
	}

}


