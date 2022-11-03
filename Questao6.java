
/* Estudante: Emille Thaianne Nogueira dos Santos Turma: 3ºTIA
 *
 * Questão 6: Leia um conjunto de 10 valores inteiros em um vetor e, em seguida, 
 * exiba-os na ordem inversa do que foram digitados.
 */
import javax.swing.JOptionPane;

public class Questao6 {

    public static void main(String[] args) {
        int qtd = 10, valores[] = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os valores inteiros:  "));
        }
        for (int i = qtd - 1; i >= 0; i--) {
            JOptionPane.showMessageDialog(null, +valores[i]);
        }
    }
}