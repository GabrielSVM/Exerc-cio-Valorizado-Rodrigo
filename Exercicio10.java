import javax.swing.JOptionPane;

public class Exercicio10 {
	public static void main(String[] args) {
		int[][] valores = new int[3][3];

		StringBuilder mensagemStringsBuilder = new StringBuilder();

		int[] quantidade = {0, 0};
		
			for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < 3; j++) {
				valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para a posição ["+i+"]["+j+"]: " , "Exercício número 10", JOptionPane.DEFAULT_OPTION));
				mensagemStringsBuilder.append("Valores[" + i + "][" + j + "] =  " + valores[i][j] + "\n");
				if(valores[i][j] % 2 == 0) {
					quantidade[0]++;
				} else {
					quantidade[1]++;
				}
			}
		}
		mensagemStringsBuilder.append("\nQuantidade de nº:\nPares: " + quantidade[0] + "\nímpares: " + quantidade[1]);
		JOptionPane.showConfirmDialog(null, mensagemStringsBuilder, "Exercício número 10", JOptionPane.DEFAULT_OPTION);
	}
}
