import java.util.Scanner;
import java.util.Random;
public class DesafioDados
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu palpite? ");
        int palpite = scanner.nextInt();

        Random rand = new Random();
        int dado = rand.nextInt(6)+1; // 0-5 adicionando +1 passa a ser 1-6
        // nextInt(6): 0,1,2,3,4,5
        // nextInt(6)+1: 1,2,3,4,5,6

        System.out.println("Palpite = " + palpite);
        System.out.println("Dado = " + dado);

        if (palpite == dado) {
            System.out.println("Acertou");
        }
        else {
            System.out.println("Errou");
        }
        scanner.close();
    }// end main
}// end class