
/* 
 * Estudante: Emille Thaianne Nogueira dos Santos Turma: 3ºTIA
 * 
 * Questão 2: Uma livraria está fazendo uma promoção para pagamento à vista em que o comprador
 * pode escolher entre dois critérios de descontos. 
 * a. Critério A: R$0,25 por livro + R$7,50 fixo; 
 * b. Critéro B: R$0,50 por livro + R$2,50 fixo. 
 * Faça um programa em que o usuário digita a quantidade de livros que deseja comprar e 
 * o programa diz qual é a melhor opção de desconto.
 */
import javax.swing.JOptionPane;

public class Questão2 {

    public static void main(String[] args) {
        int quant;
        double valor_a, valor_b, crita = 0.25 + 7.50, critb = 0.50 + 2.50;

        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao nosso programa!");

        quant = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de livros que deseja comprar. "));
        valor_a = quant * crita;
        valor_b = quant * critb;

        JOptionPane.showMessageDialog(null, valor_a + " , " + valor_b);

        if (valor_a < valor_b) {
            JOptionPane.showMessageDialog(null, "O critério A é a melhor opção de desconto para seu caso!");

        } else {
            JOptionPane.showMessageDialog(null, "O critério B é a melhor opção de desconto para seu caso!");

        }
    }
}
