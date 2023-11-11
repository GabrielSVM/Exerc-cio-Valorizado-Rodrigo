import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		
		int[] A = new int[6];
		int[] B = new int[6];
		
		StringBuilder mensagemStringsBuilder = new StringBuilder();
		
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
			if(A[i] % 2 == 0) {
				B[i] = 1;
			} else {
				B[i] = 0;
			}
			mensagemStringsBuilder.append("Valor de A(" + i + "): " + A[i] + "\nValor de B(" + i + "): " + B[i] + "\n");
		}
		JOptionPane.showConfirmDialog(null, mensagemStringsBuilder, "Exercício número 6", JOptionPane.DEFAULT_OPTION);
	}
}
