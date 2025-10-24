/*
 *
 * Dalton Augusto Pontes de Santis Filho 
 * 
 */

import java.util.Scanner;

public class E25  {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a senha");
		String senha = leia.nextLine(), simbolo = "!@#$%&*()+", letra = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", numero = "0123456789";
 
			int simboloC = 0, letraC = 0, numeroC = 0;

				for(int i = 0; i < senha.length(); i++){
				
					for(int x = 0; x < simbolo.length(); x++){
						if(senha.charAt(i) == simbolo.charAt(x)){
							simboloC++;
						}
					}
					for(int y = 0; y < letra.length(); y++){
						if(senha.charAt(i) == letra.charAt(y)){
							letraC++;
						}
					}
					for(int z = 0; z < numero.length(); z++){
						if(senha.charAt(i) == numero.charAt(z)){
							numeroC++;
						}
					}
				}
				
				if(senha.length() >= 10 && simboloC >= 2 && letraC >= 3 && numeroC >= 3){
					System.out.println("Senha aprovada! Parabens!");
				}else{
					System.out.println("Senha reprovada! Tente novamente");
				}
				
		
	}
}

