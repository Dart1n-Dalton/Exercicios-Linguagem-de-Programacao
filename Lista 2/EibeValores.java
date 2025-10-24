/*
 Dalton Augusto Pontes de Santis Filho
 * 
4 - Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazene
em variáveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'.
Utilize sempre o tipo primitivo adequado que ocupe o menor espaço possível. Defina os nomes que
achar mais apropriado para essas variáveis. Por fim, exiba os valores dessas variáveis na saída
padrão.
 * 
 * 
 */
public class EibeValores {
    public static void main (String[] args) {
		byte n1 = 19;
        short n2 = 1571;
        int n3 = 100000;
        long n4 = (long) 2147483648;
        float n5 = (float) 3.14;
        double n6 = 3.141592653589793;
        boolean n7 = true;
        char n8 = 'k';
        
		System.out.printf("Variaveis: %s, %s, %s, %s, %s, %s, %s", n1,n2,n3,n4,n5,n6,n7 );
		
	} 
}
