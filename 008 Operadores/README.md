# Operadores

Operadores unários são operadores que envolvem apenas um operando, diferentemente da maioria dos operadores, que envolvem dois operandos.

## Operadores Unários

Descrição|Operador|
---------|--------|
Negação|!|
Pré e pós incremento|++|
Pré e pós decremento|--|
Sinal positivo|+|
Sinal negativo|-|
Inversão de bits|~|

## Operador de negação: !

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

## Operador de incremento e decremento: ++, --

Os operadores "++" e "--" são chamados operadores de ```incremento``` e ```decremento``` respectivamente. Estes operadores modificam o valor de uma expressão adicionando ou subtraindo 1.

__Operadores de incremento podem ser:__
* Pós-fixados: O incremento ou decremento é feito após o uso da variável nas outras expressões que envolvem a variável em questão.
* Pré-fixados: O incremento ou decremento é realizado antes que a variável seja utilizada em qualquer operação.

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