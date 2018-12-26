## Constantes e Modificador final

Para analisar mais detalhes sobre as Classes Wrapper da linguagem Java veja os comentários que deixei no código-fonte. O código é simples, porém no arquivo chegou a 119 linhas porque tem  vários comentários com informações importantes.

```java
public class Variavel {
	
	public static void main(String[] args) {
		
		// Objeto
		Integer idade = new Integer("31");
		
		// Convertendo objeto Integer acima para tipos primitivo
		int    idadeConvertidaParaInt    = idade.intValue();
		double idadeConvertidaParaDouble = idade.doubleValue();
		float  idadeConvertidaParaFloat  = idade.floatValue();
		
		// Imprimindo valores convertidos para tipos primitivos
		System.out.println("Primitivo int    => " + idadeConvertidaParaInt);
		System.out.println("Primitivo double => " + idadeConvertidaParaDouble);
		System.out.println("Primitivo float  => " + idadeConvertidaParaFloat);
	}
}
```

Documentação Java 8 [javadoc](https://docs.oracle.com/javase/8/docs/) and [api](https://docs.oracle.com/javase/8/docs/api/)

Fonte com mais exemplos para estudo [idevelopment](http://idevelopment.info/)