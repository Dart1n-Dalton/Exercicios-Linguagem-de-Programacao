/*
 Dalton Augusto Pontes de Santis Filho
 * 
7 – Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo. 
Faculdade de Tecnologia de Guaratinguetá – Prof. João Mod
www.fatecguaratingueta.edu.br - e-mail: fatecgt@fatecguaratingueta.edu.br
Av. Prof. João Rodrigues Alckmin, 1501 – Jardim Esperança, Guaratinguetá – SP / CEP 12517-475
Tel. (12) 3126-3921 - 3125-7785 - 3126-4849
a. "Bom dia" 
b. 3 
c. 235.13 
d. true 
e. -135 
f. 256.23F 
g. 'A' 
h. 6463275245745L 
Obs: faça os testes necessários com um programa escrito em Java para identificar os tipos.
 * 
 * 
 */
public class IndiqueValores {
    public static void main (String[] args) {
		
		String a = "Bom dia";
        byte b = 3;
        float c = (float) 235.13;
        boolean d = true;
        short e = -135;
        double f = 256.23F;
        char g = 'a';
        long h =  6463275245745L;

        System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s,", a,b,c,d,e,f,g,h);


		
	}
}
