
/*
 * Estudante: Emille Thaianne Nogueira dos Santos Turma: 3ºTIA
 * 
 * Questão 1: Um aluno realizou três provas de uma disciplina. Considerando o critério abaixo,
 * faça um programa que mostre a media e se ele foi aprovado ou reprovado.
 */
import javax.swing.JOptionPane;

public class Questao1 {

    public static void main(String[] args) {

        double nprova1, nprova2, nprova3, media;

        JOptionPane.showMessageDialog(null,
                "Lembre-se, ao coloca a nota em decimal, substitua a vírgula por ponto. Desde já, obrigada!! :)");

        nprova1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da primeira prova do aluno. "));
        nprova2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da segunda prova do aluno. "));
        nprova3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da terceira prova do aluno. "));

        media = (nprova1 + nprova2 + nprova3) / 3;

        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, "Nota " + media + ", Aluno aprovado!!! ");

        } else {
            double recuperacao, fim;

            JOptionPane.showMessageDialog(null,
                    "Nota " + media + ", Aluno reprovado! Necessário realizar a prova de recuperação!!");
            recuperacao = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da recuperação. "));

            fim = (media + recuperacao) / 2;

            if (fim >= 5.0) {
                JOptionPane.showMessageDialog(null, "Aluno aprovado!!");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno reprovado!!");
            }
        }
    }
}