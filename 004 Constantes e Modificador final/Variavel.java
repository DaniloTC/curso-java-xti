/**
 * Apresentar os conceitos de Variáveis
 * @author Danilo Trindade de Castro
 */
public class Variavel {
	
	public static void main(String[] args) {
		
		/* REGRA PARA VARIAVEIS
		   1. A variável deve ser escrita com letra minúscula.
		   2. Se for nome composto, usar o padrão camel case.
		   3. As variáveis podem ser modificadas.
		*/
		
		int populacaoBrasileira = 206429773;
		populacaoBrasileira = 123;
		
		/* REGRA PARA CONSTANTES
		   1. Usando o modificador 'final' a constante não pode ser alterada.
		   2. Elas devem ser escritas com letras MAIUSCULAS.
		   3. Se for nome composto usar underline para separar o NOME_COMPOSTO.
		*/
		
		final double PI = 3.14159265358979323846;
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		
		System.out.println("CONSTANTE PI   => " + PI);
		System.out.println("SEXO MASCULINO => " + SEXO_MASCULINO);
		System.out.println("SEXO FEMININO  => " + SEXO_FEMININO);
	}
}