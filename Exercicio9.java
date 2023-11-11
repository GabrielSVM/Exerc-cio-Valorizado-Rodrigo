import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio9 {
	public static void main(String[] args) {
		int[][] M = new int[4][4];
		
		Random random = new Random();

		int maior = 0;
		int[] posicao = new int[2];

		StringBuilder mensagemStringsBuilder = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				M[i][j] = random.nextInt(10);
				if(M[i][j] > maior) {
					maior = M[i][j];
					posicao[0] = i;
					posicao[1] = j;
				}
				mensagemStringsBuilder.append(M[i][j]).append(j == (4 - 1) ? "\n" : " ");
			}
		}
		mensagemStringsBuilder.append("\nMaior valor = " + maior + ".\nEle se encontra na posição(" + (1 + posicao[0]) + ")(" + (1 + posicao[1]) + ")");
		JOptionPane.showConfirmDialog(null, mensagemStringsBuilder, "Exercício número 9", JOptionPane.DEFAULT_OPTION);
	}
	
}
