public class Operador {
	/*
	  OPERADORES MATEMATIVOS
	  
		+      Adição
		-      Subtração
		*      Multiplicação
		/      Divisão
		+      Positivo
		-      Negativo
		++     Incremento +1
		--     Decremento -1
	*/
	public static void main(String[] args) {
		//Declarando as variáveis
		double x1  = 7 + 3; //soma
		double x2  = 7 - 3; //subtrai
		double x3  = 7 * 3; //multiplica
		double x4  = 7 / 3; //divide
		double x5  = +7;    //afirma que o número é positivo
		double x6  = -7;    //inverte o sinal
		double x7  = -(+7); //regra matemática
		double x8  = 7 % 2; //resto da divisão
		
		//Declarando, incremento e decremento os valores
		double x9  = 7;     //variavel declarada e com valor atribuido
		double x10 = 7;     //variavel declarada e com valor atribuido
		++x9;               //pré-incremento em +1 na variavel 'x9'
		--x10;              //pós-decremento em -1 na variavel 'x10'
		
		//Imprimindo os resultados
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		System.out.println(x7);
		System.out.println(x8);
		System.out.println(x9);
		System.out.println(x10);
	}
}
