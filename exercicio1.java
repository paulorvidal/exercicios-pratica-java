/*O Problema:
Escreva um programa que imprima números de 1 a 50.

Para múltiplos de 3, imprima "Fizz" em vez do número.

Para múltiplos de 5, imprima "Buzz".

Para números que são múltiplos de ambos (3 e 5), imprima "FizzBuzz".

O que avalia:

Uso do operador de módulo (%).

Ordem de precedência das condições if/else.

Estruturas de repetição (for ou while).*/

public class exercicio1{
    public static void main(String[] args) {
        for (int index = 0; index < 50; index++) {
            System.out.println("contando : " + index);
            if(index % 2 == 0){
                System.out.println("Fizz");
            }else
                System.out.println("Buzz");
            
        }
    }
}