/*
 Dalton Augusto Pontes de Santis Filho
 * 
 */
 import java.util.Scanner;

public class E35 {
	
	public static void main (String[] args) {
		
		
		int valor;
		Scanner leia = new Scanner (System.in);
		
		
		do{
			
			System.out.println("Insira um valor maior que zero [zero p sair]");
			valor = leia.nextInt();
			
			
			for(int i = 1, x = 1; i <= valor;){
				
				if(i >= 2){
					if(x > 0){
						x = x * -1;	
					}else{
						x = (x * -1) + 1;	
					}
				}
				System.out.print(x + ", ");
				i++;
			}
			
			
		}while(valor != 0 && valor < 0 );
		
		
		
	}
}

