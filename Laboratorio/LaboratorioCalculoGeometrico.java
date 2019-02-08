import java.util.Locale;
import java.util.Scanner;
public class LaboratorioCalculoGeometrico 
{
    public static void main(String[] args) 
    {    
        Locale.setDefault(Locale.US); // Seta pontuação padrão
        Scanner sc = new Scanner(System.in); // Entrada de dados via terminal

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // CALCULO DO TRIANGULO
        triangulo = A * C / 2.0;

        // CALCULO DO CIRCULO
        circulo = pi * C * C;

        // CALCULO DO TRAPEZIO
        trapezio = (A + B) / 2.0 * C;

        // CALCULO DO QUADRADO
        quadrado = B * B;

        // CALCULO DO RETANGULO
        retangulo = B * A;

        // IMPRESSAO FORMATADA
        System.out.printf("TRIANGULO = %.3f%n", triangulo);
        System.out.printf("CIRCULO = %.3f%n", circulo);
        System.out.printf("TRAPEZIO = %.3f%n", trapezio);
        System.out.printf("QUADRADO = %.3f%n", quadrado);
        System.out.printf("RETANGULO = %.3f%n", retangulo);

        sc.close();
    }
}
// valores de entrada
// 3.0 4.0 5.2
// 12.7 10.4 15.2