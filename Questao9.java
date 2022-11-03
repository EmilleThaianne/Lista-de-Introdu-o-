
/* 
 * Estudante: Emille Thaianne Nogueira dos Santos Turma: 3ºTIA
 *
 * Uma empresa deseja saber a média de idade dos frequentadores de sua praça de
 * alimentação. Para isso, você deve construir um vetor que seja capaz de armazenar a 
 * idade de dez pessoas.
 * a. Identifique a maior idade do vetor;
 * b. Calcule a média das idades do vetor;
 * c. Identifique a menor idade do vetor.
 */
import javax.swing.JOptionPane;

public class Questao9 {

    public static void main(String[] args) {
        int qtd = 10, idade[] = new int[qtd], soma = 0, maioridade = 0, menoridade = 0;
        double media;

        for (int i = 0; i < qtd; i++) {
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade dos frequentadores: "));
            soma = soma + idade[i];

            if (i == 0) {
                maioridade = idade[0];
                menoridade = idade[0];
            }
            if (idade[i] > maioridade) {
                maioridade = idade[i];
            }
            if (idade[i] < menoridade) {
                menoridade = idade[i];
            }
        }
        media = soma / qtd;

        JOptionPane.showMessageDialog(null, "A maior idade entre os frequentadores é: " + maioridade);
        JOptionPane.showMessageDialog(null, "A media das idade é: " + media);
        JOptionPane.showMessageDialog(null, "E a menor idade entre os frequentadores é: " + menoridade);
    }
}
