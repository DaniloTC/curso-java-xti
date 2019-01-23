public class FluxoFor
{
    public static void main(String[] args)
    {
        /**
         * for (int i = 0; i < 3; i++) {...}
         * for (int i = 3; i > 0; i--) {...}
         * 
         * for (inicializacao; teste; atualizacao)
         *     acao
         * }
         * --------------------------------------------------
         * 1. Inicialização
         * 2. Teste
         * 3. Ação
         * 4. Atualização
         * --------------------------------------------------
         * Se o valor inicial for menor que o valor do teste,
         * utilizar o sinal de menor, pois iremos iterar aqui
         * enquanto i for menor que x, com incremento (++) na
         * atualização.
         * 
         * Se o valor inicial for maior que o valor do teste,
         * utilizar o sinal de maior, pois iremos iterar aqui
         * enquanto i for maior que x, com decremento (--) na
         * atualização.
         * 
         * Podemos utilizar outros operadores lógicos para a
         * realização da avaliação no teste desta estrutura.
         * --------------------------------------------------
        */

        /**
         * Impressão básica de três números para observar como
         * a estrutura for funciona na pratica.
         */
        for (int i=0; i < 3; i++) {
           System.out.println(i);
        }

        /**
         * Este exemplo mostra como realizar iteração com for
         * e armazenar o resultado dentro de uma string. Assim,
         * no final, será impresso toda iteração realizada que
         * estará armazenada dentro da variável text1.
         * 
         * Este tipo de iteração tem como atualização o operador
         * de incremento, ou seja, cada iteração terá seu valor
         * incrementado em 1.
         */
        String text1 = "";
        for (int i=0; i < 3; i++) {
            text1 += i + ","; // text1 = text1 + i
        }
        System.out.println(text1);

        /**
         * Este exemplo é bem parecido com o exemplo anterior,
         * tendo como principal diferença sua iteração que inicia
         * com um valor maior até um determinado valor menor, sendo
         * decrementado em 1 a cada iteração.
         */
        String text2 = "";
        for (int i=10; i > 0; i--) {
            text2 += i + ","; // text2 = text2 + i
        }
        System.out.println(text2);

        /**
         * Este exemplo mostra todos os números pares entre 0 e 20.
         * Além de mostrar os números pares, separa cada número com
         * uma vírgula. Porém, no último número é colocado um ponto.
         */
        String text3 = "";
        for (int i=0; i <= 20; i++) {
            // avalia e mostra somente números pares.
            if (i % 2 == 0) {
                // adiciona vírgula para separar, e ponto para finalizar.
                if (i != 20) {
                    text3 += i + ",";
                } else {
                    text3 += i + ".";
                }
            }
        }
        System.out.println(text3);

        /**
         * Este é um exemplo de como utilizar um for dentro de outro.
         * Aqui será mostrado como criar um quadrado usando asteriscos.
         */
        int size = 5;
        for (int x=0; x < size; x++) {
            for (int i=0; i < size; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /**
         * Este algoritmo mostra como iterar com a estrutura for para
         * mostrar a divisão de um valor x em parcelas.
         * Neste exemplo utilizo o valor total de 15000 que poderá ser
         * dividido enquanto a parcela for maior que 1000.
         * 
         * Além disso, é possível também observar a utilização do break
         * que pára a iteração do for e executa as instruções seguintes.
         */
        double valorTotal1 = 15000;
        System.out.println("Valor total = " + valorTotal1);
        for (int numeroParcelas = 10; numeroParcelas < 20; numeroParcelas++) 
        {
            double parcela = valorTotal1 / numeroParcelas;
            if (parcela < 1000) {
                System.out.print("Nao e possivel parcelar em mais vezes, ");
                System.out.println("pois nao e permitido parcelas < 1000");
                break;
            }
            System.out.println(numeroParcelas + " parcelas de " + parcela);
        }

        /**
         * Este algoritmo faz exatamente o mesmo que o algoritmo anterior,
         * mas com a diferença que antes usamos "break" para parar a iteração
         * enquanto neste usamos "continue" que pára a iteração mas depois
         * continua executando-a.
         * 
         * Além disso, é possível também observar a utilização do "continue"
         * que não pára a iteração, mas continua executando-as.
         */
        double valorTotal2 = 15000;
        System.out.println("Valor total = " + valorTotal2);
        for (int numeroParcelas = 10; numeroParcelas < 20; numeroParcelas++) 
        {
            double parcela = valorTotal1 / numeroParcelas;
            if (parcela < 1000) {
                System.out.print("Nao e possivel parcelar em mais vezes, ");
                System.out.println("pois nao e permitido parcelas < 1000");
                // Vamos substituir o break pelo continue
                continue;
            }
            System.out.println(numeroParcelas + " parcelas de " + parcela);
        }
    }// end main
}// end class