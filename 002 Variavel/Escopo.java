/**
 * Entendendo o conceito de escopo e os locais de acesso das variaveis
 * @author Danilo Trindade de Castro
 */
public class Escopo {
	
	/* ESCOPO E VARIAVEL
	   =========================================================================
	   | Escopo é um bloco de código delimitado por um par de chaves ({}), ele |
	   | define em qual parte do programa a variável será acessível.           | 
	   | O script abaixo apresentará um erro em tempo de compilação por causa  |
	   | do comando de impressão que está fora do bloco tentando imprimir uma  |
	   | variável inicializada dentro de um bloco.                             |
	   =========================================================================
	*/
	
	public static void main(String[] args) {
		// As variaveis que forem declaradas dentro deste bloco
		// nao serao acessiveis fora
		int quantidade = 42;
	}
	System.out.println("quantidade: " + quantidade);
}