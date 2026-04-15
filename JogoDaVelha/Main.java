
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // jogo da velha: ideia é uma versão simples em console para praticar lógica de
        // programação e
        // estruturas de dados
        // tabuleiro: matriz 3x3
        char[][] tabuleiro = { { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' } };
        // jogador atual: 'X' ou 'O'
        char jogadorAtual = 'X';
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int posicao;
        Random random = new Random();
        int contadorJogadas = 0;
        boolean jogoEmAndamento = true;

        System.out.println("Bem-vindo ao Jogo da Velha!");
        System.out.println("Jogador 1: X");
        System.out.println("Digite seu nome: ");
        String nomeJogador1 = scanner.nextLine();
        System.out.println("-----------------------------");
        System.out.println("Jogador 2: O");
        System.out.println("Digite seu nome: ");
        String nomeJogador2 = scanner.nextLine();
        System.out.println("-----------------------------");

        jogadorAtual = random.nextInt(100) > 50 ? 'X' : 'O';

        if (jogadorAtual == 'X') {
            System.out.println("O jogador " + nomeJogador1 + " começa!");
        } else {
            System.out.println("O jogador " + nomeJogador2 + " começa!");
        }
        do {
            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.println(tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
                if (i < tabuleiro.length - 1) {
                    System.out.println("---------");
                }
            }
            System.out.println("-----------------------------");
            if (jogadorAtual == 'X') {
                System.out.println("Vez do jogador " + nomeJogador1 + " (X)");
            } else {
                System.out.println("Vez do jogador " + nomeJogador2 + " (O)");
            }
            System.out.println("Para jogar, digite a posição do 1 ao 9: ");
            posicao = scanner.nextInt();
            int linha = (posicao - 1) / 3;
            int coluna = (posicao - 1) % 3;
            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição já ocupada! Tente novamente.");
                continue;
            }
            tabuleiro[linha][coluna] = jogadorAtual;
            contadorJogadas++;

            System.out.println("-----------------------------");

            boolean venceu = false;

            for (int i = 0; i < tabuleiro.length; i++) {

                if (tabuleiro[i][0] == 'X' && tabuleiro[i][1] == 'X' && tabuleiro[i][2] == 'X')
                    venceu = true;
                if (tabuleiro[i][0] == 'O' && tabuleiro[i][1] == 'O' && tabuleiro[i][2] == 'O')
                    venceu = true;
                if (tabuleiro[0][i] == 'X' && tabuleiro[1][i] == 'X' && tabuleiro[2][i] == 'X')
                    venceu = true;
                if (tabuleiro[0][i] == 'O' && tabuleiro[1][i] == 'O' && tabuleiro[2][i] == 'O')
                    venceu = true;
            }
            if (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')
                venceu = true;
            if (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')
                venceu = true;
            if (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')
                venceu = true;
            if (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')
                venceu = true;

            if (venceu) {
                if (jogadorAtual == 'X') {
                    System.out.println("Parabéns " + nomeJogador1 + ", você venceu!");
                } else {
                    System.out.println("Parabéns " + nomeJogador2 + ", você venceu!");
                }
                jogoEmAndamento = false;
            } else if (contadorJogadas == 9) {
                System.out.println("Empate! O tabuleiro está cheio.");
                jogoEmAndamento = false;
            }
            // alternar jogador após cada jogada
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        } while (jogoEmAndamento);

    }
}
