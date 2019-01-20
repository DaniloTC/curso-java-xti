public class Fluxo 
{
    public static void main(String[] args) 
    {
        boolean passou = true; 
        if(passou) {
            System.out.println("Aprovado");
        }

        //-------------------------------------------------

        int numero = 11;
        if ((numero % 2) == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

        //-------------------------------------------------

        int idade = 10;

        // if simples
        if(idade < 11) {
            System.out.println("Crianca");
        }

        // if-else
        if(idade <= 11) {
            System.out.println("Crianca");
        }
        else if(idade > 11 && idade <= 18) {
            System.out.println("Adolescente");
        }
        else if(idade > 18 && idade <= 60) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Melhor Idade");
        }

        //-------------------------------------------------

        int nota = 5;

        // if aninhado
        if(nota >= 7) {
            System.out.println("Passou");
        }
        else {
            System.out.println("Reprovou");
            if(nota >= 6) {
                System.out.println("Mas pode fazer a recuperacao");
            }
        }
    }// end main
}// end class