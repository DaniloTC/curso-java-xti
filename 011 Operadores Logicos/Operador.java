public class Operador {
    public static void main(String[] args) {
        /*
           OPERADORES LOGICOS
           &&     AND    (e)
           ||     OR     (ou)
           !      NOT    (não)
        */

        //Variavel base
        int x = 6;

        //OPERADOR (&& com V V) => Retorna true se ambas expressões forem verdadeiras
        System.out.println((x >= 1) && (x <= 10)); //Output: true

        //OPERADOR (&& com V F) => Retorna false se uma das expressões for falsa
        System.out.println((x >= 1) && (x <= 5)); //Output: false

        //OPERADOR (|| com V F) => Retorna true se uma das expressões for verdadeira
        System.out.println((x >= 1) || (x <= 5)); //Output: true

        //OPERADOR (!) => Inverte o resultado de uma expressão
        System.out.println(!(x >= 1)); // !true  = não true  = false
        System.out.println(!(x > 6));  // !false = não false = true
    }
}