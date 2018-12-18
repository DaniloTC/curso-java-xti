/**
 * Apresentando básica sobre operadores
 * @author Danilo Trindade de Castro
 */
public class Operador {

	/*
	  OPERADOR         FINALIDADE
	  ---------------------------------------------------------------------------------
	  +,-,*,/,%        Soma, subtrai, multiplica, divide, resto da divisão
	  +                Concatena strings
	  +,-              Operador unário mais e menos
	  <,>,<=,>=        Comparar, menor que, maior que, menor ou igual, maior ou igual
	  ++,--            Pré e pós incremento, pré ou pós decremento
	  ==,!=            Comparar se é igual ou diferente
	  &&,||            Concatenação lógica e, contatecação lógica ou
	  .                Acessar propriedades de um objeto
	  []               Indexar arrays
	  ()               Chamar método ou alterar precedência de operadores
	  ?:               Ternário, retorna booleano em uma expressão
	  <<,>>,>>>        Operar bit numérico
	  ~                Complemento unário sobre bits
	  !                Complemento lógico
	  &,|,^            Operadores bit AND, OR e XoR
	  ,                Separar valores
	  =                Atribuir valor
	  +=,-=,*=,/=      Atribuir valor somando, subtraindo, multiplicando e dividindo
	  <<=,>>=,>>>=     Operador de bytes (unário)
	  &=,|=,^=         Operador de bytes AND, OR, XoR (unário)
	  instanceof       Verifica o tipo do objeto
	  new              Criar objeto
	  (tipo)           Coerção unária
	  ---------------------------------------------------------------------------------
	  Os demais operadores serão usados no decorrer das aulas, enquanto isso navegue 
	  pelos diretórios e observe mais exemplos sendo explorados.
	  ---------------------------------------------------------------------------------
	*/

	public static void main(String[] args) {
		
		/*
		  EXEMPLO DE OPERADOR E OPERANDO
		  Neste caso 2+3 são dois operandos unicos por um operador
		  2 + 3
		  
		  EXEMPLO DE OPERADOR UNARIO
		  Aqui um operador modifica um operando para positivo ou negativo
		  -2
		  
		  EXEMPLO DE OPERADOR TERNARIO
		  Este operador trabalha sobre três operandos (true, "sim" e "não")
		    - true  é a condição lógica (retorna booleano)
		    - "sim" é o resultado (string) se a condição for verdadeira
		    - "não" é o resultado (string) se a condição for falsa
		  
		  true       ? "verdadeiro" : "falso"
		  (5+2 == 7) ? "sim"        : "não";
		  
		  Se a expressão 5+2 for igual a 7 então o bloco "verdadeiro" será
		  executado, se não for igual a 7 então o bloco "falso" será executado.
		*/
		
		// Exemplo 01: operadores +, -, *, /
		int soma       = 9 + 4; // output: 13
		int subtrai    = 9 - 4; // output: 5
		int multiplica = 9 * 4; // output: 36
		int divide     = 9 / 4; // retorna initeiro: 2
		
		System.out.println("9 + 4 => " + soma);
		System.out.println("9 - 4 => " + subtrai);
		System.out.println("9 * 4 => " + multiplica);
		System.out.println("9 / 4 => " + divide);
		
		// Exemplo 02: operador + concatenando
		String concatenaString = "9" + "4"; // concatena duas strings
		System.out.println(concatenaString);
		
		// Exemplo 03: precedência padrão de operadores
		// 1° Multiplicação; 2° Soma ou Subtração
		double precedenciaPadrao  = 7 - 4 + 3 * 2;
		System.out.println(precedenciaPadrao); // output: 9.0
		
		// Exemplo 04: precedência padrão de operadores alterada
		// 1° Subtração e Soma; 2° Multiplicação
		double precedenciaAlterada = (7 - 4 + 3) * 2;
		System.out.println(precedenciaAlterada); // output: 12.0
	}
}

