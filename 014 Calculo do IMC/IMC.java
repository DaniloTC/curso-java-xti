/**
 * Calcular o IMC
 * IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 * @author Danilo Trindade de Castro
 * @version 1.0
 */
public class IMC {
    public static void main(String[] args) {
        /*
            CALCULO DO IMC
            INDICE DE MASSA CORPORAL

            IMC = PESO / (ALTURA)2

            < 20   :  Abaixo do peso
            20-25  :  Peso Ideal
            25-30  :  Sobrepeso
            30-35  :  Obesidade Moderada
            35-40  :  Obesidade Severa
            40-50  :  Obesidade Mórbida
            > 50   :  Super-Obesidade
        */
        double pesoEmQuilogramas = 70.0;
        double alturaEmMetros = 1.76;
        double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
        String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do Peso Ideal";
        System.out.println("IMC = " + imc);
        System.out.println(msg);
    }
}