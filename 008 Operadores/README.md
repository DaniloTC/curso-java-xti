# Operadores

Operadores unários são operadores que envolvem apenas um operando, diferentemente da maioria dos operadores, que envolvem dois operandos.

## Operadores Unários

N|Descrição|Operador|
-|---------|--------|
1|Negação|!|
2|Pré e pós incremento|++|
3|Pré e pós decremento|--|
4|Sinal positivo|+|
5|Sinal negativo|-|
6|Inversão de bits|~|

## 1. Operador de negação: !

Conhecido como operador de ```negação``` ou ```complemento```, pois é utilizado para inverter o valor de uma expressão booleana. Então uma expressão ```!falsa``` resulta em ```true```, enquanto a expressão ```!true``` resulta em ```false```.

```java
public class TesteOperadorNot {
	public static void main(String[] args) {
		
		boolean ok = true;
		System.out.println("ok = " + ok);
		
		boolean notOk = !ok;
		System.out.println("!ok = " + notOk);
	}
}
```

## 2, 3. Operador de incremento e decremento: ++, --

Os operadores "++" e "--" são chamados operadores de ```incremento``` e ```decremento``` respectivamente. Estes operadores modificam o valor de uma expressão adicionando ou subtraindo 1.

__Operadores de incremento podem ser:__
* Pós-fixados: O incremento ou decremento é feito após o uso da variável nas outras expressões que envolvem a variável em questão.
* Pré-fixados: O incremento ou decremento é realizado antes que a variável seja utilizada em qualquer operação.

```java
public class TesteOperadorIncrementoDecremento {
	public static void main(String[] args) {
		
		/* Operadores pós-fixados */
		
		// Incremento
		int i = 5;
		System.out.println("i = " + i++); // Output: 5
		
		// Decremento
		int y = 5;
		System.out.println("y = " + y--); // Output: 5
		
		/* Operadores pré-fixados */
		
		// Incremento
		int ii = 5;
		System.out.println("ii = " + ++ii); // Output: 6
		
		// Decremento
		int yy = 5;
		System.out.println("yy = " + --yy); // Output: 4
	}
}
```

## 4, 5. Operadores de representação de sinal: + e -

Os operadores unários + e - representam positivo e negativo respectivamente. O operador + não tem outra função a não ser deixar explícito que um número é positivo.

__Exemplo:__
* int x = -3;
* int z = +3; // z = 3 seria exatamenta igual.

## 6. Operador de inversão: ~

Conhecido como ```Betwise Inversion Operator``` (operador de inversão de bits) converte todos os bits 1 em 0 e todos os bit 0 em 1.

__Observação:__ Para obtenção do resultado da inversão bit a bit de um número inteiro basta somar um e inverter o sinal.

__Exemplo:__
* int resultado = ~7   ==> resultado = 7 + 1 invertendo o sinal = -8
* int resultado = ~-19 ==> resultado = -19 + 1 invertendo o sinal = 18

Operadores|Finalidade|
----------|----------|
| ```+,-,*,/,%``` |Soma, subtrai, multiplica, divide, resto da divisão|
| ```+``` |Concatena strings|
| ```+,-``` |Operador unário mais e menos|
| ```<,>,<=,>=``` |Comparar, menor que, maior que, menor ou igual, maior ou igual|
| ```++,--``` |Pré e pós incremento, pré ou pós decremento|
| ```==,!=``` |Comparar se é igual ou diferente|
| ```.``` |Acessar propriedades de um objeto|
| ```[]``` |Indexar arrays|
| ```()``` |Chamar método ou alterar precedência de operadores|
| ```?:``` |Ternário, retorna booleano em uma expressão|
| ```<<,>>,>>>``` |Operar bit numérico|
| ```~``` |Complemento unário sobre bits|
| ```!``` |Complemento lógico|
| ```,``` |Separar valores|
| ```=``` |Atribuir valor|
| ```+=,-=,*=,/=``` |Atribuir valor somando, subtraindo, multiplicando e dividindo|
| ```<<=,>>=,>>>=``` |Operador de bytes (unário)|
| ```instanceof``` |Verifica o tipo do objeto|
| ```new``` |Criar objeto|
| ```(tipo)``` |Coerção unária|

### Documentation
Explore a documentação [Java SE 8 Documentation](https://docs.oracle.com/javase/8/docs/)