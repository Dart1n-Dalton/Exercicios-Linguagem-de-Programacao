
/*
 Dalton Augusto Pontes de Santis Filho
 * 
8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
iniciar em um dia e terminar no dia seguinte.

 * 
 * 
 */

import java.util.Scanner;

public class Ex8 {
	
	public static void main (String[] args) {
		
		int hora0, hora1, duracao;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira, sem os minutos, a hora de inicio do jogo");
		hora0 = leia.nextInt();
		
		System.out.println("Insira, sem os minitos, a hora de termino do jogo");
		hora1 = leia.nextInt();
		
		
		
		if(hora0 == hora1){
			System.out.println("O jogo durou menos de uma hora, ou durou um dia inteiro!");
			
		}else{
		if(hora1 > hora0){ 
				
			duracao = hora1 - hora0;
			System.out.println("O jogo durou " + duracao + " horas!");
			
		}else{
		
			duracao = 24 + (hora1 - hora0);
			System.out.println("O jogo durou " + duracao + " horas!");
			
		}
		}
	}
}


