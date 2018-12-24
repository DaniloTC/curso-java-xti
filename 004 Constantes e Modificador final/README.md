## Constantes e Modificador final

Para analisar mais detalhes sobre os tipos primitivos da linguagem Java veja os comentários que deixei no código-fonte. O é exatamente esse abaixo, porém no arquivo tem comentários com algumas informações importantes.

```java
public class Variavel {
	
	public static void main(String[] args) {
	
		int populacaoBrasileira = 206429773;
		populacaoBrasileira = 123;
		
		final double PI = 3.14159265358979323846;
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		
		System.out.println("CONSTANTE PI   => " + PI);
		System.out.println("SEXO MASCULINO => " + SEXO_MASCULINO);
		System.out.println("SEXO FEMININO  => " + SEXO_FEMININO);
	}
}
```

Fonte com mais exemplos para estudo [idevelopment](http://idevelopment.info/)