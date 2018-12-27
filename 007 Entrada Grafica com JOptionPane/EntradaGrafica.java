// Importando pacote necessário
import javax.swing.JOptionPane;

public class EntradaGrafica {
	
	public static void main(String[] args) {
		
		// JOptionPane retorna uma string (aqui já podemos ver a
		// necessidade dos conversores visto em aulas anteriores).
		String nome = JOptionPane.showInputDialog("Qual o seu Nome?");
		
		// 2 FORMAS DE IMPRIMIR
		
		// No console
		//System.out.println(nome);
		
		// Em uma janela do JOptionPane
		JOptionPane.showMessageDialog(null, nome);
	}
}