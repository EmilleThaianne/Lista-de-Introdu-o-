
/* 
 * Estudante: Emille Thaianne Nogueira dos Santos Turma: 3ºTIA
 *
 * Faça um procedimento que recebe a idade de um nadador por parâmetro e imprime a categoria desse nadador de acordo
 * com a tabela abaixo: Chame atenção do usuário em caso de uma consulta inválida, ou seja, com números menores ou 
 * iguais a zero, ou maiores do que a quantidade cadastrada.
 * Idade Categoria
 * 5 a 7 anos Infantil A
 * 8 a 10 anos Infantil B
 * 11-13 anos Juvenil A
 * 14-17 anos Juvenil B
 * Maiores de 18 anos (inclusive) Adulto
 */

import javax.swing.JOptionPane;

public class Questao10 {

    public static void main(String[] args) {
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador: "));

        if (idade <= 0 || idade <= 4) {
            JOptionPane.showMessageDialog(null, "Consulta inválida! Idade digitada não cadastrada!");
        } else if (idade >= 5 && idade <= 7) {
            JOptionPane.showMessageDialog(null, "Categoria Infantil A. ");
        } else if (idade >= 8 && idade <= 10) {
            JOptionPane.showMessageDialog(null, "Categoria Infantil B. ");
        } else if (idade >= 11 && idade <= 13) {
            JOptionPane.showMessageDialog(null, "Categoria Juvenil A. ");
        } else if (idade >= 14 && idade <= 17) {
            JOptionPane.showMessageDialog(null, "Categoria Juvenil B. ");
        } else if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Categoria Adulto. ");
        }

    }
}
