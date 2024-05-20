package aula11_enums;
import java.util.ArrayList;

/*

    WRAPPERS são classes que encapsulam tipos de dados primitivos em objetos.
    Eles são úteis para quando você precisa tratar os tipos primitivos como objetos,
    por exemplo, quando trabalha com coleções como ArrayList, que não suportam tipos primitivos.

    - AUTOBOXING: O processo automático de converter um tipo primitivo em seu equivalente wrapper.
    - AUTOUNBOXING: O processo automático de converter um wrapper em seu tipo primitivo correspondente.

    Métodos utilitários: Classes wrapper fornecem vários métodos utilitários, como conversões entre tipos, comparações, etc.


 */

public class Wraps {
    public static void  main (String [] args) {

        Integer x = new Integer(1);
        Integer xx = new Integer("1");      //String
        Short s = new Short((short) 2);     // Short e Byte usam o cast (short/byte)
        Byte b = new Byte((byte) 5);
        Boolean o = new Boolean(false);
        Double d = new Double(4.5);
        Float f = new Float(3.14);
        Character c = new Character('h');
        Long l = new Long(3);
        Integer m = Integer.valueOf("9");

        System.out.println(".:: WRAPS ::.");

        // Usar as variaveis '.' para acessar os métodos
        System.out.println("Imprimindo o valor de um double e 'convertendo' para inteiro: " + d.intValue());
        System.out.println("Valor do float: " + f.floatValue());

        // Comparando valores usa-se o .equals()
        Integer n1 = new Integer(100);
        Integer n2 = new Integer(100);
        System.out.println(x == xx);
        System.out.println(n1 == n2);   // return : false

        System.out.println(x.equals(xx));
        System.out.println(n1.equals(n2));



        // Tipo primitivo
        int num = 10;

        // Wrapping (boxing) - Convertendo um tipo primitivo para um objeto wrapper
        Integer wrappedNum = Integer.valueOf(num);

        // Unwrapping (unboxing) - Convertendo um objeto wrapper de volta para um tipo primitivo
        int unwrappedNum = wrappedNum.intValue();

        // Autoboxing e Autounboxing (realizados automaticamente pelo compilador)
        Integer autoWrappedNum = num; // Autoboxing
        int autoUnwrappedNum = wrappedNum; // Autounboxing

        System.out.println("Primitive: " + num);
        System.out.println("Wrapped: " + wrappedNum);
        System.out.println("Unwrapped: " + unwrappedNum);
        System.out.println("Auto Wrapped: " + autoWrappedNum);
        System.out.println("Auto Unwrapped: " + autoUnwrappedNum);


        // As classes de coleções (COLLECTIONS) em Java (ArrayList, HashMap, etc.) trabalham com objetos,
        // não com tipos primitivos, então os wrappers são necessários para armazenar tipos primitivos em collections.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Autoboxing: int 10 é convertido para Integer 10
        int num2 = list.get(0); // Autounboxing: Integer 10 é convertido para int 10
    }
}
