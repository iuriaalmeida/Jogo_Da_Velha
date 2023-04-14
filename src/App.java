import javax.swing.JOptionPane;

import com.forca.controller.JogoController;
import com.forca.model.Jogador;

public class App {
    public static void main(String[] args) throws Exception {
        // Obtém o nome do jogador
        Jogador jogador = new Jogador();
        jogador.setNome(JOptionPane.showInputDialog(null, "Qual é o seu nome?"));

        // Inicia o jogo
        JogoController jogoController = new JogoController();
        jogoController.comecaJogo(jogador);

        // Loop principal do jogo
        while (!JogoController.jogoAcabou()) {
            // Exibe o estado atual do jogo
            JOptionPane.showMessageDialog(null, jogoController.getEstadoJogo());

            // Pede uma letra ao jogador e processa a jogada
            String letra = JOptionPane.showInputDialog(null, "Digite uma letra:");
            if (letra != null && letra.length() == 1) {
                jogoController.processaJogada(letra.charAt(0));
            }
        }

        // Exibe a mensagem de fim de jogo
        JOptionPane.showMessageDialog(null, jogoController.getEstadoJogo());
        JOptionPane.showMessageDialog(null, "Fim de jogo! Você " + (jogoController.jogadorGanhou() ? "ganhou!" : "perdeu."));
    }
}
