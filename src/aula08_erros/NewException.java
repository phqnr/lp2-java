package aula08_erros;

/*
    - dois arrays de inteiros com tamanhos diferentes;

    - o loop for percorre até o tamanho do array de numeradores;
    - então se o numerador for ímpar, cria-se uma nova exceção com o texto da linha 20; se não for ímpar, imprime o cálculo da divisão;
    - no bloco catch (linha 25) executa o tratamento de erros artiméticos ou quando ultrapassa o limite do array de numerador;
    - no bloco catch (linha 27) chama o método Exception cuja mensagem genérica agora vai ser a que foi declarada na linha 22;
    - descomente a linha 29 para testar;

 */

public class NewException {
    public static void main (String [] args) {
        int[] numerador = {3, 4, 5, 8, 5, 16, 32, 21, 64, 128};
        int[] denominador = {2, 0, 4, 8, 7, 25, 4};

        for (int i = 0; i < numerador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    //lançar a exception aqui
                    throw new Exception("Número impar, divisão não exata!");
                }
                System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Aconteceu um erro aritmético ou de limite de array... ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
//                System.out.println("Aconteceu um erro genérico. " + e.getMessage());
            }
        }
    }
}
