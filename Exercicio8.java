import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) {
		double[][] valores = new double[2][5];

		StringBuilder mensagemStringsBuilder = new StringBuilder();
	
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < 5; j++) {
				valores[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para a posição ("+i+")("+j+")", "Exercício número 8", JOptionPane.DEFAULT_OPTION));
				mensagemStringsBuilder.append("Valores(" + i + ")(" + j + "): " + valores[i][j] + "\n");
			}
		}
		JOptionPane.showConfirmDialog(null, mensagemStringsBuilder, "Exercício número 8", JOptionPane.DEFAULT_OPTION);
	
	}
}
