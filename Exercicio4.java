import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        
        int[] num = new int[10];
        double  percentual = 0;
        int par = 0;

        Random numAleatorioRandom = new Random();
        String[] mensagemStrings = new String[10];

        for(int i = 0; i < num.length; i++){
            num[i] = numAleatorioRandom.nextInt(100);
            if (num[i] % 2 == 0) {
                par++;
            }
            System.out.println(num[i]);
        }
        percentual = par  * 10;
        mensagemStrings[1] = "O percentual dos números pares eh: " + percentual + "%\nO percentual dos números ímpares eh: " + (100 - percentual) + "%";
        JOptionPane.showConfirmDialog(null, mensagemStrings, "Exercício número 4", JOptionPane.DEFAULT_OPTION);
    }
}

