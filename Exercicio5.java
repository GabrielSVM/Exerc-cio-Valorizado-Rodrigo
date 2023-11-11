import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		
		double[] Nota1 = new double[10];
		double[] Nota2 = new double[10];
		double[] Result = new double[10];
		int i;

		for (i = 0; i < 10; i++) {
				Nota1[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe as notas do aluno " + (i + 1)));
				Nota2[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe as notas do aluno " + (i + 1)));
			
			Result[i] = (Nota1[i] + Nota2[i]) / 2;
		}

		String mensagemStrings = " ";

		for (i = 0; i < 10; i++) {
			mensagemStrings += "ALUNO " + (i + 1) + "\n";
			if (Result[i] >= 7) {
				mensagemStrings += "APROVADO\n";
			} else {
				mensagemStrings += "REPROVADO\n";
			}
		}
		JOptionPane.showMessageDialog(null, mensagemStrings);
	}
}