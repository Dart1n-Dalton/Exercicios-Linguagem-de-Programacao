/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E46 {
	
	public static void main (String[] args) {
		
		int valor;
		boolean teste = true;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor a ser testado");
		valor = leia.nextInt();
		
		for(int i = 2;i <= (valor - 1); i++){
		
			if(valor % i == 0){
				
				teste = false;
				break;
			}
			
		}
		
		if(teste == true){	
			System.out.println("é primo");
		}else{
			System.out.println("não é primo");
		}
		
		
	}
}

