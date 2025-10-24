/*
 Dalton Augusto Pontes de Santis Filho
 * 
9 - Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que
declare uma variável de cada um dos tipos primitivos da linguagem Java. Essas variáveis devem ser
inicializadas com valores adequados. Por fim, exiba os valores dessas variáveis na saída padrão
 * 
 * 
 */
public class TestaTiposPrimitivos {
    public static void main (String[] args) {
		byte n1 = 19;
        short n2 = 1571;
        int n3 = 100000;
        long n4 = 214748368;
        float n5 = (float) 3.14;
        double n6 = 3.141592653589793;
        boolean n7 = true;
        char n8 = 'k';
		System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s", n1,n2,n3,n4,n5,n6,n7,n8);
		
	}
}
