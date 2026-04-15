


/*2. Inversão de String sem Métodos Prontos (Manipulação de Dados)
Muitas empresas proíbem o uso de StringBuilder.reverse() para ver se você entende como a memória e as coleções funcionam por baixo do capô.

O Problema:
Crie uma função que receba uma String e retorne essa mesma string invertida, percorrendo-a manualmente.

Exemplo de Entrada: "Java"

Saída Esperada: "avaJ"

O que avalia:

Manipulação de arrays ou do método charAt().

Entendimento de índices (cuidado com o erro ArrayIndexOutOfBoundsException).

Concatenção eficiente de Strings.*/
public class exercicio2{

    public static String InverterString(String palavra){
        String invertida = "";
        for (int i = palavra.length() -1; i >= 0; i--) {
           invertida += palavra.charAt(i);
        }
   
        return invertida;
    } 
    public static void main(String[] args) {
         String palavra = "String";
         System.out.println(palavra);
         palavra = InverterString(palavra);
         System.out.println(palavra);
    }
}