import java.util.Scanner;
 
/**
 * Introdução aos pagotes e as entradas de dados pelo teclado.
 * @author Danilo Trindade de Castro
 */

public class EntradaTeclado {
	
	public static void main(String[] args) {
		
		/*
		  No momento da compilação é necessário informar o argumento
		  logo após o comando java EntradaTeclado <argumento>
		*/
		
		//System.out.println(args[0]);
		
		/* 
		   O script abaixo é um pouco mais interativo, pois informa ao 
		   usuário o que precisa ser digitado para ser impresso em forma
		   de pergunta.
		*/
		
		// Criando objeto Scanner
		// É necessário importar o pacote java.util.Scanner
		// System.in é a entrada do sistema
		Scanner teclado = new Scanner(System.in);
		
		// Depois será necessário digitar um parâmetro para o usuário
		// saber o que será impresso. Para isso iremos imprimir uma 
		// pergunta ao usuário para ele saber o que digitar.
		System.out.println("Qual o seu Nome?");
		
		// Armazenando em uma variável a informação digitada pelo usuário.
		String nome = teclado.nextLine();
		
		// Imprimindo resultado final
		// Concatenando string e variável
		System.out.println("Bem vindo " + nome);
	}
}