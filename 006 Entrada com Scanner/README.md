## Entrada de Dados com Scanner

Para ver mais informações sobre o funcionamento da entrada de dados pelo teclado no Java veja o código-fonte, pois eu coloquei alguns comentários que eu considero importantes no passo a passo para entender o conceito.

```java
import java.util.Scanner;
public class EntradaTeclado {
	
	public static void main(String[] args) {
		
		// Criando objeto Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Perguntando ao usuário o que digitar
		System.out.println("Qual o seu nome?");
		
		// Armazenando o valor digitado
		String nome = teclado.nextLine();
		
		// Imprimindo resultado final (concatenação)
		System.out.println("Bem vindo " + nome);
	}
}
```

### Documentation
Saiba mais sobre comandos como ```nextLine()```, ```System.in``` ou ```Scanner``` na documentação disponível em [Java SE 8 Documentation](https://docs.oracle.com/javase/8/docs/)