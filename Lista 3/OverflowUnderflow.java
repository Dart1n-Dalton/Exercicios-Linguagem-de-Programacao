/*
 Dalton Augusto Pontes de Santis Filho
 * 
1 - Implemente um programa em linguagem de programação Java. Esse programa
deve exibir a mensagem Hello World na saída padrão. O código fonte desse programa
deve ser armazenado em um arquivo chamado HelloWorld.java.
public class OverflowUnderflow {
 public static void main(String[] args) {
 System.out.println( xxxxx + 1);
 System.out.println( xxxxx - 1);
 }
}

 * 
 * 
 */

public class OverflowUnderflow {
    public static void main(String[] args) {


        System.out.println( (int)2147483647 + 1);
        System.out.println( (int)-2147483648 - 1);
        }
       
}
