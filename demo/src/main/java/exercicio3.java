import java.util.Scanner;
import java.util.Stack;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite ( ou { ou [, mas se quiser que seja valido, feche todos");
        String input = scanner.next();

        System.out.println(isValid(input));

    }

    public static boolean isValid(String input) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                pilha.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                char topo = pilha.pop();

                if (pilha.isEmpty()) {
                    return false;
                }

                if (c == '(' && topo != '('
                        || c == '{' && topo != '{'
                        || c == '[' && topo != '[') {
                    return false;
                }
            }

        }
        return pilha.isEmpty();
    }

}
