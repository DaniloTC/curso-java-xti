public class Operador {

    public static void main(String[] args) {
        
        /*
         OPERADORES DE COMPARACAO

            ==       Igual
            !=       Diferente
            >        Maior
            <        Menor
            >=       Maior ou Igual
            <=       Menor ou Igual
         instanceof  Comparar Tipos
        */
        
        int x = 6;
        int y = 5;
        Integer z = 6; // Melhoria da versão 7

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(z instanceof Integer);      // Compara objetos
        System.out.println("texto" instanceof String); // Compara objetos
    }
}