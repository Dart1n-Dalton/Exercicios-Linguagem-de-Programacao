/*
 Dalton Augusto Pontes de Santis Filho
 * 
10 - Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa
que declare variáveis para representar os seguintes dados: número do pedido, código do produto,
quantidade e valor total da compra. Inicialize essas variáveis com valores apropriados. Por fim,
exiba os valores armazenados.
 * 
 * 
 */
public class Mercado {
    public static void main (String[] args) {
		int numeroPedido = 1137461834;
        int codigoProduto = 693123564;
        short qtdProduto = 25;
        float totalCompra = (float) 250.00;
		System.out.printf("Numero do Pedido: %s\nCódigo do produto: %s\nQuantidade de produtos: %s\nValor Total da Compra: R$ %.2f\n", numeroPedido, codigoProduto, qtdProduto, totalCompra);
		
	}
}
