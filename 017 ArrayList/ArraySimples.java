import java.util.ArrayList;
public class ArraySimples {
    public static void main(String[] args) {
        
        // Collection Framework ArrayList
        // 1. Adicionar
        // 2. Remover
        // 3. Pesquisar
        // 4. Recuperar

        // A partir da versão 7 não precisa informar o tipo no <> do construtor
        ArrayList<String> cores = new ArrayList<>();

        cores.add("Azul"); // Equivalente: cores[0] = "Azul"
        cores.add(0, "Amarelo");
        cores.add("Branco");
        cores.add("Roxo");

        System.out.println("ARRAY               : " + cores.toString());
        System.out.println("TAMANHO DO ARRAY    : " + cores.size());
        System.out.println("ELEMENTO 2          : " + cores.get(2));
        System.out.println("INDICE 'Branco'     : " + cores.indexOf("Branco"));

        cores.remove("Azul");

        System.out.println("NOVO TAMANHO        : " + cores.size());

        System.out.println("PESQUISA: Tem azul? : " + cores.contains("Azul"));

        /**
         * RELACAO DE METODOS APRESENTADOS NESTA AULA
         * --------------------------------------------------------
         * METODO                  DESCRICAO
         * --------------------------------------------------------
         * .add()                  ADICIONA elementos no array
         * .remove()               REMOVE elemento do array
         * .contains()             PESQUISA elemento específico
         * .get()                  RECUPERA elemento do índice
         * .toString()             TRANSFORMA array em string
         * .size()                 CONTA a quantidade de elementos
         * .indexOf()              RETORNA INDICE do parâmetro
         * --------------------------------------------------------
         */
    }
}