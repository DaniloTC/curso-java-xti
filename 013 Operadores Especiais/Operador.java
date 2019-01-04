import java.util.Scanner;

public class Operador {
    public static void main(String[] args) {
        /*
           OPERADORES ESPECIAIS

           ?:        Operador Ternário
           ,         Separador de expressões
           ()        Chamada de Método
           (cast)    Coerção Unária

           DIAMETRO E AREA DE CIRCULO
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o raio: ");

        //Base variable
        int idade = 26;

        //Operador Ternário
        //String x = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";
        //System.out.println(x);

        //Diametro: 2r
        double raio = scan.nextDouble();
        double diametro = 2 * raio;

        //Circunferencia: 2 PI r
        double pi = Math.PI; //Math é uma classe matemática que está chamando uma constante
        double circunferencia = 2 * pi * raio;

        //Area: PI r2
        double area = pi * (raio * raio);

        System.out.println("\nSEM FORMATACAO");
        System.out.println("Diametro="+diametro);
        System.out.println("Circunferencia="+circunferencia);
        System.out.println("Area="+area);
        System.out.println();//pula uma linha
        System.out.println("FORMATADO COM >> PRINTF <<");
        System.out.printf("Diametro=%.2f\n",diametro);
        System.out.printf("Circunferencia=%.2f\n",circunferencia);
        System.out.printf("Area=%.2f\n",area);
        System.out.println();//pula uma linha
        System.out.println("FORMATADO COM >> INTERPOLACAO <<");
        System.out.println(String.format("Diametro=%.2f",diametro));
        System.out.println(String.format("Circunferencia=%.2f",circunferencia));
        System.out.println(String.format("Area=%.2f",area));
    }
}