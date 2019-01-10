import java.util.Random;
/**
 * Aplicativo que seleciona os elementos de dois arrays de forma aleatória,
 * une essa seleção e dá origem a um jogo de carta.
 * @author Danilo Trindade de Castro
 */
public class AppSelecionaBaralho {
    public static void main(String[] args) {
        
        String[] facesDasCartas = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        String[] nipesDasCartas = {"Espadas", "Paus", "Copas", "Ouros"};

        // Classe que seleciona elementos de forma aleatória (necessário importação)
        Random r = new Random();

        String face = facesDasCartas[r.nextInt(facesDasCartas.length)];
        String nipe = nipesDasCartas[r.nextInt(nipesDasCartas.length)];

        // Montando o jogo
        String cartas = face + " " + nipe;
        System.out.println(cartas);
    }
}