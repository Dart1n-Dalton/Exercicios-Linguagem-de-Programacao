/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E15 {
	
	public static void main (String[] args) {
		
		
		
		
		
		
			int num1, num2;
		String lista = "";
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o primeiro valor");
		num1 = leia.nextInt();
		System.out.println("Insira o segundo valor");
		num2 = leia.nextInt();
		
		
		if(num1 > num2){
			
			int reserva;
			
			reserva = num1;
			num1 = num2;
			num2 = reserva;
			
		}
		
		
		for(int i = num1; i <= num2; i++){
			
		lista+= (i + " ");
			
	}
	
	System.out.println(lista);
		
}
}
