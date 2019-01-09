import java.util.Arrays;
import java.util.Collections;
public class ArraySimples {
    public static void main (String[] args) {
        
        /* ARRAY DE STRING 
        ----------------------------------------------------------------------- */

        // Criando Array de Strings
        String[] paises = {"Brasil", "Russia", "India", "China"};

        // Acessando elementos no array
        // System.out.println(paises[0]);

        // Alterando valor da posição zero no array
        // paises[0] = "BRAZIL";

        // Imprimindo valor alterado da posição zero
        // System.out.println(paises[0]);

        // Descobrindo quantas posições tem o array paises (tamanho do array)
        //System.out.println(paises.length);


        /* ARRAY DE INTEIROS
        ----------------------------------------------------------------------- */

        // Criando Array de Inteiros com cinco (5) posições
        // int[] impares = new int[5];

        // Inserindo valor nas posições do array de impares
        // impares[0] = 1;
        // impares[1] = 3;
        // impares[2] = 5;
        // impares[3] = 7;
        // impares[4] = 9;

        // Output do array de inteiros
        // System.out.println(impares[0]);

        // Descobrindo quantas posições tem o array impares (tamanho do array)
        // System.out.println(impares.length);


        /* TRABALHANDO COM OBJETOS DO PACOTE Arrays, Eh NECESSARIO IMPORTAR ESSE PACOTE
        PARA UTILIZAR OS METODOS E O PACOTE Collections PARA INVERTER UMA ORDENACAO
        -------------------------------------------------------------------------------- */

        // Transformando um array em String
        // Método usado: .toString(array)
        System.out.println(Arrays.toString(paises));

        // Pesquisar dentro do array (Pergunta: Existe no array 'paises' o pais Russia?)
        // Método usado: .binarySearch(array, valor-procurado)
        // 1 = true, -2 = false (não lembro onde li algo relacionado, mas vou pesquisar)
        System.out.println(Arrays.binarySearch(paises, "Russia"));

        // Ordenando elementos de um array na ordem CRESCENTE
        // Método usado: .sort(array, indice-inicial, indice-final)
        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));

        // Ordenando elementos de um array na ordem DECRESCENTE
        // Método usado: .sort(array, Collections.reverseOrder())
        Arrays.sort(paises, Collections.reverseOrder());
        System.out.println(Arrays.toString(paises));

        // Acessando métodos do array
        // Métodos: .byteValue(), .intValue(), doubleValue(), shortValue() etc.
        // Se você estiver usando uma IDE ou editor mais inteligente, ao digitar o ponto, 
        // surgirá na tela vários métodos para explorar. Do contrário, analise a documentação.
        Double[] valores = {12.53, 397.25};
        System.out.println(valores[0].doubleValue()); // valor visto como double
        System.out.println(valores[0].floatValue());  // valor visto como float
        System.out.println(valores[0].shortValue());  // valor visto como short (trunca decimais)
        System.out.println(valores[0].intValue());    // valor visto como int (trunca decimais)
        System.out.println(valores[0].longValue());   // valor visto como long (trunca decimais)
    }
}