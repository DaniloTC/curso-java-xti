class TesteSwitch 
{
    public static void main(String[] args) {
        testeLivroSwitch();
    }

    // Method
    public static void testeLivroSwitch()
    {
        int diaSemana = 5;

        switch(diaSemana)
        {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                // neste caso as operacoes serao executadas sequencialmente ate que
                // seja encontrado um break
                System.out.println("Sexta-feira");
                System.out.println("Hoje e dia de curso");
            case 6:
                System.out.println("Sabado");
                System.out.println("Hoje ainda e dia de curso");
                break;
                // Repare que neste caso foram executados os comandos que estavam dentro da 
                // clausula case 5 e case 6, pois somente na clausula case 6 foi encontrado
                // um break.
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }// end switch
    }// end method
}// end class