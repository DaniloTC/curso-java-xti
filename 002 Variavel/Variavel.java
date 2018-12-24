/**
 * Apresentando os conceitos de Variável
 * @author Danilo Trindade de Castro
 */
public class Variavel {
	
	public static void main(String[] args) {
		
		/* INTRODUÇÃO */
		
		/* 
		 * String
		 * 
		 * Existem duas formas de declarar variáveis:
		 * 
		 * PRIMEIRA FORMA
		 * 
		 * 1. Tipo nome_da_variavel = "valor_da_variavel";
		 * Exemplo: String nome = "Danilo";
		 * 
		 * SEGUNDA FORMA
		 * 
		 * Declarando a variável sem inicializa-la
		 * 2. Tipo nome1, nome2, nome3, ...;
		 *
		 * Inicializando sem a necessidade de informar o tipo
		 * 2.1. nome1 = valor1;
		 * 2.2. nome2 = valor2;
		 * 
		 * Exemplo
		 *
		 * DECLARANDO
		 * String nome, segundoNome, ultimoNome;
		 *
		 * INICIALIZANDO
		 * nome = "Danilo";
		 * segundoNome = "Trindade";
		 * ultimoNome = "Castro";
		 */
		
		// STRING
		// String nome; // variavel declarada
		// nome = "Danilo" // variavel inicializada
		String nome = "Danilo";
		
		// INTEIRO (int)
		// int idade; // variavel declarada
		// idade = 31; // variavel inicializada
		int idade = 31;
		
		// BOOLEANO (true, false)
		// boolean casado; // variavel declarada
		// casado = true/false; // variavel inicializada
		boolean casado = true;
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(casado);
	}
}