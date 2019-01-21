class TesteControleFluxoIfElse {
    public static void main(String[] args) {
        
        int x = 6;

        // Estrutura if-else sem utilizacao de { }
        if ((x > 0) && (x % 2 == 0))
            System.out.println("x eh positive e divisivel por 2");
        else
            System.out.println("x eh negativo ou nao eh divisivel por 2");
        
        // Estrutura de ifs aninhados utilizando { }
        if (x % 2 == 0) {
            System.out.println(x + " eh divisivel por 2");
            if (x % 3 == 0) System.out.println(x + " tambem eh divisivel por 3");
        }// end if

        // Utilizando if-else
        if (x > 0) {
            System.out.println("x eh POSITIVO");
        } 
        else {
            if (x < 0) {
                System.out.println("x eh NEGATIVO");
            } 
            else {
                System.out.println("x eh igual a ZERO");
            }
        }
    }// end main
}// end class
