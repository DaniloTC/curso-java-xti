import javax.swing.JOptionPane;

/**
 * Calcular o IMC
 * IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 * @author Danilo Trindade de Castro
 * @version 2.0
 */
public class IMC {
    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Qual seu Peso em Quilogramas? ");
        String altura = JOptionPane.showInputDialog("Qual sua Altura em Metros? ");
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
        double pesoEmQuilogramas = Double.parseDouble(peso); //conversão estática (String to double)
        double alturaEmMetros = Double.parseDouble(altura); //conversão estática (String to double)
        double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
        String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do Peso Ideal";
        msg = "IMC = " + imc + "\n" + msg;
        JOptionPane.showMessageDialog(null, msg);
    }
}