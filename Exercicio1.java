import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio1 {
public static void main(String[] args) {
    
    int[] numA =  new int[10];
    int[] numB = new int[10];

    Random numAleatorioRandom = new Random();

    String[] mensagemStrings = new String[10];

    for( int i = 0; i < numB.length; i++){
        numA[i] = numAleatorioRandom.nextInt(100);
        numB[i] = numA[i] * i;

        mensagemStrings[i] = "Valor do vetor A(" + i + "): " + numA[i] + "\nValor do vetor B(" + i + "): " + numA[i] + " x " + i + " = " + (numB[i]);
        }

        JOptionPane.showConfirmDialog(null, mensagemStrings, "Exercício número 1", JOptionPane.DEFAULT_OPTION);

    }    
}