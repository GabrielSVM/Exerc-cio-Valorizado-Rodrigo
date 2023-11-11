import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        
        int[] numA = new int[10];
        int soma = 0;

        Random numAleatorioRandom = new Random();
        
        String[] mensagemStrings = new String[10];

        for(int i = 0; i < numA.length; i++){
            numA[i] = numAleatorioRandom.nextInt(100);
            soma = soma + numA[i];
        }
        mensagemStrings[1] = "A soma de todos os elementos do vetor A eh: " + soma;
        JOptionPane.showConfirmDialog(null, mensagemStrings, "Exercício número 3", JOptionPane.DEFAULT_OPTION);
    }
}
