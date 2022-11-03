
/* Estudante: Emille Thaianne Nogueira dos Santos Turma: 3ºTIA
 *
 * Questão 4: Escreva um programa que determine o número de dígitos de um valor 
 * inteiro maior ou igual a 0. 
 */
import javax.swing.JOptionPane;

public class Questao4 {

    public static void main(String[] args) {
        int numero;
        String quantidade;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro qualquer: "));
        quantidade = String.valueOf(numero);

        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " possui " + quantidade.length() + " dígitos");
        }
    }
}
