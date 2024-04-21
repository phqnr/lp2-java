package aula08_erros;/*
    algoritmo para tratar erros em java;

    - o algoritmo possui dois arrays, numerador com 8 posições e denominador com apenas 5 posições;
    - o laço for executa todas as posições do numerador para forçar erros no código;
    - o primeiro erro será uma divisão inexistente por zero e o outro erro ocorrerá
        pois o array de denominador tem apenas 5 posições;
    - a função try/catch trata do primeiro erro ArithmeticException (erro de aritmética)
        e depois o erro ArrayIndexOutOfBoundsException (índice do array além do limite);
    - a classe Exception é uma subclasse do Throwable;
    - o programador usará a função correta de acordo com o erro a ser tratato;
    - já a classe Throwable é função raíz na hierarquia das exceções;
    - no caso do Throwable, o programa retorna a mensagem que o programador informar;
    - t.getMessage() retorna exatamente a mensagem apresentada nos possíveis erros ocorridos;


 */

public class Main {
    public static void main(String[] args) {

        int[] numerador = {1, 2, 3, 4, 5, 6, 7, 8}; // array com 8 posições
        int[] denominador = {2, 3, 8, 1, 0}; // array com apenas 5 posições

        for (int i = 0; i < numerador.length; i++) {
            try {
                System.out.println("Resultado: " + numerador[i]/denominador[i]);
//            } catch (ArithmeticException e) {
//                System.out.println("Erro! Não existe divisão por zero.");
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Você tentou acessar uma posição inválida do array.");
            } catch (Throwable t) {
                System.out.println("Ocorreu um erro no programa. " + t.getMessage());
            }
        }
        System.out.println("Fim do programa.");
    }
}