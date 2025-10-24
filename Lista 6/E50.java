/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner;

public class E50 {
	
	public static void main (String[] args) {
		
		int valor, inicial;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("insira o numero de termos");
		valor = leia.nextInt();
		
		System.out.println("insira o numero inicial");
		inicial = leia.nextInt();
		
		String saida = "";
		
		for(int x = inicial, y = 1; y <= valor; x++){
			
			boolean teste = true;
			
			
			for(int i = 2;i <= (x - 1); i++){
			
				if(x % i == 0){
					
					teste = false;
					break;
					}
					
			}
			
				if(teste){
					saida+= (x + ", ");
					y++;
				}
			
		}
			System.out.print(saida);
		
		}
		
		
		
	}


