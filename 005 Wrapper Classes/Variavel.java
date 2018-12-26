/**
 * Entendendo as Classes Wrapper
 * @author Danilo Trindade de Castro
 * ============================================
 * Documentation Java 8 Online
 * https://docs.oracle.com/javase/8/docs/
 * https://docs.oracle.com/javase/8/docs/api/
 * 
 * Documentation Java 8 for download
 * https://www.oracle.com/technetwork/java/javase/documentation/jdk8-doc-downloads-2133158.html
 * 
 */
public class Variavel {
	
	public static void main(String[] args) {
		
		/* OBSERVACAO SOBRE AS CLASSES WRAPPER
		   |===========================================================|
		   |Para cada tipo primitivo do Java existe uma classe wrapper |
		   |equivalente, como podemos observar na tabela abaixo.       |
		   |===========================================================|
		   |TIPO PRIMITIVO                                WRAPPER CLASS|
		   |===========================================================|
		   |char ........................................ Character    |
		   |byte ........................................ Byte         |
		   |short ....................................... Short        |
		   |long ........................................ Long         |
		   |float ....................................... Float        |
		   |double ...................................... Double       |
		   |boolean ..................................... Boolean      |
		   |===========================================================|
		*/
		
		/* CRIANDO UM OBJETO 
		   |===========================================================|
		   | Para criar um objeto utilizamos a seguinte estrutura:     |
		   | 1. Classe Wrapper                                         |
		   | 2. Nome do objeto                                         |
		   | 3. Palavra reservada 'new' após o operador '='            |
		   | 4. Objeto com ou sem valor entre parênteses               |
		   |                                                           |
		   | Exemplo:                                                  |
		   | Integer idade = new Integer(<valor_numerico>)             |
		   |===========================================================|
		   | Veremos mais detalhes sobre objeto em aulas futuras       |
		   |===========================================================|
		*/
		
		Integer idade = new Integer(31);
		
		/* OBSERVACAO SOBRE A CONVERSAO DE VALORES 
		   |=======================================================|
		   | Só é possível converter valores de um tipo para outro |
		   | se o valor a ser convertido estiver armazenado dentro |
		   | de uma classe wrapper.                                |
		   | Após criar um objeto e nele armazenar valor, podemos  |
		   | utilizar alguns métodos para recuperar esses valores  |
		   | e converte-los de Wrapper para um outro tipo de dado. |
		   |=======================================================|
		   |                    ALGUNS METODOS                     |
		   |=======================================================|
		   | doubleValue()                                         |
		   | intValue()                                            |
		   | byteValue()                                           |
		   | floatValue()                                          |
		   |=======================================================|
		*/
		
		// CRIANDO OBJETO, PASSANDO VALOR E ATRIBUINDO A UMA WRAPPER
		Double preco   = new Double("12.45");
		Boolean casado = new Boolean("true");
		
		// CONVERTENDO O VALOR DO OBJETO 'Double' PARA OUTROS TIPOS PRIMITIVOS
		double valorConvertidoParaPrimitivoDouble   = preco.doubleValue();
		float valorConvertidoParaPrimitivoFloat     = preco.floatValue();
		int valorConvertidoParaPrimitivoInt         = preco.intValue();
		byte valorConvertidoParaPrimitivoByte       = preco.byteValue();
		boolean valorConvertidoParaPrimitivoBoolean = casado.booleanValue();
		
		// IMPRIMINDO O VALOR CONVERTIDO EM OUTROS TIPOS PRIMITIVOS
		System.out.println("CONVERSAO WRAPPER TO PRIMITIVE");
		System.out.println("double  : " + valorConvertidoParaPrimitivoDouble);
		System.out.println("float   : " + valorConvertidoParaPrimitivoFloat);
		System.out.println("int     : " + valorConvertidoParaPrimitivoInt);
		System.out.println("byte    : " + valorConvertidoParaPrimitivoByte);
		System.out.println("boolean : " + valorConvertidoParaPrimitivoBoolean);
		
		/* CONVERSAO ESTATIVA - Assunto com mais detalhes em aulas futuras
		   |=================================================================|
		   | É possivel converter um valor vindo de uma classe wrapper para  |
		   | outro tipo de dado primitivo. Para isso, é necessário utilizar  |
		   | alguns métodos conhecidos como Métodos Estátivos do java.       |
		   |=================================================================|
		   | Abaixo iremos converter valores sem a necessidade de criar um   |
		   | novo objeto e para isso será usado os métodos estátivos.        |
		   |=================================================================|
		*/
		
		// CONVERSAO ESTATICA
		// Suponha que estes valores estejam sendo informados diretamente aqui
		// com o tipo string.
		int stringConvertidaParaInt       = Integer.parseInt("123");
		double stringConvertidaParaDouble = Double.parseDouble("123.45");	
		float stringConvertidaParaFloat   = Float.parseFloat("3.14F");
		
		// IMPRIMINDO OS VALORES DA CONVERSAO ESTATIVA
		System.out.println("CONVERSAO WRAPPER TO PRIMITIVE");
		System.out.println("int     : " + stringConvertidaParaInt);
		System.out.println("double  : " + stringConvertidaParaDouble);
		System.out.println("float   : " + stringConvertidaParaFloat);
		
		// Conversão de um binário
		// valueOf(param1, param2)
		// O parâmetro 1 é o valor binário, o parâmetro 2 é a base de conversão
		int stringBinariaConvertidaParaInt = Integer.valueOf("101011", 2); //Output:43
		System.out.println("CONVERSAO BINARY TO PRIMITIVE");
		System.out.println("binary \'101011\' => " + stringBinariaConvertidaParaInt);
	}
}