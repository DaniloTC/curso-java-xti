public class Fluxo
{
    public static void main(String[] args)
    {
        char sexo = 'M';

        /**
         * Neste exemplo a variável 'sexo' não é comparada, mas
         * é verificado os casos em que essa variável será true,
         * ou seja, caso seja M, executa uma instrução antes do
         * break, caso seja F, executa outra instrução até o
         * próximo break e assim por diante.
         * No switch não há necessidade de chamar a variável sexo
         * em cada avaliação.
         */
        switch(sexo) {
        case 'M':
            System.out.println("Macho");
            break;
        case 'F':
            System.out.println("Femea");
            break;
        default:
            System.out.println("Outro");
            break;
        }

        /**
         * Código equivalente implementado com o fluxo if-else
         * Neste exemplo precisamos trazer a variável 'sexo' para
         * cada avaliação.
         */
        if(sexo == 'M') {
            System.out.println("Macho");
        }
        else if(sexo == 'F') {
            System.out.println("Femea");
        }
        else {
            System.out.println("Outro");
        }

        //---------------------------------------------------------

        // Exemplo de uso da instrução 'break'
        String tecnologia = "postgresql";
        switch(tecnologia) {
        case  "java":
        case "c++":
        case "cobol":
            System.out.println("Linguagem de Programacao");
            break;
        case "oracle":
        case "sqlserver":
        case "postgresql":
            System.out.println("Banco de Dados");
            break;
        default:
            System.out.println("Tecnologia Desconhecida");
            break;
        }
    }// end main
}// end class