import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
	
		int[] num = new int[10];
		StringBuilder mensagemStringsBuilder = new StringBuilder();

		mensagemStringsBuilder.append("Vetor original: ");
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));		
			mensagemStringsBuilder.append(num[i] + " ");
		}
		Arrays.sort(num);
		mensagemStringsBuilder.append("\nVetor ordenado (Crescente): ");
		for (int i = 0; i < num.length; i++) {
			mensagemStringsBuilder.append(num[i] + " ");
		}
		JOptionPane.showMessageDialog(null, mensagemStringsBuilder, "Exercício número 7", JOptionPane.INFORMATION_MESSAGE, null);
	}	
}