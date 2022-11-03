
/* Estudante: Emille Thaianne Nogueira dos Santos Turma: 3ºTIA
 *
 * Questão 5: Leia 5 salários em um vetor. Após toda a entrada ter sido realizada, 
 * leia o valor de um reajuste. Em seguida exiba todos os salários já reajustados.
 */
import javax.swing.JOptionPane;

public class Questao5 {

    public static void main(String[] args) {
        int qtd = 5;
        double salario[] = new double[qtd], salarior[] = new double[qtd], reajuste;

        for (int i = 0; i < qtd; i++) {
            salario[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os valores dos salários: "));
        }

        reajuste = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que será reajustado no salário: "));

        for (int i = 0; i < qtd; i++) {
            salarior[i] = salario[i] + ((reajuste / 100) * salario[i]);
            JOptionPane.showMessageDialog(null, "Os Salários reajustados são: " + salarior[i]);
        }
    }
}