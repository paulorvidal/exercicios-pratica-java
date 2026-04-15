
import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        String palavra;
        String letra;

        Scanner scan = new Scanner(System.in);

        char[] palavraComparar;

        System.out.println("Digite uma palavra para usar na forca: ");
        palavra = scan.nextLine();

        char[] palavraEscondida = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            palavraEscondida[i] = '_';
        }
        palavraComparar = palavra.toCharArray();
        int tentativas = 0;
        do {
            System.out.println(palavraEscondida);
            System.out.println("Digite uma letra: ");
            letra = scan.nextLine();
            for (int i = 0; i < palavraEscondida.length; i++) {
                if (letra.charAt(0) == palavraComparar[i]) {
                    palavraEscondida[i] = letra.charAt(0);
                    System.out.println("Letra correta!");
                }
            }
            if (!palavra.contains(letra)) {
                System.out.println("Letra incorreta! Você tem " + (5 - tentativas) + " tentativas restantes.");
                tentativas++;
            }
            if (String.valueOf(palavraEscondida).equals(palavra)) {
                System.out.println("Parabéns! Você ganhou!");
                break;
            }
        } while (tentativas < 6);

        if (tentativas == 6) {
            System.out.println("Você perdeu! A palavra era: " + palavra);
        }
        scan.close();
    }
}
