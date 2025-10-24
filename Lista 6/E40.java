/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
import java.util.Scanner; 

public class E40 {
	
	public static void main (String[] args) {
		
		
		double valor;
		Scanner leia = new Scanner (System.in);
		
		
		do{
			
			System.out.println("Insira um valor maior que zero [zero p sair]");
			valor = leia.nextInt();
			

			
			for(int i = 1, x = 1; i <= valor; i++){
				
				if(i >= (valor / 2)){
					if(i == (valor / 2)){
						System.out.print(x + ", ");
						System.out.print(x + ", ");
						i++;
						x--;
					}else{
						System.out.print(x + ", ");
						x--;
					}
				}else{
					System.out.print(x + ", ");
					x++;
				}
				
			}

			
		}while(valor != 0 && valor < 0 );
			
		
		
	}
}

