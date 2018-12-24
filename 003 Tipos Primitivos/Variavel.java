/**
 * Apresentar os conceitos de Variável
 * @author Danilo Trindade de Castro
 */
public class Variavel {
	
	/*
		TIPOS PRIMITIVOS (Cronograma)
		
		. Tipos e Tamanhos
		
		  int    byte   short
		  long   float  double
		  char   void   boolean
		
		. Cast de Tipo
		
		. IEEE e Unicode
	*/
	
	public static void main(String[] args) {
		
		/* TIPOS PRIMITIVOS */
		
		int idade      = 31;
		char sexo      = 'M'; //Unicode
		double preco   = 12.45;
		boolean casado = true;
		
		/*	TAMANHO DOS TIPOS PRIMITIVOS
			========================================================================
			| TIPO		VALOR MINIMO			VALOR MAXIMO			   TAMANHO |
			========================================================================
			| byte		-128 					127						   1 byte  |
			| short		-32768  				32767					   2 bytes |
			| int		-2147483648 			2147483647				   4 bytes |
			| long		-9223372036854775808L   9223372036854775807L	   8 bytes |
			========================================================================
			| double	1.4 elevado a -45		3.4 elevado a 38		   4 bytes |
			| float		4.9 elevado a -324		1.7 elevado a 308		   8 bytes |
			========================================================================
		*/
		
		byte varByte     		  = 127; // cem
		short varShort    		  = 32767; // 32 mil
		int varInt        		  = 2_000_000_000; // 2 bilhões
		long varLong      		  = 9_000_000_000_000_000_000L; // 9 quintilhões
		long varLongComValorMenor = 9_000_000L; // Long definido com tamanho menor que int
		
		/* PADRÃO IEEE 754
		   Esse padrão mostra como os números com ponto flutuante (double e float) devem
		   ser tratados pelo computador. Além disso, a letra no final do valor serve para
		   indicar a qual tipo um valor pertence (F para float), (D para double).
		*/
		
		double varDouble  = 1.7976931348623157E+308d; // Padrão IEEE 754
		float varFloat    = 123f;
		
		/*	CONVERTENDO VARIAVEIS (Parte 1)
		
			*** Cast Implícito ***
			
			É possível colocar uma variável dentro de outra desde que o valor de origem seja menor
			do que o valor de destino para esse tipo de conversão. Essa conversão consiste em colocar
			o valor de uma variável do tipo menor dentro de outra variável do tipo maior, por exemplo.
			Nesse tipo de conversão um cabe dentro do outro e por isso esse tipo de Cast é conhecido
			como Implícito, pois não há necessidade de informar essa conversão para o Java usando (<tipo>).
		*/
		
		//varInt = varShort; //Cast Implícito
		//System.out.println(varShort); // tipo maior com valor menor armazenado
		//System.out.println(varInt);       // colocado dentro de um tipo menor
		
		/*	CONVERTENDO VARIAVEIS (Parte 2)
		
			*** Cast Explícito ***
			
			É possível colocar uma variável dentro de outra desde que essa conversão seja informada 
			para o Java e ele possa realizar esse trabalho tranquilamente e com o seu concentimento.
			Esse tipo de conversão consiste em colocar o valor de uma variável do tipo maior dentro de
			outra variável do tipo menor.
			Nesse tipo de conversão um não cabe dentro do outro e por isso esse tipo de Cast é conhecido
			como Explícito, pois há a necessidade de deixar explícito que o programador realmente quer
			realizar essa conversão, mesmo que isso signifique perda de valores.
		*/
		
		/* UM TIPO NAO CABE DENTRO DO OUTRO, POR ISSO HA PERDA DE VALOR */
		
		//varInt = (int) varLong; // Necessário forçar a conversão com (<tipo>)
		//System.out.println(varLong); // tipo maior
		//System.out.println(varInt);  // colocado dentro de um tipo menor
		
		/* UM TIPO NAO CABE DENTRO DO OUTRO, MAS O VALOR SIM, POR ISSO, NAO HA PERDA DE VALOR */
		
		//varInt = (int) varLongComValorMenor; // Agora um cabe dentro do outro (há perda de valor)
		//System.out.println(varInt);
		//System.out.println(varLongComValorMenor);
		
		/*	SISTEMA DE NUMERACAO BINARIO
			
			Para representar um valor no formato binário é preciso iniciar o valor da variável
			com os caracteres'0b', dessa forma o computador saberá que esse valor é do tipo
			binário.
			
			=======================================================================
			| TIPO		VALOR BINARIO								 TAMANHO      |
			| byte		0b01010101								8 bits  / 1 byte  |
			| short		0b0101010101010101						16 bits / 2 bytes |
			| int		0b01010101010101010101010101010101		32 bits / 4 bytes |
			=======================================================================
		*/
		
		byte varByteBinary   = 0b01010101;
		short varShortBinary = 0b0101010101010101;
		int varIntBinary     = 0b01010101010101010101010101010101;
		
		System.out.println("VALORES BINARIOS CONVERTIDOS EM DECIMAL");
		System.out.println("byte  => " + varByteBinary);
		System.out.println("short => " + varShortBinary);
		System.out.println("int   => " + varIntBinary);
	}
}