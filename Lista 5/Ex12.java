/*
 Dalton Augusto Pontes de Santis Filho
 * 
12) Desenvolva um programa em Java que receba o preço de um produto e seu código de
origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
valor final a ser pago pelo produto, conforme tabela a seguir:

 * 
 * 
 */
import java.util.Scanner;

public class Ex12 {
	
	public static void main (String[] args) {
		
		double preco, frete;
		int cod;
		String proc = "";
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o codigo de origem");
		cod = leia.nextInt();
		System.out.println("Digite o valor do produto");
		preco = leia.nextInt();
		
		/*
		if(cod == 1){
			
			proc = "Norte";
			frete = (10 * preco)/100;
			
		}else{
		if(cod == 2 || cod == 5 || cod == 9){
			
			proc = "sul";
			frete = (3 * preco)/100;
			
		}else{
		if(cod == 3 || cod >= 10 && cod <= 15){
			
			proc = "leste";
			frete = (1.2 * preco)/100;
			
		}else{
		if(cod == 7 || cod == 20){
			
			proc = "Oeste";
			frete = (7.3 * preco)/100;
			
		}else{
			proc = "Importado";
			frete = (22.2 * preco)/100;
		}
		}
		}
		}
		*/
		
		
		 switch (cod) {
			 
          case 1:  
			proc = "Norte";
			frete = (10 * preco)/100;
              break;
              
          case 2:
          case 5:
          case 9:
			proc = "sul";
			frete = (3 * preco)/100;
              break;
              
          case 3:  
          case 10: 
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
			proc = "leste";
			frete = (1.2 * preco)/100;
              break;
              
          case 7: 
          case 20:
			proc = "Oeste";
			frete = (7.3 * preco)/100;
              break;
              
          default: 
            proc = "Importado";
			frete = (22.2 * preco)/100;
              break;
      }
      
      
		System.out.printf("\nPreco: R$ %.2f\nProcedencia: %s\nFrete: R$ %.2f\nValor Total: R$ %.2f", preco, proc, frete, (preco + frete));
	}
}

