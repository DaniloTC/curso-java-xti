import java.util.Scanner;
public class IMCScanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu Peso em Quilogramas: ");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a sua Altura em Metros: ");
        double altura = Double.parseDouble(scanner.nextLine());

        double imc = peso / (altura * altura);

        if (imc < 20) {
            System.out.println("IMC = " + imc + "\n" + "Abaixo do Peso");
        }
        else if (imc >= 20 && imc <= 25) {
            System.out.println("IMC = " + imc + " (Peso Ideal)");
            System.out.println(String.format("IMC = %.3f (Peso Ideal)", imc));
            System.out.printf("IMC = %.2f (Peso Ideal)", imc);
        }
        else if (imc >= 25 && imc <= 30) {
            System.out.println("IMC = " + imc + " (Sobrepeso)");
            System.out.println(String.format("IMC = %.3f (Sobrepeso)", imc));
            System.out.printf("IMC = %.2f (Sobrepeso)", imc);
        }
        else if (imc >= 30 && imc <= 35) {
            System.out.println("IMC = " + imc + " (Obesidade Moderada)");
            System.out.println(String.format("IMC = %.3f (Obesidade Moderada)", imc));
            System.out.printf("IMC = %.2f (Obesidade Moderada)", imc);
        }
        else if (imc >= 35 && imc <= 40) {
            System.out.println("IMC = " + imc + " (Obesidade Severa)");
            System.out.println(String.format("IMC = %.3f (Obesidade Severa)", imc));
            System.out.printf("IMC = %.2f (Obesidade Severa)", imc);
        }
        else if (imc >= 40 && imc <= 50) {
            System.out.println("IMC = " + imc + " (Obesidade Morbida)");
            System.out.println(String.format("IMC = %.3f (Obesidade Morbida)", imc));
            System.out.printf("IMC = %.2f (Obesidade Morbida)", imc);
        }
        else if (imc > 50) {
            System.out.println("IMC = " + imc + " (Super-Obesidade)");
            System.out.println(String.format("IMC = %.3f (Super-Obesidade)", imc));
            System.out.printf("IMC = %.2f (Super-Obesidade)", imc);
        }

        scanner.close();
    }
}