## Entrada de Dados com Scanner

Após olhar o código abaixo e o cógigo-fonte com alguns comentários sugiro que explore a documentação da linguagem Java para conhecer mais possibilidades que o pacote JOptionPane pode proporcionar.

```java
// Importando pacote necessáriio
import javax.swing.JOptionPane;

public class EntradaTeclado {
	
	public static void main(String[] args) {
		
		// Retorna string
		String nome = JOptionPane.showInputDialog("Qual o seu Nome?");
		
		// Imprimindo no console
		System.out.println(nome);
		
		// Imprimindo em janela
		JOptionPane.showMessageDialog(null, nome);
	}
}
```

### Documentation
Explore a documentação [Java SE 8 Documentation](https://docs.oracle.com/javase/8/docs/)