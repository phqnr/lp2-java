package aula08_erros;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


/*
    - ao utilizar 'throws', o método informa que os chamadores desse método 'Exception' devem lidar com as exceções que podem aparecer;

    - no exemplo abaixo, na função 'lerNumero()' podem ocorrer erros durante a execução, então ao declarar, o programador informa que quando essa função for
      chamada, é necessário lidar com as possíveis exceções que surgir;

    - na função main, a função 'lerNumero()' é chamada e as exceções estão sendo tratadas por meio do bloco try-catch;

    - no caso abaixo, ao inserir um numero decimal corretamente, o programa retorna o número lido;
      caso insira um valor incorreto, é retornado a linha 38;

    - o método 'e.printStackTrace();' imprime a lista dos erros apresentados;
      comente a linha e entenda como funciona;

 */


public class Throws {
    public static double lerNumero() throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double num = sc.nextDouble();
        return num;
    }

    public static void main(String[] args) {
        System.out.print("Informe um número decimal: ");
        try {
            double num = lerNumero();
            System.out.println("Número lido: " + num);
//        } catch (InputMismatchException e) {
//            System.out.println("Número inválido!");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu um erro...");
            e.printStackTrace();
        }
    }
}