import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio2 {
public static void main(String[] args) {
    
    int[] numA =  new int[10];
    int[] numB = new int[10];
    int[] numC = new int[10];

    Random numAleatorioRandom = new Random();

    String[] mensagemStrings = new String[10];

    for( int i = 0; i < numC.length; i++){
        numA[i] = numAleatorioRandom.nextInt(100);
        numB[i] = numAleatorioRandom.nextInt(100);
        numC[i] = numA[i] + numB[i];

        mensagemStrings[i] = "Valor do vetor A(" + i + "): " + numA[i] + "\nValor do vetor B(" + i + "): " + numB[i] + "\nValor do vetor C(" + i + "): " + numA[i] + " + " + numB[i] + " = " + (numC[i]);
        }

        JOptionPane.showConfirmDialog(null, mensagemStrings, "Exercício número 2", JOptionPane.DEFAULT_OPTION);

    }    
}