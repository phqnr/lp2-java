package aula08_erros;

/*
    1. a classe HerancaException define uma classe interna NaoInteiroException, que é uma subclasse de Exception;
       essa exceção é usada para representar situações em que a divisão entre dois números não resulta em um número inteiro;

    2. dentro do loop for, há uma estrutura try-catch, onde o bloco try, a divisão entre o numerador e o denominador é realizada;
       se o numerador for ímpar, uma exceção NaoInteiroException é lançada;

    3. no bloco catch, as exceções do tipo ArithmeticException, ArrayIndexOutOfBoundsException e NaoInteiroException são capturadas e tratadas;
       para a exceção NaoInteiroException, a mensagem da exceção é impressa usando e.getMessage().

 */

public class HerancaException {

    public static class NaoInteiroException extends Exception {
        protected int num;
        protected int denom;

        public NaoInteiroException(int num, int denom) {
            super();
            this.num = num;
            this.denom = denom;
        }

        @Override
        public String toString () {
            return "Resultado de " + num + "/" + denom + " não é inteiro.";
        }
    }

    public static void main (String [] args) {
        int[] num = {3, 4, 5, 8, 5, 16, 32, 21, 64, 128};
        int[] denom = {2, 0, 4, 8, 7, 25, 4};

        for (int i = 0; i < num.length; i++) {
            try {
                if (num[i] % 2 != 0) {
//                    throw new Exception("Número impar, divisão não exata!");
                    throw new NaoInteiroException(num[i], denom[i]);
                }
                System.out.println(num[i] + "/" + denom[i] + " = " + (num[i]/denom[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NaoInteiroException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
